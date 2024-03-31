package com.kyraltre.tretackshop.item;

import com.kyraltre.tretackshop.registry.AwardShopItems;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class TackShopCreativeModTab {
    public static final ItemGroup TRETACK_TAB = new ItemGroup("tretacktab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(TackShopItems.BUTTERFLY.get());
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }.setBackgroundImage(new ResourceLocation("minecraft", "textures/gui/container/creative_inventory/tab_item_search.png"));

    public static final ItemGroup TREAWARD_TAB = new ItemGroup("treawardtab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(AwardShopItems.RIBBON_THREE_TAILS_GRAND.get()); //this item is the icon of the tab
        }
        @Override
        public boolean hasSearchBar() { return true; }



    }.setBackgroundImage(new ResourceLocation("minecraft","textures/gui/container/creative_inventory/tab_item_search.png"));


}