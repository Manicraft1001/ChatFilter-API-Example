package net.manicraft.chatfilterexample;

import net.manicraft.chatfilterexample.listener.ChatViolationListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aEnabled test plugin for ChatFilter");
        Bukkit.getConsoleSender().sendMessage("§aBuy it right here: https://www.spigotmc.org/resources/advanced-chatfilter-one-of-the-most-advanced-filter-systems.67391/");

        final PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new ChatViolationListener(), this);
    }
}
