package net.manicraft.chatfilterexample.listener;

import de.shift.filter.api.ChatFilterEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatViolationListener implements Listener {

    @EventHandler
    public void onViolation(final ChatFilterEvent event) {
        Bukkit.broadcastMessage("§7I guess, §f" + event.getPlayer().getName() + " §7violated the chat rules! I dedected him / her for filter called \"§c" + event.getFilterId() + "§7\".");
    }
}
