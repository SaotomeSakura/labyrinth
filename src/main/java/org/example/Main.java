package org.example;

import org.example.rooms.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DungeonGame game = new DungeonGame(scanner);

        game.start();
        scanner.close();
    }


}