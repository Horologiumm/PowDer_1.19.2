package net.horologium.powder.event;

import com.google.common.eventbus.Subscribe;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.horologium.powder.POWDER;
import net.horologium.powder.item.ModItems;
import net.horologium.powder.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = POWDER.MODID)
public class ModEvent {
    @SubscribeEvent
    public static void  addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.POWDER_MERCHANT.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.BASIS_POWDER.get(), 4);
            int villagerLevel = 1;

            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1), stack, 10, 8, 0.02F));

        }

    }

}
