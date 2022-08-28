package net.horologium.powder.painting;

import net.horologium.powder.POWDER;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, POWDER.MODID);


    public static final RegistryObject<PaintingVariant> DINNOX = PAINTING_VARIANTS.register("dinnox", () -> new PaintingVariant(32,32));
    public static final RegistryObject<PaintingVariant> SLENDER = PAINTING_VARIANTS.register("slender", () -> new PaintingVariant(32,32));

    public static void register (IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
