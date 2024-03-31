//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyraltre.tretackshop.registry;

import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.block.custom.EggTrophy;
import com.kyraltre.tretackshop.item.TackShopCreativeModTab;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistries.Keys;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class AwardShopBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS;

    public static final List<RegistryObject<EggTrophy>> EGG_TROPHY_THIN;
    public static final List<RegistryObject<EggTrophy>> EGG_TROPHY_THICK;
    public static final List<RegistryObject<EggTrophy>> EGG_TROPHY_CHEV;
    public AwardShopBlockRegistry() {
    }

    public static void init(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup) {
        return register(name, sup, AwardShopBlockRegistry::itemDefault);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<? extends T> sup, Function<RegistryObject<T>, Supplier<? extends Item>> itemCreator) {
        RegistryObject<T> ret = registerNoItem(name, sup);
        TackShopItems.ITEMS.register(name, (Supplier) itemCreator.apply(ret));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<? extends T> sup) {
        return BLOCKS.register(name, sup);
    }

    private static Supplier<BlockItem> itemDefault(RegistryObject<? extends Block> block) {
        return item(block, TackShopCreativeModTab.TREAWARD_TAB);
    }

    private static Supplier<BlockItem> item(RegistryObject<? extends Block> block, ItemGroup itemGroup) {
        return () -> {
            return new BlockItem((Block) block.get(), (new Item.Properties()).group(itemGroup));
        };
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TreTackShop.MOD_ID);

        EGG_TROPHY_CHEV = new ArrayList<>();
        EGG_TROPHY_THIN = new ArrayList<>();
        EGG_TROPHY_THICK = new ArrayList<>();

        for (int var1 = 1; var1 < 4; ++var1) {
            EGG_TROPHY_THICK.add(register("e_g_g_trophy_thick_" + var1, () -> {
                return new EggTrophy(AbstractBlock.Properties.create(Material.IRON).notSolid().hardnessAndResistance(1.0F));
            }));
            EGG_TROPHY_CHEV.add(register("e_g_g_trophy_chev_" + var1, () -> {
                return new EggTrophy(AbstractBlock.Properties.create(Material.IRON).notSolid().hardnessAndResistance(1.0F));
            }));
            EGG_TROPHY_THIN.add(register("e_g_g_trophy_thin_" + var1, () -> {
                return new EggTrophy(AbstractBlock.Properties.create(Material.IRON).notSolid().hardnessAndResistance(1.0F));
            }));
        }
    }
}
