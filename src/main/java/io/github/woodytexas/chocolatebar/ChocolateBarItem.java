package io.github.woodytexas.chocolatebar;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class ChocolateBarItem extends Item {
    public ChocolateBarItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext options) {
        MutableText test = new LiteralText("Potato chocolate?").styled(style -> style.withColor(0xB79268));

        tooltip.add(test);
    }
}
