package itacademy;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String name;
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        name = nameInput.nextLine();
        Text nameObj = new Text(name);

        //-------------------------------
        System.out.println("FASE 1");
        char[] nameArray = nameObj.textToCharArray(name);
        for (char ch : nameArray) {
            System.out.println(ch);
        }

        //-------------------------------
        System.out.println("FASE 2");

        List<Character> nameList = new ArrayList<>();

        for (char ch : nameArray) {
            nameList.add(ch);
        }
        System.out.println(nameList);
        for (char i : nameList){
            if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                System.out.println(i + " es una VOCAL");
            } else if (Character.isDigit(i)) {
                System.out.println("Los nombres no pueden contener números!.");
                System.exit(1);
            } else {
                System.out.println(i + " es una CONSONANTE");
            }
        }

        //-------------------------------
        System.out.println("FASE 3");
        Hashtable<Character, Integer> contenedor = new Hashtable<>();
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

        //-------------------------------
        System.out.println("FASE 4");

        String surname;
        Scanner surnameInput = new Scanner(System.in);
        System.out.println("Introduce tu apellido:");
        surname = surnameInput.nextLine();

        Text surnameObj = new Text(surname);
        char[] surnameArray = surnameObj.textToCharArray(surname);

        List<Character> surnameList = new ArrayList<>();

        for (char ch : surnameArray) {
            surnameList.add(ch);
        }

        List<Character> fullname = new ArrayList<>();
        fullname.addAll(nameList);
        String espacio = " ";
        fullname.add(espacio.toCharArray()[0]);
        fullname.addAll(surnameList);
        System.out.println("Nombre completo: " + fullname);
    }

}
