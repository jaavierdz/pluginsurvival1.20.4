package cs.javierdz.listeners;


import cs.javierdz.customsurvival;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.net.http.WebSocket;

public class ChatListener implements Listener {

    public void creativo(AsyncPlayerChatEvent event){
        Player player = event.getPlayer();
        String message = event.getMessage();

        if(message.toLowerCase().contains("creativo")){
            event.setCancelled(true);
            player.sendMessage(customsurvival.prefix+"&cNo uso creativo.");


        }

        if(message.toLowerCase().contains("javi maricon")){
            event.setCancelled(true);
            player.sendMessage(customsurvival.prefix+"&cNo.");
        }

    }

}
