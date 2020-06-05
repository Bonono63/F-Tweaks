package net.mrbonono63.ftweaks.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class FIronScraps extends Item {
    public FIronScraps(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> list, TooltipContext tooltipContext) {
        list.add(new TranslatableText("ftweaks.iron_scraps.tooltip"));
    }
}
