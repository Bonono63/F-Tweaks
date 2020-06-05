package net.mrbonono63.ftweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.BlockView;

import java.util.List;

public class FIronOreBlock extends Block {
    public FIronOreBlock(Settings settings) {
        super(settings.strength(3,3));
    }

    @Override
    public void buildTooltip(ItemStack stack, BlockView view, List<Text> tooltip, TooltipContext options) {
        tooltip.add(new TranslatableText("ftweaks.poor_iron_ore.tooltip"));
    }
}
