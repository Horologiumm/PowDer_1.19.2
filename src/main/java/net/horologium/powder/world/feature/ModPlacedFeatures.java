package net.horologium.powder.world.feature;

import net.horologium.powder.POWDER;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, POWDER.MODID);


    public static final RegistryObject<PlacedFeature> MAGIA_ORE_PLACED = PLACED_FEATURES.register("magia_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.MAGIA_ORE.getHolder().get(), commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(40)))));
    public static final RegistryObject<PlacedFeature> OUSIA_ORE_PLACED = PLACED_FEATURES.register("ousia_ore_placed", () -> new PlacedFeature(ModConfiguredFeatures.OUSIA_ORE.getHolder().get(), commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(100)))));



    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

        public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }
}



