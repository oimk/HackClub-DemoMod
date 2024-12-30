package com.aidenj.playerevolutions.items;

import com.yourusername.PlayerEvolutions;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase(){
        super(new Item.Properties().group(PlayerEvolutions.TAB));
    }
}
