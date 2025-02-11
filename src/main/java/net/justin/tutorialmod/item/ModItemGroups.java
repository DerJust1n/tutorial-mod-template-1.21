package net.justin.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.justin.tutorialmod.TutorialMod;
import net.justin.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// Adding ItemGroups and Items to it
public class ModItemGroups {
    public static final ItemGroup THE_BLOCK_ODYSSEY = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "the-block_odyssey_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SCROLL_DEFAULT))
                    .displayName(Text.translatable("itemgroup.tutorialmod.the_block_odyssey_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SCROLL_DEFAULT);
                        entries.add(ModItems.STAFF_OF_FELLOWSHIP);
                        entries.add(ModBlocks.PRISON_REALM_BRICK);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
