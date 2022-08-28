package net.horologium.powder.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab POWDER_TAB = new CreativeModeTab("powderTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BASIS_POWDER.get());
        }
    };
}
