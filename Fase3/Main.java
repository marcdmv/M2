package itacademy;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Character> nom = new ArrayList<>();
        nom.add('m');
        nom.add('a');
        nom.add('r');
        nom.add('c');

        Hashtable<Character, Integer> contenedor = new Hashtable<Character, Integer>();
        for (Character i : nom) {
            System.out.println(i);
            int counter = 0;
            for (Character j : nom){
                if (i==j){
                    counter++;
                }
                //System.out.println(counter);
            }
            contenedor.put(i,counter);
            //contenedor.put(i);
        }
        System.out.println(contenedor);
    }
}
