package org.example.rooms;

import org.example.Player;

public class HealingRoom extends Room {

    public HealingRoom() {
        super("Player found healing well.");
    }

    @Override
    public void enter(Player player) {
        System.out.println(roomDescription);
        player.heal(5);

    }
}
