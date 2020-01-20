package net.draycia.miscutils.commands;

import net.draycia.miscutils.MiscUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandReload implements CommandExecutor {

    private MiscUtils miscUtils;

    public CommandReload(MiscUtils miscUtils) {
        this.miscUtils = miscUtils;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        miscUtils.reloadConfig();
        sender.sendMessage(ChatColor.GREEN + "Reloaded MiscUtils config!");

        return true;
    }
}