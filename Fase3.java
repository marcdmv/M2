import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Character> nom = new ArrayList<>();
        nom.add('m');
        nom.add('a');
        nom.add('r');
        nom.add('c');
        nom.add('d');
        nom.add('e');
        nom.add('m');
        nom.add('a');
        nom.add('s');

        List<Integer> repetitions = new ArrayList<>();
        int repetitionsPos = 0;
        Hashtable<Character, Integer> contenedor = new Hashtable<Character, Integer>();

            contenedor.put('m',2);
            contenedor.put('a',2);
            contenedor.put('r',1);
            contenedor.put('c',1);
            contenedor.put('d',1);
            contenedor.put('e',1);
            contenedor.put('s',1);
    }
}