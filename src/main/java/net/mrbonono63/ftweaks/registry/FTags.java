package net.mrbonono63.ftweaks.registry;

import net.fabricmc.fabric.api.tag.TagRegistry;

import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.mrbonono63.ftweaks.Main;

public class FTags {

    public static class FItemTag
    {
        public static final Tag<net.minecraft.item.Item> LEATHER = register("leather");

        public static final Tag<net.minecraft.item.Item> CAN_MINE_IRON = register("can_mine_iron");

        public static final Tag<net.minecraft.item.Item> STONE_OR_BETTER = register("stone_or_better");

        protected static void init() {}

        public static Tag<net.minecraft.item.Item> register(String name) {
            return TagRegistry.item(Main.id(name));
        }
    }

    public static class FBlockTag
    {

        public static Tag<Block> register(String name) {
            return TagRegistry.block(Main.id(name));
        }

        protected static void init() {
            // NO-OP
        }
    }

    public static void init()
    {
        FItemTag.init();
        FBlockTag.init();
    }
}
