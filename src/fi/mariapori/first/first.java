package fi.mariapori.first;
import org.bukkit.plugin.java.JavaPlugin;

public class first extends JavaPlugin {
    @Override
    public void onEnable() {
    	this.getCommand("dimang").setExecutor(new Dimang());
    }
    @Override
    public void onDisable() {

    }
    
}
