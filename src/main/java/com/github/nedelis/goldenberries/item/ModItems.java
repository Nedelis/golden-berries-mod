package com.github.nedelis.goldenberries.item;

import com.github.nedelis.goldenberries.GoldenBerries;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class ModItems {
    public static final Item GOLDEN_BERRIES = registerItem(
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponent.GOLDEN_BERRIES)));

    private static Item registerItem(Item item) {
        return Registry.register(Registry.ITEM, new Identifier(GoldenBerries.MOD_ID, "golden_berries"), item);
    }

    public static void registerModItems() {
        GoldenBerries.LOGGER.info("Registering mod items for " + GoldenBerries.MOD_ID);
    }

}
