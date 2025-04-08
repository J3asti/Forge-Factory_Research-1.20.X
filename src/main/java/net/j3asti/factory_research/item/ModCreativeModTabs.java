package net.j3asti.factory_research.item;

import net.j3asti.factory_research.Factory_Research;
import net.j3asti.factory_research.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Factory_Research.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FACTORY_RESEARCH_TAB = CREATIVE_MODE_TABS.register("factory_research_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AUTOMATION_PACK.get()))
                    .title(Component.translatable("creativetab.factory_research_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SURVIVAL_PACK.get());
                        pOutput.accept(ModItems.AUTOMATION_PACK.get());

                        pOutput.accept(ModBlocks.RESEARCH_TABLE.get());
                        pOutput.accept(ModBlocks.RESEARCH_LAB.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
