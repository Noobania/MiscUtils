package net.draycia.miscutils.commands;

import net.draycia.miscutils.MiscUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCamp implements CommandExecutor {

    private MiscUtils main;

    public CommandCamp(MiscUtils main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            ((Player) sender).kickPlayer(main.getConfig().getString("CampMessage"));
        }

        return true;
    }
}
