package Comp2112.FirstPart;

import java.util.*;

public class CharacterLosingGame {

    private final Random random;
    private final LinkedListFunctions linkedListFunctions;

    public CharacterLosingGame(int N) {
        random = new Random();
        linkedListFunctions = new LinkedListFunctions();
    }

    public void playGame(CircularLinkedList selectedNames) {
        if (selectedNames.getSize() == 0) {
            System.out.println("There are no names, you can't play the game.");
            return;
        }

        while (selectedNames.getSize() > 1) {

            int k = random.nextInt(selectedNames.getSize());

            DoubleNode currentNode = selectedNames.getNodeAt(k);
            String currentName = currentNode.getName();
            System.out.println("-------------------------");

            LinkedList<Node> letterList = linkedListFunctions.splitNameIntoLetters(currentName);
            System.out.print("Name " + currentName + " split into letters: ");
            for (Node letterNode : letterList) {
                System.out.print(letterNode.getName() + " ");
            }
            System.out.println();

            if (letterList.size() > 1) {
                letterList.removeLast();

                String updatedName = linkedListFunctions.rebuildNameFromLinkedList(letterList);
                currentNode.setName(updatedName);
                System.out.println("Updated name: " + updatedName);

            } else {

                System.out.println("Removing: " + currentName);
                selectedNames.removeDoubleNode(currentNode);
            }
            System.out.println("Current list size: " + selectedNames.getSize() + "\n");
            System.out.println("-------------------------");

            selectedNames.PrintingNames();
        }

        DoubleNode winnerNode = selectedNames.getNodeAt(0);
        String winnerOriginalName = winnerNode.getOriginalName();
        System.out.println("The winner is: " + winnerOriginalName);
    }
}
