package com.lumyverse.lumyrei;

import com.cobblemon.mod.common.brewing.BrewingRecipes;
import com.cobblemon.mod.common.brewing.ingredient.CobblemonIngredient;
import kotlin.Triple;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class LumyREI implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new BrewingStandCategory());
        registry.addWorkstations(BrewingStandCategory.BREWING, EntryStacks.of(Items.BREWING_STAND));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        for (Triple<CobblemonIngredient, CobblemonIngredient, Item> recipe : BrewingRecipes.INSTANCE.getRecipes()) {
            CobblemonBrewingDisplay display = CobblemonBrewingDisplay.from(recipe);
            if (display != null) {
                registry.add(display);
            }
        }
    }
}
