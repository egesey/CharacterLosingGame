package Comp2112.FirstPart;

import java.io.*;
import java.util.*;

public class NamesFile {

    public static void addNamesToArray(ArrayList<String> names, int N, CircularLinkedList selectedNames) {
        try {
            Scanner namescanner = new Scanner(new File("C:\\Users\\Ahmet Eren\\Desktop\\names\\names.txt"));

            while (namescanner.hasNextLine()) {
                String name = namescanner.nextLine();
                names.add(name);
            }
            namescanner.close();

            Collections.shuffle(names);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");

        }

        for (int i = 0; i < N; i++) {
            selectedNames.DoubleNodeAdd((String) names.get(i));
        }

        selectedNames.PrintingNames();

    }

}
