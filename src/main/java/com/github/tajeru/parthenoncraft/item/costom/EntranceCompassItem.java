package com.github.tajeru.parthenoncraft.item.costom;

import net.minecraft.item.CompassItem;
;

public class EntranceCompassItem extends CompassItem {

    // ターゲットとなる構造物の名前を指定 (例: Entrance)
    private static final String TARGET_STRUCTURE = "parthenoncraft:entrance";

    public EntranceCompassItem(Settings settings) {
        super(settings);
    }
}
