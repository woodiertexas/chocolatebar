package io.github.woodytexas.chocolatebar;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChocolateBar implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("chocolatebar");

    public static final Item QUILTY_WRAPPER = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON));
    public static final Item TOOLCHAIN_WRAPPER = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON));
    public static final ChocolateBarItem CHOCOLATE_BAR = new ChocolateBarItem(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(2).saturationModifier(0).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST), 0.05f).build()));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("chocolatebar", "chocolate_bar"), CHOCOLATE_BAR);
        Registry.register(Registry.ITEM, new Identifier("chocolatebar", "quilty_wrapper"), QUILTY_WRAPPER);
        Registry.register(Registry.ITEM, new Identifier("chocolatebar", "toolchain_wrapper"), TOOLCHAIN_WRAPPER);
    }
}