package com.monkeynuts.bukkit.SimpleWarp2;

import java.util.logging.Logger;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


/**
 * Warp for Bukkit
 *
 * @author James Archuleta
 */
public class Warp extends JavaPlugin {
	
    //private final WarpPlayerListener playerListener = new WarpPlayerListener(this);
    public static Object Permissions = null;
	public static Boolean hasPermissions;
    private Logger log =  Logger.getLogger("Minecraft");
    private PluginDescriptionFile pdfFile;
    
    Command cmdList[] = new Command[] {
    		new CmdWarp("warp"),
    		new CmdWarpTo("warpto"),
    		new CmdSetWarp("setwarp"),
    		new CmdListWarps("listwarps"), 
    		new CmdRemoveWarp("removewarp")};


    public Warp() {
        Warp.hasPermissions = false;
        }



    public void onEnable() {
        PluginDescriptionFile pdfFile = this.getDescription();
    	System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled" );
    }

    public void onDisable() {
    	PluginDescriptionFile pdfFile = this.getDescription();
    	System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is disabled" );
    }


    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String commandLabel, String[] args) {
        
    	Boolean b = false;

        for(Command c : this.cmdList){
        	if ( command.getName().equalsIgnoreCase(c.getName())   ){
        		b = c.run(sender, command, commandLabel, args, getServer());
        		if (b) {break;}
        	}
        }
        
        return b;


    }
    
   
}

