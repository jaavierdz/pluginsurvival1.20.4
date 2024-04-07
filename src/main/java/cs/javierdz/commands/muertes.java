package cs.javierdz.commands;

import cs.javierdz.customsurvival;
import cs.javierdz.utils.MessageUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public class muertes implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage(MessageUtils.getColoredMessage(customsurvival.prefix+"&cThis command is for player use only!"));
            return true;
        }
        Player player = ((Player) sender).getPlayer();
        Scoreboard sc = player.getScoreboard();
        sender.sendMessage(MessageUtils.getColoredMessage(customsurvival.prefix+"&1Has muerto un total de &r&e"+sc.getObjective("muertes")));
        return true;
    }
}
