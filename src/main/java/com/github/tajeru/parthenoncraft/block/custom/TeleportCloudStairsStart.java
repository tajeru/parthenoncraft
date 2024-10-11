package com.github.tajeru.parthenoncraft.block.custom;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import com.github.tajeru.parthenoncraft.world.dimension.ModDimensions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.Entity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class TeleportCloudStairsStart extends StairsBlock {

    // sブロックとeブロックのリンクを管理するためのマップ
    private static final Map<BlockPos, BlockPos> sToEMap = new HashMap<>();

    public TeleportCloudStairsStart(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof ServerPlayerEntity player) {
            // Parthenonディメンションを取得
            ServerWorld parthenonDim = player.getServer().getWorld(ModDimensions.PARTHENONDIM_LEVEL_KEY);

            if (parthenonDim != null) {
                // sブロックの座標から、リンクされたeブロックの座標を取得
                BlockPos eBlockPos = sToEMap.get(pos);

                // Eブロックがまだリンクされていない場合に動的生成
                if (eBlockPos == null) {
                    // Parthenonディメンションで新しいEブロックを生成
                    eBlockPos = new BlockPos(pos.getX() + 200, pos.getY() + 150, pos.getZ());
                    parthenonDim.setBlockState(eBlockPos, ModBlocks.TELEPORT_CLOUD_STAIRS_END.getDefaultState());

                    // SブロックとEブロックのリンクを保存
                    sToEMap.put(pos, eBlockPos);
                }

                // プレイヤーを生成したEブロックの位置にテレポート
                Vec3d teleportPos = new Vec3d(eBlockPos.getX(), eBlockPos.getY() + 1, eBlockPos.getZ());
                player.teleport(parthenonDim, teleportPos.x, teleportPos.y, teleportPos.z, player.getYaw(), player.getPitch());
                player.sendMessage(Text.literal("Teleported to the Parthenon!"), false);
            } else {
                player.sendMessage(Text.literal("No linked structure found!"), false);
            }
        }
    }

}
