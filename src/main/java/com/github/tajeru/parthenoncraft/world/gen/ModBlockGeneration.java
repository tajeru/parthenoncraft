package com.github.tajeru.parthenoncraft.world.gen;

import com.github.tajeru.parthenoncraft.block.ModBlocks;
import com.github.tajeru.parthenoncraft.block.custom.TeleportCloudStairsStart;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModBlockGeneration {

    public static void generateStairsAndLink(ServerWorld overworld, ServerWorld ParthenonDim) {
        // sブロックをオーバーワールドのランダムな位置に生成
        BlockPos sPos = findSafePosition(overworld);
        overworld.setBlockState(sPos, ModBlocks.TELEPORT_CLOUD_STAIRS_START.getDefaultState());

        // eブロックをパルテノンディメンションのランダムな位置に生成
        BlockPos ePos = findSafePosition(ParthenonDim);
        ParthenonDim.setBlockState(ePos, ModBlocks.TELEPORT_CLOUD_STAIRS_END.getDefaultState());

        // sブロックとeブロックをリンク
        TeleportCloudStairsStart.linkBlocks(sPos, ePos);

        // 生成された座標をコンソールとチャットで表示
        System.out.println("s block generated at: " + sPos);
        overworld.getPlayers().forEach(player -> {
            player.sendMessage(Text.literal("s block generated at: " + sPos), false);
        });
    }

    // 安全な位置をランダムに探すメソッド
    private static BlockPos findSafePosition(World world) {
        int x = world.getRandom().nextInt(1000) - 500;  // ランダムに座標を生成
        int z = world.getRandom().nextInt(1000) - 500;
        int y = 100;  // 高さは100に固定

        BlockPos randomPos = new BlockPos(x, y, z);
        // 安全な位置かどうかを確認
        if (world.isAir(randomPos)) {
            return randomPos;
        }
        return findSafePosition(world);  // 安全でない場合は再帰的に再試行
    }
}
