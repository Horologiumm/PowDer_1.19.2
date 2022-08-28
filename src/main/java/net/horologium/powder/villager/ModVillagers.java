package net.horologium.powder.villager;

import com.google.common.collect.ImmutableSet;
import net.horologium.powder.POWDER;
import net.horologium.powder.block.ModBlocks;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, POWDER.MODID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, POWDER.MODID);

    public static final RegistryObject<PoiType> BASIS_BLOCK_POI = POI_TYPES.register("basis_block_poi", () -> new PoiType(ImmutableSet.copyOf(ModBlocks.BASIS_BLOCK.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final RegistryObject<VillagerProfession> POWDER_MERCHANT = VILLAGER_PROFESSIONS.register("powder_merchant",() -> new VillagerProfession("powder_merchant", x -> x.get() == BASIS_BLOCK_POI.get(), x -> x.get() == BASIS_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.AMETHYST_CLUSTER_BREAK));

    public static void  registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, BASIS_BLOCK_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }


    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }

}
