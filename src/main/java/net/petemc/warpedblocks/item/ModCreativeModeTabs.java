package net.petemc.warpedblocks.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.petemc.warpedblocks.WarpedBlocks;
import net.petemc.warpedblocks.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WarpedBlocks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WARPED_BLOCK_TAB = CREATIVE_MODE_TABS.register("warped_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.WARPED_NETHERRACK.get()))
                    .title(Component.translatable("creativetab.warpedblocks_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_STAIRS.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_SLAB.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_WALL.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_BUTTON.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_PLATE.get());
                        pOutput.accept(ModBlocks.CHISELED_WARPED_NETHERRACK.get());
                        pOutput.accept(ModBlocks.POLISHED_WARPED_NETHERRACK.get());
                        pOutput.accept(ModBlocks.POLISHED_WARPED_NETHERRACK_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_WARPED_NETHERRACK_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_WARPED_NETHERRACK_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_WARPED_NETHERRACK_BUTTON.get());
                        pOutput.accept(ModBlocks.POLISHED_WARPED_NETHERRACK_PLATE.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_BRICKS.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.WARPED_NETHERRACK_BRICK_WALL.get());
                        //pOutput.accept(ModBlocks.WARPED_STONE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
