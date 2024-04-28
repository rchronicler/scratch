package net.rchronicler.liang_ch13;

import java.util.ArrayList;
import java.util.Arrays;

/*
    *13.2 (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:

    public static void shuffle(ArrayList<Number> list)
*/

public class Exercise_13_02 {

    public static void shuffle(ArrayList<Number> list){
        for(int i = 0; i < list.size(); i++){
            int randomIndex = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Number> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Sebelum shuffle: " + a);
        shuffle(a);
        System.out.println("Setelah shuffle: " + a);
    }
}
