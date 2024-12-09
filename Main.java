package Comp2112.FirstPart;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        CircularLinkedList selectedNames = new CircularLinkedList();
        System.out.print("Enter the number of players (N): ");
        int N = scanner.nextInt();
        NamesFile.addNamesToArray(names, N, selectedNames);
        CharacterLosingGame a = new CharacterLosingGame(N);
        a.playGame(selectedNames);
    }
}
