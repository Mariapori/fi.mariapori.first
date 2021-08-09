package fi.mariapori.first;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Teleport implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg0 instanceof Player) {
			
            Player player = (Player) arg0;
            Player target = Bukkit.getPlayer(arg2);
            
            if(target != null) {
            	Location loc = target.getLocation();
            	target.sendMessage(player.getDisplayName() + " on tulossa!");
            	player.teleport(loc);
            }else {
            	player.sendMessage("Ei onnistu!");
            	return false;
            }
            
        }

        return true;
	}

}
