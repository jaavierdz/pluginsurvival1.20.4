package cs.javierdz.commands;

import cs.javierdz.customsurvival;
import cs.javierdz.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class help implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(MessageUtils.getColoredMessage(customsurvival.prefix+"&cThis command is for player use only!"));
            return true;
        }

        sender.sendMessage(MessageUtils.getColoredMessage(customsurvival.prefix+"&1Javierdz's Custom Survival"));
        sender.sendMessage(MessageUtils.getColoredMessage("&1Minecraft version: 1.20.4"));
        sender.sendMessage(MessageUtils.getColoredMessage("&1Server IP Address: survival.javierdz.xyz"));
        sender.sendMessage(MessageUtils.getColoredMessage("&e/help &7--> &1Displays this page"));
        sender.sendMessage(MessageUtils.getColoredMessage("&e/muertes &7--> &1Tells you how many times you have died"));
        sender.sendMessage(MessageUtils.getColoredMessage("&1More to add!"));

        return true;
    }
}
