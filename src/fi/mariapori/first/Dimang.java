package fi.mariapori.first;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Dimang implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if (arg0 instanceof Player) {
			
            Player player = (Player) arg0;

            ItemStack diamond = new ItemStack(Material.DIAMOND);

            diamond.setAmount(20);

            player.getInventory().addItem(diamond);
            
        }

        return true;
	}

}
