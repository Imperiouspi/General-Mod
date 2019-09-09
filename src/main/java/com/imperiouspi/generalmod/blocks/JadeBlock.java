package com.imperiouspi.generalmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class JadeBlock extends Block {
	public JadeBlock() {
		super(Block.Properties.create(Material.ROCK)
				.sound(SoundType.STONE)
				.hardnessAndResistance(2.0f)
		);
		setRegistryName("jadeblock");
	}
}
