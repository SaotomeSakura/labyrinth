package org.example.rooms;

import org.example.Player;

import java.util.Random;

public class MonsterRoom extends Room {

    public MonsterRoom() {
        super("A monster attacks!");
    }

    @Override
    public void enter(Player player) {
        System.out.println(roomDescription);
        int damage = new Random().nextInt(21) + 10;
        System.out.println("The monster hits you for " + damage + " damage!");
        player.takeDamage(damage);

    }
}
