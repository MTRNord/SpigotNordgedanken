package de.nordgedanken.spigotnordgedanken.Listener;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.inventivetalent.tabapi.TabAPI;
import org.inventivetalent.tabapi.TabItem;

public class Tablist implements Listener{
	public void setHeaderAndFooter(Player player) {
        TabAPI.setHeader(player,
                "§9Welcome to the server, ",
                "§a" + player.getName() + "!");

        TabAPI.setFooter(player,
                "§2Online players",
                "§7" + Bukkit.getOnlinePlayers().size() + "§8/§6100");
    }
	public void setItems(Player player) {
        TabAPI.clearAllItems(player);//Remove all items

        TabAPI.setItems(player, Arrays.asList(//Add our custom items
                new TabItem("§0§c§lAdmins"),
                new TabItem("§1§fYou!")));
    }
	 @EventHandler (priority = EventPriority.LOWEST)
     public void onPlayerJoin(PlayerJoinEvent event)
     {
		 setHeaderAndFooter(event.getPlayer());
	     setItems(event.getPlayer());
     }

}

