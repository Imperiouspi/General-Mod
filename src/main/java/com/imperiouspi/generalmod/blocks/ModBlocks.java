package com.imperiouspi.generalmod.blocks;

import com.imperiouspi.generalmod.PipeTE;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
	@ObjectHolder("generalmod:cardtableblock")
	public static CardTableBlock CARDTABLEBLOCK;

	@ObjectHolder("generalmod:pipeblock")
	public static PipeBlock PIPE;

	@ObjectHolder("generalmod:pumpblock")
	public static PumpBlock PUMP;

	@ObjectHolder("generalmod:ropeblock")
	public static RopeBlock ROPE;

	@ObjectHolder("generalmod:pipe")
	public static TileEntityType<PipeTE> PIPE_TE;

	@ObjectHolder("generalmod:sheetmetalblock")
	public static SheetMetalBlock SHEET_METAL;

	@ObjectHolder("generalmod:brushedaluminumblock")
	public static BrushedAluminumBlock BRUSHED_ALUMINUM;

	@ObjectHolder("generalmod:jadeblock")
	public static JadeBlock JADE;
}
