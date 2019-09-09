package com.imperiouspi.generalmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RopeBlock extends Block {
    public RopeBlock() {
        super(Properties.create(Material.CARPET)
                .sound(SoundType.CLOTH)
                .hardnessAndResistance(2.0f)
        );
        setRegistryName("ropeblock");
    }
}
