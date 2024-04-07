package cs.javierdz;

import cs.javierdz.commands.help;
import cs.javierdz.listeners.ChatListener;
import cs.javierdz.utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class customsurvival extends JavaPlugin {



    public static String prefix = "&8[&1&lSurvival&r&8] &r";

    public void onEnable(){
        registerCommands();
        registerEvents();
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"&aEnabled!"));
        Bukkit.getConsoleSender().sendMessage(MessageUtils.getColoredMessage(prefix+"Plugin by Javierdz, version 1.0"));
    }


    public void registerCommands(){
        this.getCommand("help").setExecutor(new help());

    }
    public void registerEvents(){
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
}
