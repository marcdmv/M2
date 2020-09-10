import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Character> nom = new ArrayList<>();
        nom.add('m');
        nom.add('a');
        nom.add('r');
        nom.add('c');

        List<Character> cognom = new ArrayList<>();
        cognom.add('d');
        cognom.add('e');
        cognom.add('m');
        cognom.add('a');
        cognom.add('s');

        List<Character> fullname = new ArrayList<>();
        fullname.addAll(nom);
        fullname.add(' ');
        fullname.addAll(cognom);

        System.out.println(fullname);
    }
}