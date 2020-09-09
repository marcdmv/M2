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
        for (char i : nom){
            if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                System.out.println("VOCAL");
            } else if (Character.isDigit(i)) {
                System.out.println("Els noms de persones no contenen números!’.");
            } else {
                System.out.println("CONSONANT");
            }
        }
    }
}
