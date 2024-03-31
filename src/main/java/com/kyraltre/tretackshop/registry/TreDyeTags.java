package com.kyraltre.tretackshop.registry;

import com.kyraltre.tretackshop.TreTackShop;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;

public class TreDyeTags {
    //for dying items
    public static final Tags.IOptionalNamedTag<Item> DYE_1 = ItemTags.createOptional(TreTackShop.resloc("dyes/rose"));
    public static final Tags.IOptionalNamedTag<Item> DYE_2 = ItemTags.createOptional(TreTackShop.resloc("dyes/salmon"));
    public static final Tags.IOptionalNamedTag<Item> DYE_3 = ItemTags.createOptional(TreTackShop.resloc("dyes/sunshine"));
    public static final Tags.IOptionalNamedTag<Item> DYE_4 = ItemTags.createOptional(TreTackShop.resloc("dyes/mint"));
    public static final Tags.IOptionalNamedTag<Item> DYE_5 = ItemTags.createOptional(TreTackShop.resloc("dyes/arctic"));
    public static final Tags.IOptionalNamedTag<Item> DYE_6 = ItemTags.createOptional(TreTackShop.resloc("dyes/lavender"));
    public static final Tags.IOptionalNamedTag<Item> DYE_7 = ItemTags.createOptional(TreTackShop.resloc("dyes/fuchsia"));
    public static final Tags.IOptionalNamedTag<Item> DYE_8 = ItemTags.createOptional(TreTackShop.resloc("dyes/ruby"));
    public static final Tags.IOptionalNamedTag<Item> DYE_9 = ItemTags.createOptional(TreTackShop.resloc("dyes/dandelion"));
    public static final Tags.IOptionalNamedTag<Item> DYE_10 = ItemTags.createOptional(TreTackShop.resloc("dyes/emerald"));
    public static final Tags.IOptionalNamedTag<Item> DYE_11 = ItemTags.createOptional(TreTackShop.resloc("dyes/navy"));
    public static final Tags.IOptionalNamedTag<Item> DYE_12 = ItemTags.createOptional(TreTackShop.resloc("dyes/orchid"));
    public static final Tags.IOptionalNamedTag<Item> DYE_13 = ItemTags.createOptional(TreTackShop.resloc("dyes/creamsicle"));
    public static final Tags.IOptionalNamedTag<Item> DYE_14 = ItemTags.createOptional(TreTackShop.resloc("dyes/topaz"));


    // FOR TONING PASTEL OR JEWEL TONE
    public static final Tags.IOptionalNamedTag<Item> TONER_PASTEL = ItemTags.createOptional(TreTackShop.resloc("dyes/toner_pastel"));
    public static final Tags.IOptionalNamedTag<Item> TONER_JEWEL = ItemTags.createOptional(TreTackShop.resloc("dyes/toner_jewel"));


    public TreDyeTags() {

    }
}
