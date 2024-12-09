package Comp2112.FirstPart;

import java.util.LinkedList;

public class LinkedListFunctions {

    public LinkedList<Node> splitNameIntoLetters(String name) {
        LinkedList<Node> letterList = new LinkedList<>();
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            Node letterNode = new Node(Character.toString(letter));
            letterList.add(letterNode);
        }
        return letterList;
    }

    public String rebuildNameFromLinkedList(LinkedList<Node> letterList) {
        String rebuiltName = "";
        for (Node letterNode : letterList) {
            rebuiltName += letterNode.getName();
        }
        return rebuiltName;
    }
}
