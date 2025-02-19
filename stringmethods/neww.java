package stringmethods;

public class neww {
    public static void main(String[] args) {
        String name = "Bro Code";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim(); // removes all whitespace if there
        name = name.replace("o", "a");    
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());
    }

}
