package com.kyraltre.tretackshop.registry;


import com.alaharranhonor.swem.blocks.TackBoxBlock;
import com.alaharranhonor.swem.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.items.tack.*;
import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class TackShopItems {
    public static final DeferredRegister<Item> ITEMS;

    // THIS IS FOR TACK ITEMS THAT __CAN__ BE CRAFTED
    public static final RegistryObject<Item> BUTTERFLY;
    public static final RegistryObject<Item> BUTTERFLY_MONARCH;
    public static final RegistryObject<Item> RAINBOW_INA_BOTTLE;
    public static final List<RegistryObject<Item>> FLAGS;
    public static final List<RegistryObject<Item>> FLAGS_BUTTERFLY;
    public static final List<RegistryObject<Item>> FLAGS_DYED;

    // TACK ITEMS

    // DYED TACK
    //public static final RegistryObject<DyedPastureBlanket> PASTURE_BLANKET_DYED;

    //ONE OFF TACK
    public static final RegistryObject<AdventureBridleItem> PELHAM_BRIDLE_BLACK;
    public static final RegistryObject<AdventureBridleItem> PELHAM_BRIDLE_BROWN;
    public static final RegistryObject<EnglishBridleItem> MEDIEVAL_BRIDLE_BLACK;
    public static final RegistryObject<EnglishBridleItem> MEDIEVAL_BRIDLE_BROWN;
    public static final RegistryObject<AdventureBridleItem> MOON_BRIDLE_DOUBLE;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE;
    public static final RegistryObject<WesternSaddleItem> BAREBACK_SADDLE;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET;
    public static final RegistryObject<WesternGirthStrapItem> BAREBACK_GIRTH_STRAP;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_BROWN;
    public static final RegistryObject<WesternSaddleItem> BAREBACK_SADDLE_BROWN;
    public static final RegistryObject<WesternGirthStrapItem> BAREBACK_GIRTH_STRAP_BROWN;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_BEIGE;
    public static final RegistryObject<WesternSaddleItem> BAREBACK_SADDLE_BEIGE;
    public static final RegistryObject<WesternGirthStrapItem> BAREBACK_GIRTH_STRAP_BEIGE;
    public static final RegistryObject<EnglishBlanketItem> HUNTER_BLANKET;
    public static final RegistryObject<EnglishBridleItem> BITLESS_BRIDLE_WHITE;
    public static final RegistryObject<WesternSaddleItem> BAREBACK_SADDLE_BLACK;
    public static final RegistryObject<WesternGirthStrapItem> BAREBACK_GIRTH_STRAP_WHITE;

    public static final RegistryObject<WesternSaddleItem> DRESSAGE_SADDLE;
    public static final RegistryObject<EnglishGirthStrap> DRESSAGE_GIRTH_STRAP;
    public static final RegistryObject<WesternBlanketItem> DRESSAGE_BLANKET;
    public static final RegistryObject<EnglishSaddleItem> RACING_SADDLE_BROWN;
    public static final RegistryObject<EnglishSaddleItem> RACING_SADDLE_BLACK;


    // RAINBOW TACK
    public static final RegistryObject<HalterItem> HALTER_RAINBOW;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW;
    public static final RegistryObject<PastureBlanketItem> PASTURE_BLANKET_RAINBOW_ARMORED;
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_RAINBOW;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_RAINBOW;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_RAINBOW;
    public static final RegistryObject<AdventureLegWraps> ADVENTURE_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<LegWrapsItem> ENGLISH_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<LegWrapsItem> WESTERN_LEG_WRAPS_RAINBOW;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_RAINBOW;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_RAINBOW;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_RAINBOW;
    public static final RegistryObject<AdventureBreastCollarItem> ADVENTURE_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_RAINBOW;
    public static final RegistryObject<AdventureBreastCollarItem> QUARTER_SHEET_BLACK_RAINBOW;
    public static final RegistryObject<AdventureBreastCollarItem> QUARTER_SHEET_WHITE_RAINBOW;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_RAINBOW;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_RAINBOW;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_RAINBOW;
    public static final RegistryObject<AdventureGirthStrapItem> ADVENTURE_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_RAINBOW;
    public static final RegistryObject<SWEMHorseArmorItem> AMETHYST_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<SWEMHorseArmorItem> IRON_HORSE_ARMOR_RAINBOW;
    public static final RegistryObject<SaddlebagItem> SADDLE_BAG_RAINBOW;
    public static final RegistryObject<WesternBlanketItem> BAREBACK_BLANKET_RAINBOW;
    public static final RegistryObject<EnglishBridleItem> CLOTH_BITLESS_BRIDLE_RAINBOW;

    // TRANSPARENT 'BAREBACK/LIBERTY' TACK
    public static final RegistryObject<AdventureBlanketItem> ADVENTURE_BLANKET_TRANS;
    public static final RegistryObject<EnglishBlanketItem> ENGLISH_BLANKET_TRANS;
    public static final RegistryObject<WesternBlanketItem> WESTERN_BLANKET_TRANS;
    public static final RegistryObject<AdventureLegWraps> ADVENTURE_LEG_WRAPS_TRANS;
    public static final RegistryObject<AdventureSaddleItem> ADVENTURE_SADDLE_TRANS;
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_TRANS;
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_TRANS;
    public static final RegistryObject<AdventureBreastCollarItem> ADVENTURE_BREAST_COLLAR_TRANS;
    public static final RegistryObject<AdventureBridleItem> ADVENTURE_BRIDLE_TRANS;
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_TRANS;
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_TRANS;
    public static final RegistryObject<AdventureGirthStrapItem> ADVENTURE_GIRTH_STRAP_TRANS;
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_TRANS;
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_TRANS;

    // CRAFTABLE NUMBERED TACK
    public static final List<RegistryObject<HalterItem>> HALTERS;
    public static final List<RegistryObject<HalterItem>> FLYMASKS;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKETS_ARMORED;
    public static final List<RegistryObject<AdventureBlanketItem>> ADVENTURE_BLANKETS;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKETS;
    public static final List<RegistryObject<AdventureLegWraps>> ADVENTURE_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> ENGLISH_LEG_WRAPS;
    public static final List<RegistryObject<LegWrapsItem>> WESTERN_LEG_WRAPS;
    public static final List<RegistryObject<AdventureSaddleItem>> ADVENTURE_SADDLES;
    public static final List<RegistryObject<WesternSaddleItem>> WESTERN_SADDLES;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLES;
    public static final List<RegistryObject<AdventureBreastCollarItem>> ADVENTURE_BREAST_COLLARS;
    public static final List<RegistryObject<WesternBreastCollarItem>> WESTERN_BREAST_COLLARS;
    public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLARS;
    public static final List<RegistryObject<EnglishBreastCollar>> CLOTH_BREAST_COLLARS;
    public static final List<RegistryObject<AdventureBreastCollarItem>> QUARTER_SHEETS_DYED;
    public static final List<RegistryObject<AdventureBreastCollarItem>> QUARTER_SHEETS_NUMBERED;
    public static final List<RegistryObject<AdventureBridleItem>> ADVENTURE_BRIDLES;
    public static final List<RegistryObject<WesternBridleItem>> WESTERN_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> CLOTH_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> CLOTH_BITLESS_BRIDLES;
    public static final List<RegistryObject<EnglishBridleItem>> CLOTH_BITLESS_BRIDLES_DYED;
    public static final List<RegistryObject<WesternBlanketItem>> BAREBACK_BLANKETS;
    public static final List<RegistryObject<WesternBlanketItem>> BAREBACK_BLANKETS_DYED;
    public static final List<RegistryObject<AdventureGirthStrapItem>> ADVENTURE_GIRTH_STRAPS;
    public static final List<RegistryObject<WesternGirthStrapItem>> WESTERN_GIRTH_STRAPS;
    public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAPS;
    public static final List<RegistryObject<EnglishGirthStrap>> CLOTH_GIRTH_STRAPS;
    public static final List<RegistryObject<HalterItem>> FLYMASKS_DYED;
    public static final List<RegistryObject<SaddlebagItem>> SADDLE_BAGS;
    public static final List<RegistryObject<SWEMHorseArmorItem>> CLOTH_ARMOR;
    public static final List<RegistryObject<SWEMHorseArmorItem>> CLOTH_ARMOR_DYED;
    public static final List<RegistryObject<AdventureGirthStrapItem>> ADVENTURE_GIRTH_STRAPS_DYED;
    public static final List<RegistryObject<AdventureBridleItem>> ADVENTURE_BRIDLES_DYED;
    public static final List<RegistryObject<AdventureBreastCollarItem>> ADVENTURE_BREAST_COLLARS_DYED;
    public static final List<RegistryObject<AdventureSaddleItem>> ADVENTURE_SADDLES_DYED;
    public static final List<RegistryObject<AdventureLegWraps>> ADVENTURE_LEG_WRAPS_DYED;
    public static final List<RegistryObject<AdventureBlanketItem>> ADVENTURE_BLANKETS_DYED;
    public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAPS_BLACK_DYED;
    public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLARS_BLACK_DYED;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLES_BLACK_DYED;
    public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLES_BLACK_DYED;
    public static final List<RegistryObject<EnglishGirthStrap>> CLOTH_GIRTH_STRAPS_DYED;
    public static final List<RegistryObject<EnglishBridleItem>> CLOTH_BRIDLES_DYED;
    public static final List<RegistryObject<EnglishBreastCollar>> CLOTH_BREAST_COLLARS_DYED;
    // public static final List<RegistryObject<EnglishGirthStrap>> ENGLISH_GIRTH_STRAPS_BROWN_DYED;
    // public static final List<RegistryObject<EnglishBreastCollar>> ENGLISH_BREAST_COLLARS_BROWN_DYED;
    // public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLES_BROWN_DYED;
    // public static final List<RegistryObject<EnglishSaddleItem>> ENGLISH_SADDLES_BROWN_DYED;
    public static final List<RegistryObject<TackBoxBlock>> TACKBOXES;

    public TackShopItems() {
    }

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TreTackShop.MOD_ID);

        BUTTERFLY = ITEMS.register("butterfly",
                () -> new Item(new Item.Properties().group(TackShopCreativeModTab.TRETACK_TAB)));
        BUTTERFLY_MONARCH = ITEMS.register("butterfly_monarch",
                () -> new Item(new Item.Properties().group(TackShopCreativeModTab.TRETACK_TAB)));

        RAINBOW_INA_BOTTLE = ITEMS.register("rainbow_ina_bottle",
                () -> new Item(new Item.Properties().group(TackShopCreativeModTab.TRETACK_TAB)));
        // This is what we use to make the rainbow tack

// TACK ITEMS

        // Dyed Items
//        PASTURE_BLANKET_DYED = ITEMS.register("pasture_blanket_dyed",
//                () -> new DyedPastureBlanket(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
//                        "pasture_blanket_dyed", new Item.Properties()
//                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        // ONE OFF TACK
        PELHAM_BRIDLE_BLACK = ITEMS.register("pelham_bridle_black",
                () -> new AdventureBridleItem("pelham_bridle_black", "pelham_black", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        PELHAM_BRIDLE_BROWN = ITEMS.register("pelham_bridle_brown",
                () -> new AdventureBridleItem("pelham_bridle_brown", "pelham_brown", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        MOON_BRIDLE_DOUBLE = ITEMS.register("moon_bridle_double",
                () -> new AdventureBridleItem("moon_bridle_double", "moon_double", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        MEDIEVAL_BRIDLE_BLACK = ITEMS.register("medieval_bridle_black",
                () -> new EnglishBridleItem("medieval_bridle_black", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        MEDIEVAL_BRIDLE_BROWN = ITEMS.register("medieval_bridle_brown",
                () -> new EnglishBridleItem("medieval_bridle_brown", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        BITLESS_BRIDLE = ITEMS.register("english_bridle_bitless",
                () -> new EnglishBridleItem("english_bridle_bitless", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        BAREBACK_SADDLE_BLACK = ITEMS.register("bareback_saddle_black",
                () -> new WesternSaddleItem("bareback_saddle_black", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        BAREBACK_BLANKET = ITEMS.register("bareback_blanket",
                () -> new WesternBlanketItem("bareback_blanket", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        BAREBACK_GIRTH_STRAP = ITEMS.register("bareback_girth_strap",
                () -> new WesternGirthStrapItem("bareback_girth_strap", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        BITLESS_BRIDLE_BROWN = ITEMS.register("english_bridle_bitless_brown",
                () -> new EnglishBridleItem("english_bridle_bitless_brown", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        BAREBACK_SADDLE_BROWN = ITEMS.register("bareback_saddle_brown",
                () -> new WesternSaddleItem("bareback_saddle_brown", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        BAREBACK_GIRTH_STRAP_BROWN = ITEMS.register("bareback_girth_strap_brown",
                () -> new WesternGirthStrapItem("bareback_girth_strap_brown", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        BITLESS_BRIDLE_BEIGE = ITEMS.register("english_bridle_bitless_beige",
                () -> new EnglishBridleItem("english_bridle_bitless_beige", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        BAREBACK_SADDLE_BEIGE = ITEMS.register("bareback_saddle_beige",
                () -> new WesternSaddleItem("bareback_saddle_beige", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        BAREBACK_GIRTH_STRAP_BEIGE = ITEMS.register("bareback_girth_strap_beige",
                () -> new WesternGirthStrapItem("bareback_girth_strap_beige", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        BITLESS_BRIDLE_WHITE = ITEMS.register("english_bridle_bitless_white",
                () -> new EnglishBridleItem("english_bridle_bitless_white", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        BAREBACK_SADDLE = ITEMS.register("bareback_saddle",
                () -> new WesternSaddleItem("bareback_saddle", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        BAREBACK_GIRTH_STRAP_WHITE = ITEMS.register("bareback_girth_strap_white",
                () -> new WesternGirthStrapItem("bareback_girth_strap_white", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        DRESSAGE_SADDLE = ITEMS.register("dressage_saddle",
                () -> new WesternSaddleItem("dressage_saddle", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        DRESSAGE_BLANKET = ITEMS.register("dressage_blanket",
                () -> new WesternBlanketItem("dressage_blanket", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        DRESSAGE_GIRTH_STRAP = ITEMS.register("dressage_girth_strap",
                () -> new EnglishGirthStrap("dressage_girth_strap", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        RACING_SADDLE_BROWN = ITEMS.register("racing_saddle_brown",
                () -> new EnglishSaddleItem("racing_saddle_brown", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        RACING_SADDLE_BLACK = ITEMS.register("racing_saddle_black",
                () -> new EnglishSaddleItem("racing_saddle_black", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        HUNTER_BLANKET = ITEMS.register("hunter_blanket",
                () -> new EnglishBlanketItem("hunter_blanket", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        // Rainbow Tack
        HALTER_RAINBOW = ITEMS.register("halter_rainbow",
                () -> new HalterItem("halter_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        ADVENTURE_SADDLE_RAINBOW = ITEMS.register("adventure_saddle_rainbow",
                () -> new AdventureSaddleItem("adventure_saddle_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        ADVENTURE_BLANKET_RAINBOW = ITEMS.register("adventure_blanket_rainbow",
                () -> new AdventureBlanketItem("adventure_blanket_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ADVENTURE_BREAST_COLLAR_RAINBOW = ITEMS.register("adventure_breast_collar_rainbow",
                () -> new AdventureBreastCollarItem("adventure_breast_collar_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ADVENTURE_LEG_WRAPS_RAINBOW = ITEMS.register("adventure_leg_wraps_rainbow",
                () -> new AdventureLegWraps("adventure_leg_wraps_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64)));
        ADVENTURE_BRIDLE_RAINBOW = ITEMS.register("adventure_bridle_rainbow",
                () -> new AdventureBridleItem("adventure_bridle_rainbow", "adventure_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ADVENTURE_GIRTH_STRAP_RAINBOW = ITEMS.register("adventure_girth_strap_rainbow",
                () -> new AdventureGirthStrapItem("adventure_girth_strap_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        SADDLE_BAG_RAINBOW = ITEMS.register("saddle_bag_rainbow", () ->
                new SaddlebagItem("saddle_bag_rainbow", (new Item.Properties()).group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        AMETHYST_HORSE_ARMOR_RAINBOW = ITEMS.register("amethyst_horse_armor_rainbow", () ->
                new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.AMETHYST, 50,
                        "amethyst_rainbow", (new Item.Properties()).group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        IRON_HORSE_ARMOR_RAINBOW = ITEMS.register("iron_horse_armor_rainbow", () ->
                new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.IRON, 30,
                        "iron_rainbow", (new Item.Properties()).group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));


        WESTERN_SADDLE_RAINBOW = ITEMS.register("western_saddle_rainbow",
                () -> new WesternSaddleItem("western_saddle_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        WESTERN_BLANKET_RAINBOW = ITEMS.register("western_blanket_rainbow",
                () -> new WesternBlanketItem("western_blanket_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        WESTERN_BREAST_COLLAR_RAINBOW = ITEMS.register("western_breast_collar_rainbow",
                () -> new WesternBreastCollarItem("western_breast_collar_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        WESTERN_LEG_WRAPS_RAINBOW = ITEMS.register("western_leg_wraps_rainbow",
                () -> new WesternLegWraps("western_leg_wraps_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64)));
        WESTERN_BRIDLE_RAINBOW = ITEMS.register("western_bridle_rainbow",
                () -> new WesternBridleItem("western_bridle_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        WESTERN_GIRTH_STRAP_RAINBOW = ITEMS.register("western_girth_strap_rainbow",
                () -> new WesternGirthStrapItem("western_girth_strap_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        ENGLISH_SADDLE_RAINBOW = ITEMS.register("english_saddle_rainbow",
                () -> new EnglishSaddleItem("english_saddle_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        ENGLISH_BLANKET_RAINBOW = ITEMS.register("english_blanket_rainbow",
                () -> new EnglishBlanketItem("english_blanket_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ENGLISH_BREAST_COLLAR_RAINBOW = ITEMS.register("english_breast_collar_rainbow",
                () -> new EnglishBreastCollar("english_breast_collar_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ENGLISH_LEG_WRAPS_RAINBOW = ITEMS.register("english_leg_wraps_rainbow",
                () -> new EnglishLegWraps("english_leg_wraps_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64)));
        ENGLISH_BRIDLE_RAINBOW = ITEMS.register("english_bridle_rainbow",
                () -> new EnglishBridleItem("english_bridle_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ENGLISH_GIRTH_STRAP_RAINBOW = ITEMS.register("english_girth_strap_rainbow",
                () -> new EnglishGirthStrap("english_girth_strap_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        CLOTH_BITLESS_BRIDLE_RAINBOW = ITEMS.register("cloth_bitless_bridle_rainbow",
                () -> new EnglishBridleItem("cloth_bitless_bridle_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        BAREBACK_BLANKET_RAINBOW = ITEMS.register("bareback_blanket_rainbow",
                () -> new WesternBlanketItem("bareback_blanket_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        PASTURE_BLANKET_RAINBOW = ITEMS.register("pasture_blanket_rainbow",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                        "pasture_blanket_rainbow", new Item.Properties()
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        PASTURE_BLANKET_RAINBOW_ARMORED = ITEMS.register("pasture_blanket_rainbow_armored",
                () -> new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                        "pasture_blanket_rainbow_armored", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        QUARTER_SHEET_BLACK_RAINBOW = ITEMS.register("quarter_sheet_black_rainbow",
                () -> new AdventureBreastCollarItem("quarter_sheet_black_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        QUARTER_SHEET_WHITE_RAINBOW = ITEMS.register("quarter_sheet_white_rainbow",
                () -> new AdventureBreastCollarItem("quarter_sheet_white_rainbow", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));


        // TRANSPARENT 'BAREBACK/LIBERTY' TACK
        ADVENTURE_SADDLE_TRANS = ITEMS.register("adventure_saddle_trans",
                () -> new AdventureSaddleItem("adventure_saddle_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        ADVENTURE_BLANKET_TRANS = ITEMS.register("adventure_blanket_trans",
                () -> new AdventureBlanketItem("adventure_blanket_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ADVENTURE_BREAST_COLLAR_TRANS = ITEMS.register("adventure_breast_collar_trans",
                () -> new AdventureBreastCollarItem("adventure_breast_collar_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ADVENTURE_LEG_WRAPS_TRANS = ITEMS.register("adventure_leg_wraps_trans",
                () -> new AdventureLegWraps("adventure_leg_wraps_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64)));
        ADVENTURE_BRIDLE_TRANS = ITEMS.register("adventure_bridle_trans",
                () -> new AdventureBridleItem("adventure_bridle_trans", "adventure_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ADVENTURE_GIRTH_STRAP_TRANS = ITEMS.register("adventure_girth_strap_trans",
                () -> new AdventureGirthStrapItem("adventure_girth_strap_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        WESTERN_SADDLE_TRANS = ITEMS.register("western_saddle_trans",
                () -> new WesternSaddleItem("western_saddle_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        WESTERN_BLANKET_TRANS = ITEMS.register("western_blanket_trans",
                () -> new WesternBlanketItem("western_blanket_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        WESTERN_BRIDLE_TRANS = ITEMS.register("western_bridle_trans",
                () -> new WesternBridleItem("western_bridle_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        WESTERN_GIRTH_STRAP_TRANS = ITEMS.register("western_girth_strap_trans",
                () -> new WesternGirthStrapItem("western_girth_strap_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        ENGLISH_SADDLE_TRANS = ITEMS.register("english_saddle_trans",
                () -> new EnglishSaddleItem("english_saddle_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1)));
        ENGLISH_BLANKET_TRANS = ITEMS.register("english_blanket_trans",
                () -> new EnglishBlanketItem("english_blanket_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ENGLISH_BRIDLE_TRANS = ITEMS.register("english_bridle_trans",
                () -> new EnglishBridleItem("english_bridle_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));
        ENGLISH_GIRTH_STRAP_TRANS = ITEMS.register("english_girth_strap_trans",
                () -> new EnglishGirthStrap("english_girth_strap_trans", (new Item.Properties())
                        .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16)));

        // Craftable Numbered Tack Items -- 12 Count Items
        HALTERS = new ArrayList<>();
        FLYMASKS = new ArrayList<>();
        PASTURE_BLANKETS = new ArrayList<>();
        PASTURE_BLANKETS_ARMORED = new ArrayList<>();
        ADVENTURE_BLANKETS = new ArrayList<>();
        WESTERN_BLANKETS = new ArrayList<>();
        ENGLISH_BLANKETS = new ArrayList<>();
        ENGLISH_LEG_WRAPS = new ArrayList<>();
        WESTERN_LEG_WRAPS = new ArrayList<>();
        ADVENTURE_LEG_WRAPS = new ArrayList<>();
        ADVENTURE_SADDLES = new ArrayList<>();
        WESTERN_SADDLES = new ArrayList<>();
        ENGLISH_SADDLES = new ArrayList<>();
        ADVENTURE_BREAST_COLLARS = new ArrayList<>();
        WESTERN_BREAST_COLLARS = new ArrayList<>();
        ENGLISH_BREAST_COLLARS = new ArrayList<>();
        CLOTH_BREAST_COLLARS = new ArrayList<>();
        ADVENTURE_BRIDLES = new ArrayList<>();
        WESTERN_BRIDLES = new ArrayList<>();
        ENGLISH_BRIDLES = new ArrayList<>();
        CLOTH_BRIDLES = new ArrayList<>();
        ADVENTURE_GIRTH_STRAPS = new ArrayList<>();
        WESTERN_GIRTH_STRAPS = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS = new ArrayList<>();
        CLOTH_GIRTH_STRAPS = new ArrayList<>();
        QUARTER_SHEETS_NUMBERED = new ArrayList<>();
        FLAGS = new ArrayList<>();
        FLAGS_BUTTERFLY = new ArrayList<>();
        SADDLE_BAGS = new ArrayList<>();
        CLOTH_ARMOR = new ArrayList<>();
        BAREBACK_BLANKETS = new ArrayList<>();
        CLOTH_BITLESS_BRIDLES = new ArrayList<>();
        TACKBOXES = new ArrayList<>();
        QUARTER_SHEETS_DYED = new ArrayList<>();
        FLYMASKS_DYED = new ArrayList<>();
        FLAGS_DYED = new ArrayList<>();
        CLOTH_BITLESS_BRIDLES_DYED = new ArrayList<>();
        BAREBACK_BLANKETS_DYED = new ArrayList<>();
        ADVENTURE_SADDLES_DYED = new ArrayList<>();
        ADVENTURE_BLANKETS_DYED = new ArrayList<>();
        ADVENTURE_BRIDLES_DYED = new ArrayList<>();
        ADVENTURE_LEG_WRAPS_DYED  = new ArrayList<>();
        ADVENTURE_BREAST_COLLARS_DYED = new ArrayList<>();
        ADVENTURE_GIRTH_STRAPS_DYED = new ArrayList<>();
        CLOTH_ARMOR_DYED = new ArrayList<>();
        CLOTH_BREAST_COLLARS_DYED = new ArrayList<>();
        CLOTH_BRIDLES_DYED = new ArrayList<>();
        CLOTH_GIRTH_STRAPS_DYED = new ArrayList<>();
        ENGLISH_BRIDLES_BLACK_DYED = new ArrayList<>();
        ENGLISH_SADDLES_BLACK_DYED = new ArrayList<>();
        ENGLISH_GIRTH_STRAPS_BLACK_DYED = new ArrayList<>();
        ENGLISH_BREAST_COLLARS_BLACK_DYED = new ArrayList<>();
//        ENGLISH_BRIDLES_BROWN_DYED = new ArrayList<>();
//        ENGLISH_SADDLES_BROWN_DYED = new ArrayList<>();
//        ENGLISH_GIRTH_STRAPS_BROWN_DYED = new ArrayList<>();
//        ENGLISH_BREAST_COLLARS_BROWN_DYED = new ArrayList<>();

        int var1 = 15;
        int var2 = 1;


        while (var2 < var1) {
            //DyeColor color = var0[var2];
            int counter = var2;
            HALTERS.add(ITEMS.register("halter_" + counter, () ->
                    new HalterItem("halter_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            FLYMASKS.add(ITEMS.register("flymask_" + counter, () ->
                    new HalterItem("flymask_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            ADVENTURE_SADDLES.add(ITEMS.register("adventure_saddle_" + counter, () ->
                    new AdventureSaddleItem("adventure_saddle_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1))
            ));
            ADVENTURE_BLANKETS.add(ITEMS.register("adventure_blanket_" + counter, () ->
                    new AdventureBlanketItem("adventure_blanket_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ADVENTURE_BREAST_COLLARS.add(ITEMS.register("adventure_breast_collar_" + counter, () ->
                    new AdventureBreastCollarItem("adventure_breast_collar_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ADVENTURE_LEG_WRAPS.add(ITEMS.register("adventure_leg_wraps_" + counter, () ->
                    new AdventureLegWraps("adventure_leg_wraps_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64))
            ));
            ADVENTURE_BRIDLES.add(ITEMS.register("adventure_bridle_" + counter,
                    () -> new AdventureBridleItem("adventure_bridle_" + counter, "adventure_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ADVENTURE_GIRTH_STRAPS.add(ITEMS.register("adventure_girth_strap_" + counter,
                    () -> new AdventureGirthStrapItem("adventure_girth_strap_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            CLOTH_ARMOR.add(ITEMS.register("cloth_horse_armor_" + counter,
                    () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            SADDLE_BAGS.add(ITEMS.register("saddle_bag_" + counter, () ->
                    new SaddlebagItem("saddle_bag_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            WESTERN_SADDLES.add(ITEMS.register("western_saddle_" + counter, () ->
                    new WesternSaddleItem("western_saddle_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1))
            ));
            WESTERN_BLANKETS.add(ITEMS.register("western_blanket_" + counter, () ->
                    new WesternBlanketItem("western_blanket_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            WESTERN_BREAST_COLLARS.add(ITEMS.register("western_breast_collar_" + counter, () ->
                    new WesternBreastCollarItem("western_breast_collar_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            WESTERN_LEG_WRAPS.add(ITEMS.register("western_leg_wraps_" + counter, () ->
                    new WesternLegWraps("western_leg_wraps_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64))
            ));
            WESTERN_BRIDLES.add(ITEMS.register("western_bridle_" + counter,
                    () -> new WesternBridleItem("western_bridle_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            WESTERN_GIRTH_STRAPS.add(ITEMS.register("western_girth_strap_" + counter,
                    () -> new WesternGirthStrapItem("western_girth_strap_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            ENGLISH_SADDLES.add(ITEMS.register("english_saddle_" + counter, () ->
                    new EnglishSaddleItem("english_saddle_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1))
            ));
            ENGLISH_BLANKETS.add(ITEMS.register("english_blanket_" + counter, () ->
                    new EnglishBlanketItem("english_blanket_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ENGLISH_BREAST_COLLARS.add(ITEMS.register("english_breast_collar_" + counter, () ->
                    new EnglishBreastCollar("english_breast_collar_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ENGLISH_LEG_WRAPS.add(ITEMS.register("english_leg_wraps_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64))
            ));
            ENGLISH_BRIDLES.add(ITEMS.register("english_bridle_" + counter,
                    () -> new EnglishBridleItem("english_bridle_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ENGLISH_GIRTH_STRAPS.add(ITEMS.register("english_girth_strap_" + counter,
                    () -> new EnglishGirthStrap("english_girth_strap_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            CLOTH_BREAST_COLLARS.add(ITEMS.register("cloth_breast_collar_" + counter, () ->
                    new EnglishBreastCollar("cloth_breast_collar_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            CLOTH_BRIDLES.add(ITEMS.register("cloth_bridle_" + counter,
                    () -> new EnglishBridleItem("cloth_bridle_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            CLOTH_GIRTH_STRAPS.add(ITEMS.register("cloth_girth_strap_" + counter,
                    () -> new EnglishGirthStrap("cloth_girth_strap_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            CLOTH_BITLESS_BRIDLES.add(ITEMS.register("cloth_bitless_bridle_" + counter,
                    () -> new EnglishBridleItem("cloth_bitless_bridle_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            BAREBACK_BLANKETS.add(ITEMS.register("bareback_blanket_" + counter, () ->
                    new WesternBlanketItem("bareback_blanket_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            PASTURE_BLANKETS.add(ITEMS.register("pasture_blanket_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            PASTURE_BLANKETS_ARMORED.add(ITEMS.register("pasture_blanket_" + counter + "_armored", () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.DIAMOND, 37,
                            "pasture_blanket_" + counter + "_armored", (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            QUARTER_SHEETS_NUMBERED.add(ITEMS.register("quarter_sheet_" + counter, () ->
                    new AdventureBreastCollarItem("quarter_sheet_" + counter, (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            FLAGS.add(ITEMS.register("flag_" + counter, () ->
                    new Item((new Item.Properties().group(TackShopCreativeModTab.TRETACK_TAB)))));
            FLAGS_BUTTERFLY.add(ITEMS.register("flag_butterfly_" + counter, () ->
                    new Item((new Item.Properties().group(TackShopCreativeModTab.TRETACK_TAB)))));

            ++var2;
        }


        for (DyeColor color : DyeColor.values()) {

            ADVENTURE_SADDLES_DYED.add(ITEMS.register("adventure_saddle_" + color.getString(), () ->
                    new AdventureSaddleItem("adventure_saddle_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1))
            ));
            ADVENTURE_BLANKETS_DYED.add(ITEMS.register("adventure_blanket_" + color.getString(), () ->
                    new AdventureBlanketItem("adventure_blanket_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ADVENTURE_BREAST_COLLARS_DYED.add(ITEMS.register("adventure_breast_collar_" + color.getString(), () ->
                    new AdventureBreastCollarItem("adventure_breast_collar_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ADVENTURE_LEG_WRAPS_DYED.add(ITEMS.register("adventure_leg_wraps_" + color.getString(), () ->
                    new AdventureLegWraps("adventure_leg_wraps_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(64))
            ));
            ADVENTURE_BRIDLES_DYED.add(ITEMS.register("adventure_bridle_" + color.getString(),
                    () -> new AdventureBridleItem("adventure_bridle_" + color.getString(), "adventure_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ADVENTURE_GIRTH_STRAPS_DYED.add(ITEMS.register("adventure_girth_strap_" + color.getString(),
                    () -> new AdventureGirthStrapItem("adventure_girth_strap_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            CLOTH_ARMOR_DYED.add(ITEMS.register("cloth_horse_armor_" + color.getString(),
                    () -> new SWEMHorseArmorItem(SWEMHorseArmorItem.HorseArmorTier.CLOTH, 10, "cloth_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            QUARTER_SHEETS_DYED.add(ITEMS.register("quarter_sheet_" + color.getString(), () ->
                    new AdventureBreastCollarItem("quarter_sheet_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            ENGLISH_SADDLES_BLACK_DYED.add(ITEMS.register("english_saddle_black_" + color.getString(), () ->
                    new EnglishSaddleItem("english_saddle_black_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1))
            ));
            ENGLISH_BREAST_COLLARS_BLACK_DYED.add(ITEMS.register("english_breast_collar_black_" + color.getString(), () ->
                    new EnglishBreastCollar("english_breast_collar_black_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ENGLISH_BRIDLES_BLACK_DYED.add(ITEMS.register("english_bridle_black_" + color.getString(),
                    () -> new EnglishBridleItem("english_bridle_black_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            ENGLISH_GIRTH_STRAPS_BLACK_DYED.add(ITEMS.register("english_girth_strap_black_" + color.getString(),
                    () -> new EnglishGirthStrap("english_girth_strap_black_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

//            ENGLISH_SADDLES_BROWN_DYED.add(ITEMS.register("english_saddle_brown_" + color.getString(), () ->
//                    new EnglishSaddleItem("english_saddle_brown_" + color.getString(), (new Item.Properties())
//                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(1))
//            ));
//            ENGLISH_BREAST_COLLARS_BROWN_DYED.add(ITEMS.register("english_breast_collar_brown_" + color.getString(), () ->
//                    new EnglishBreastCollar("english_breast_collar_brown_" + color.getString(), (new Item.Properties())
//                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
//            ));
//            ENGLISH_BRIDLES_BROWN_DYED.add(ITEMS.register("english_bridle_brown_" + color.getString(),
//                    () -> new EnglishBridleItem("english_bridle_brown_" + color.getString(), (new Item.Properties())
//                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
//            ));
//            ENGLISH_GIRTH_STRAPS_BROWN_DYED.add(ITEMS.register("english_girth_strap_brown_" + color.getString(),
//                    () -> new EnglishGirthStrap("english_girth_strap_brown_" + color.getString(), (new Item.Properties())
//                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
//            ));


            CLOTH_BREAST_COLLARS_DYED.add(ITEMS.register("cloth_breast_collar_" + color.getString(), () ->
                    new EnglishBreastCollar("cloth_breast_collar_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            CLOTH_BRIDLES_DYED.add(ITEMS.register("cloth_bridle_" + color.getString(),
                    () -> new EnglishBridleItem("cloth_bridle_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            CLOTH_GIRTH_STRAPS_DYED.add(ITEMS.register("cloth_girth_strap_" + color.getString(),
                    () -> new EnglishGirthStrap("cloth_girth_strap_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            CLOTH_BITLESS_BRIDLES.add(ITEMS.register("cloth_bitless_bridle_" + color.getString(),
                    () -> new EnglishBridleItem("cloth_bitless_bridle_" + color.getString(), (new Item.Properties())
                            .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));

            BAREBACK_BLANKETS.add(ITEMS.register("bareback_blanket_" + color.getString(), () ->
                new WesternBlanketItem("bareback_blanket_" + color.getString(), (new Item.Properties())
                    .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            FLYMASKS_DYED.add(ITEMS.register("flymask_" + color.getString(), () ->
                new HalterItem("flymask_" + color.getString(), (new Item.Properties())
                    .group(TackShopCreativeModTab.TRETACK_TAB).maxStackSize(16))
            ));
            FLAGS_DYED.add(ITEMS.register("flag_" + color.getString(), () ->
                new Item((new Item.Properties().group(TackShopCreativeModTab.TRETACK_TAB)))));
        }

        //DYED TACK ITEMS - Craftable still :3
    }
}