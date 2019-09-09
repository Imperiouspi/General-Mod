package com.imperiouspi.generalmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import java.util.List;

import static com.imperiouspi.generalmod.blocks.ModBlocks.PIPE_TE;

public class PipeTE extends TileEntity implements ITickableTileEntity {

    public PipeTE() {
        super(PIPE_TE);
    }

    @Override
    public void tick() {
        if(world.isRemote){
            return;
        }

        if(world.isRaining()){
            List<? extends PlayerEntity> players = world.getPlayers();
            for(int i = 0; i < players.size(); i++){
                players.get(i).inventory.add(1, new ItemStack(Items.ACACIA_LEAVES));
            }
        }
    }
}
