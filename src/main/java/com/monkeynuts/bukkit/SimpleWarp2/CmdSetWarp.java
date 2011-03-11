package com.monkeynuts.bukkit.SimpleWarp2;

import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdSetWarp extends Command {

	protected CmdSetWarp(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Boolean run(CommandSender sender,
			org.bukkit.command.Command command, String commandLabel,
			String[] args, Server server) {

		if (!hasPermissions((Player) sender)) {
			((Player) sender)
					.sendMessage("You do not have permission to use this command.");
			return true;
		}

		if (args.length == 1 && hasPermissions((Player) sender)) {

			Player player = (Player) sender;

			Location l = player.getLocation();
			Locations.saveLocation(l, args[0], player.getWorld().getName());
			player.sendMessage("Warp Set: " + args[0]);
			System.out.println(player.getName() + " set warp " + args[0]);

			return true;
		}
		return false;

	}

}
