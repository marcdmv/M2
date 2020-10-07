package itacademy;

public class Text {

    protected String text;
    protected char[] textArray;

    public Text(String text) {
        this.text = text;
    }

    public char[] textToCharArray(String text){
        return text.toCharArray();
    }

}
