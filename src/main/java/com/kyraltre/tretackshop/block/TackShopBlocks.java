package com.kyraltre.tretackshop.block;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.block.custom.CloverTrophy;
import com.kyraltre.tretackshop.block.custom.HeartTrophy;
import com.kyraltre.tretackshop.block.custom.PumpkinTrophy;
import com.kyraltre.tretackshop.block.custom.SnowflakeTrophy;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class TackShopBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TreTackShop.MOD_ID);

    public static final RegistryObject<Block> PUMPKIN_GRAND = registerBlock("pumpkin_grand",
            () -> new PumpkinTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> PUMPKIN_RESERVE = registerBlock("pumpkin_reserve",
            () -> new PumpkinTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> SNOWFLAKE_GRAND = registerBlock("snowflake_grand", () ->
            new SnowflakeTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> SNOWFLAKE_RESERVE = registerBlock("snowflake_reserve",
            () -> new SnowflakeTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> HEART_GRAND = registerBlock("heart_grand", () ->
            new HeartTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).harvestLevel(1).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> HEART_RESERVE = registerBlock("heart_reserve",
            () -> new HeartTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

    public static final RegistryObject<Block> CLOVER_GRAND = registerBlock("clover_grand", () ->
            new CloverTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);
    public static final RegistryObject<Block> CLOVER_RESERVE = registerBlock("clover_reserve",
            () -> new CloverTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).notSolid().hardnessAndResistance(1.0F)
            ), TackShopCreativeModTab.TREAWARD_TAB);

//    public static final RegistryObject<Block> FLORAL_GOLD = registerBlock("floral_gold", () ->
//            new FloralTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().notSolid().hardnessAndResistance(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//    public static final RegistryObject<Block> FLORAL_SILVER = registerBlock("floral_silver", () ->
//            new FloralTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().notSolid().hardnessAndResistance(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//    public static final RegistryObject<Block> FLORAL_BRONZE = registerBlock("floral_bronze", () ->
//            new FloralTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().notSolid().hardnessAndResistance(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//
//    public static final RegistryObject<Block> SUN_TROPHY = registerBlock("sun_trophy", () ->
//            new CelestialTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().notSolid().hardnessAndResistance(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);
//    public static final RegistryObject<Block> MOON_TROPHY = registerBlock("moon_trophy",
//            () -> new CelestialTrophy(AbstractBlock.Properties.from(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().notSolid().hardnessAndResistance(1.0F)
//            ), TackShopCreativeModTab.TREAWARD_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           ItemGroup tab) {
            return TackShopItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().group(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
