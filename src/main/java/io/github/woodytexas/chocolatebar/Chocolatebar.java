package io.github.woodytexas.chocolatebar;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Chocolatebar implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("chocolatebar");

    //public static final Item CHOCOLATE_BAR = new Item(new FabricItemSettings().group(ItemGroup.FOOD));
    public static final ChocolateBarItem CHOCOLATE_BAR = new ChocolateBarItem(new FabricItemSettings().group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("chocolatebar", "chocolate_bar"), CHOCOLATE_BAR);
    }
}
