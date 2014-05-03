package net.blay09.mods.eirairc.api.event;

import net.blay09.mods.eirairc.api.IIRCChannel;
import net.blay09.mods.eirairc.api.IIRCConnection;

public class IRCDisconnectEvent extends IRCEvent {

	public IRCDisconnectEvent(IIRCConnection connection) {
		super(connection);
	}

}
