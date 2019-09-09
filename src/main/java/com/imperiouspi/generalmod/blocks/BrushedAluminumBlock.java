package com.imperiouspi.generalmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;

public class BrushedAluminumBlock extends DirectionalBlock {
	public BrushedAluminumBlock() {
		super(Block.Properties.create(Material.IRON)
				.sound(SoundType.METAL)
				.hardnessAndResistance(2.0f)
		);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
		setRegistryName("brushedaluminumblock");
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		Direction dir;
		dir = context.getPlacementHorizontalFacing();
		if(dir == Direction.WEST){
			dir = Direction.EAST;
		}
		if(dir == Direction.SOUTH){
			dir = Direction.NORTH;
		}
		return this.getDefaultState().with(FACING, dir);
	}
}
