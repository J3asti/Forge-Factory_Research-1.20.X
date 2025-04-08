package net.j3asti.factory_research.item;

import net.j3asti.factory_research.Factory_Research;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Factory_Research.MOD_ID);

    public static final RegistryObject<Item> SURVIVAL_PACK = ITEMS.register("survival_pack",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AUTOMATION_PACK = ITEMS.register("automation_pack",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
