package org.example.rooms;

import org.example.Player;

public class TrapRoom extends Room {

    public TrapRoom() {
        super("Player entered trap room.");
    }

    @Override
    public void enter(Player player) {
        System.out.println(roomDescription);
        player.takeDamage(20);

    }
}
