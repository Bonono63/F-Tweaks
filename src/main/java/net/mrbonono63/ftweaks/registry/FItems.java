package net.mrbonono63.ftweaks.registry;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.mrbonono63.ftweaks.Main;
import net.mrbonono63.ftweaks.items.*;

public class FItems {

    public static final Item IRON_SCRAPS = register("iron_scraps", new FIronScraps(newSettings().maxCount(27)));

    public static final Item IRON_ORE = register("iron_ore", new FIronOreItem(newSettings().maxCount(27)));

    public static final Item SWORD_HANDLE = register("sword_handle", new Item(newSettings().maxCount(1)));

    public static final Item COLD_PLATE_MOLD = register("cold_plate_mold", new FColdMold(newSettings().maxCount(1)));

    public static final Item HOT_PLATE_MOLD = register("hot_plate_mold", new FHotMold(newSettings().maxCount(1).recipeRemainder(COLD_PLATE_MOLD)));

    public static final Item STONE_PLATE = register("stone_plate", new FStonePlate(newSettings().maxCount(1)));

    public static final Item STONE_INGOT = register("stone_ingot", new FStoneIngot(newSettings().maxCount(1)));

    public static final Item COLD_INGOT_MOLD = register("cold_ingot_mold", new FColdIngot(newSettings().maxCount(1)));

    public static final Item HOT_INGOT_MOLD = register("hot_ingot_mold", new FHotIngot(newSettings().recipeRemainder(COLD_INGOT_MOLD)));
    public FItems() {}

    static Item.Settings newSettings() {
        return new Item.Settings().group(Main.GROUP);
    }

    public static void init() {

    }

    protected static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, Main.id(name),item);
    }
}
