package org.example.rooms;

import org.example.Player;

public class TreasureRoom extends Room {

    public TreasureRoom() {
        super("Player entered treasure room.");
    }

    @Override
    public void enter(Player player) {
        System.out.println(roomDescription);
        player.addGold(10);
    }
}
