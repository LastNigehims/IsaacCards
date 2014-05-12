package org.Ennosium.IsaacCards.Llisteners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public abstract class Cards implements Listener {
	private String name;

	/**
	 * Insert name a card.
	 * Support COLOR! char '&'
	 * 
	 * @param name
	 *            Card name.
	 */
	public Cards(String name) {
		this.name = name;
	}

	/**
	 * Uses a function a card.
	 * 
	 * @param e
	 *            Event {@link PlayerInteractEvent}
	 */
	public void function(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if ( p.getItemInHand().getType() == Material.PAPER && p.getItemInHand().getItemMeta().getDisplayName()
				.equals(ChatColor.translateAlternateColorCodes('&', name)))
		{
		p.sendMessage("Card not uses functions.");
		p.sendMessage(
				"More information you can get from a developer add-on.");
		}
		}

}
