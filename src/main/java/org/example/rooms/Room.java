package org.example.rooms;

import org.example.Player;

public abstract class Room {
    protected String roomDescription;

    public Room(String description) {
        this.roomDescription = description;
    }

    public abstract void enter(Player player);
}

