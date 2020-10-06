package itacademy;

import java.io.CharArrayReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String name;
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        name = nameInput.nextLine();

        System.out.println("FASE 1");
        char[] nameArray = name.toCharArray();

        for (char ch : nameArray) {
            System.out.println(ch);
        }

        System.out.println("FASE 2");

        char[] nameArrayFase2 = name.toCharArray();

        List<Character> nameList = new ArrayList<>();

        for (char ch : nameArrayFase2) {
            nameList.add(ch);
        }
        System.out.println(nameList);
        for (char i : nameList){
            if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                System.out.println(i + " es una VOCAL");
            } else if (Character.isDigit(i)) {
                System.out.println("Los nombres no pueden contener números!’.");
            } else {
                System.out.println(i + " es una CONSONANTE");
            }
        }

        System.out.println("FASE 3");
        Hashtable<Character, Integer> contenedor = new Hashtable<Character, Integer>();
        for (Character i : nameList) {
            System.out.println(i);
            int counter = 0;
            for (Character j : nameList){
                if (i==j){
                    counter++;
                }
                //System.out.println(counter);
            }
            contenedor.put(i,counter);
            //contenedor.put(i);
        }
        System.out.println(contenedor);

        System.out.println("FASE 4");

        String surname;
        Scanner surnameInput = new Scanner(System.in);
        System.out.println("Introduce tu apellido:");
        surname = surnameInput.nextLine();

        char[] surnameArray = surname.toCharArray();

        List<Character> surnameList = new ArrayList<>();

        for (char ch : surnameArray) {
            surnameList.add(ch);
        }

        List<Character> fullname = new ArrayList<Character>();
        fullname.addAll(nameList);
        String espacio = " ";
        fullname.add(espacio.toCharArray()[0]);
        fullname.addAll(surnameList);
        System.out.println(fullname);
    }

}
