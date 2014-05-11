package org.Ennosium.IsaacCards.Llisteners;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public abstract class Cards implements Listener {
	/**
	 * Uses a function a card.
	 * 
	 * @param e
	 *            Event {@link PlayerInteractEvent}
	 */
	public void function(PlayerInteractEvent e) {
		e.getPlayer().sendMessage("Card not uses functions.");
		e.getPlayer().sendMessage(
				"More information you can get from a developer add-on.");
	}
	
	
}
