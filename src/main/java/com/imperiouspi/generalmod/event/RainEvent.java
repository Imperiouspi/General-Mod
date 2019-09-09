package com.imperiouspi.generalmod.event;

import com.imperiouspi.generalmod.NewRain;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;

@Cancelable
@Event.HasResult
public class RainEvent extends Event
{

    public RainEvent()
    {
        super();
    }

    public int strength()
    {
        return NewRain.getStrength();
    }
}