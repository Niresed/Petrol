package me.niresed;

import me.niresed.Commands.RTP;
import me.niresed.Listeners.Hello;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new Hello(), this);
        getCommand("RTP").setExecutor(new RTP());
    }
}
