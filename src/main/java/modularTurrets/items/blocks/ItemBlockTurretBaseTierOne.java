package modularTurrets.items.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import modularTurrets.misc.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemBlockTurretBaseTierOne extends ItemBlock {
    public ItemBlockTurretBaseTierOne(Block p_i45328_1_) {
        super(p_i45328_1_);
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.AQUA + "--"+ StatCollector.translateToLocal("tooptip.energy.label") + "--");
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.rf.max") + ": " + EnumChatFormatting.WHITE + ConfigHandler.getBaseTierOneMaxCharge());
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.rf.io") + ": " + EnumChatFormatting.WHITE + ConfigHandler.getBaseTierOneMaxIo());
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.GREEN + "--" + StatCollector.translateToLocal("tooltip.extras.label") + "--");
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.extras.addons.2"));
        p_77624_3_.add(StatCollector.translateToLocal("tooltip.extras.upgrade.1"));
        p_77624_3_.add("");
        p_77624_3_.add(EnumChatFormatting.DARK_GRAY + StatCollector.translateToLocal("flavour.base.1"));
    }
}