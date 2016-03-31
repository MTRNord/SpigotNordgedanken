package de.nordgedanken.spigotnordgedanken;

import org.bukkit.plugin.java.JavaPlugin;
import de.nordgedanken.spigotnordgedanken.Listener.Tablist;

public class SpigotNordgedanken extends JavaPlugin {

	@Override
	public void onLoad() {
	}

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Tablist(), this);
	}

	@Override
	public void onDisable() {
	}
}
