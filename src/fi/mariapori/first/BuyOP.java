package fi.mariapori.first;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BuyOP implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(arg0 instanceof Player) {
			Player pelaaja = (Player)arg0;
			ItemStack timangit = new ItemStack(Material.DIAMOND,10);
			if(pelaaja.getInventory().contains(Material.DIAMOND, 10)) {
				if(pelaaja.isOp()) {
					pelaaja.sendMessage("Olet jo operaattori!");
					return true;
				}
				pelaaja.getInventory().removeItem(timangit);
				pelaaja.setOp(true);
				pelaaja.sendMessage("Ostit OP 10 timantilla!");
			}else {
				pelaaja.sendMessage("Sinulla ei ole 10 timanttia!");
			}
		}
		return true;
	}

}
