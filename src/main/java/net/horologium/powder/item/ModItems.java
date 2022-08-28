package net.horologium.powder.item;

import net.horologium.powder.POWDER;
import net.minecraft.client.renderer.ItemModelShaper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, POWDER.MODID);

    public static final RegistryObject<Item> OUSIA_DUST = ITEMS.register("ousia_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> MAGIA_DUST = ITEMS.register("magia_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> BASIS_POWDER = ITEMS.register("basis_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));

    public static final RegistryObject<Item> AERO_POWDER = ITEMS.register("aero_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> PYRO_POWDER = ITEMS.register("pyro_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> GEO_POWDER = ITEMS.register("geo_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> HYDRO_POWDER = ITEMS.register("hydro_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> CRYO_POWDER = ITEMS.register("cryo_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> ELECTRO_POWDER = ITEMS.register("electro_powder", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));


    public static final RegistryObject<Item> MAGIA_INGOT = ITEMS.register("magia_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> BASIS_INGOT = ITEMS.register("basis_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> AERO_INGOT = ITEMS.register("aero_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> PYRO_INGOT = ITEMS.register("pyro_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> GEO_INGOT = ITEMS.register("geo_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> HYDRO_INGOT = ITEMS.register("hydro_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> CRYO_INGOT = ITEMS.register("cryo_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));
    public static final RegistryObject<Item> ELECTRO_INGOT = ITEMS.register("electro_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POWDER_TAB)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
