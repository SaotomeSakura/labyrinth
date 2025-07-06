package org.example;

import org.example.rooms.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DungeonGame {
    private final Scanner scanner;

    public DungeonGame(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("Enter your name, brave adventurer: ");
        String name = scanner.nextLine();

        Player player = new Player(name);
        System.out.print("How many rooms are in dungeon? ");
        int numberOfRooms = scanner.nextInt();
        scanner.nextLine();

        List<Room> dungeon = generateDungeon(numberOfRooms); // 5 random rooms

        for (Room room : dungeon) {
            room.enter(player);
            if (!player.isAlive()) {
                System.out.println("You died. Game over.");
                replay();
                return;
            }
        }

        System.out.println("You survived the dungeon! ");
        System.out.println("Your statistics: " + player.getName() + "\n" +
                "Health: " + player.getHealth() + "\n" +
                "Gold: " + player.getGold() + "\n");

        replay();
    }

    private static List<Room> generateDungeon(int size) {
        List<Room> rooms = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int type = rand.nextInt(4); // 0–3 if you have 4 room types
            switch (type) {
                case 0 -> rooms.add(new TreasureRoom());
                case 1 -> rooms.add(new TrapRoom());
                case 2 -> rooms.add(new MonsterRoom());
                case 3 -> rooms.add(new HealingRoom()); // optional
            }
        }

        return rooms;
    }

    public void replay(){
        System.out.println("Play again? (yes/no)");
        String input = scanner.nextLine().trim().toLowerCase();
        if (input.equals("yes")) {
            start();
        }
    }
}