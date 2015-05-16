package openmodularturrets.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import openmodularturrets.handler.ConfigHandler;

import java.util.List;

public class ItemBlockTurretBaseTierFive extends ItemBlock {
    public ItemBlockTurretBaseTierFive(Block p_i45328_1_) {
        super(p_i45328_1_);
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.AQUA + "--" + StatCollector.translateToLocal("tooptip.energy.label") + "--");
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.rf.max") + ": " + EnumChatFormatting.WHITE +
                               ConfigHandler.getBaseTierFourMaxCharge());
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.rf.io") + ": " + EnumChatFormatting.WHITE +
                               ConfigHandler.getBaseTierFourMaxIo());
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.GREEN + "--" + StatCollector.translateToLocal("tooltip.extras.label") + "--");
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.extras.addons.2"));
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.extras.upgrade.2"));
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal("flavour.base.4a"));
        p_77624_3_.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal("flavour.base.4b"));
    }
}