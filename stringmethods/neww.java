package stringmethods;

public class neww {
    public static void main(String[] args) {
        String name = "Manya Takkar";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("a");

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim(); // removes all whitespace if there
        //name = name.replace("o", "a");    //replaces a particular character with another character
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

       /*if(name.isEmpty()){
        System.out.println("Your name is empty");
       }
       else{
        System.out.println("Hello "+name);
       }
    */
        /*if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }else{
            System.out.println("Your name doesnt contain a space");
        }
    */

    /*if(name.equals("password")){ // .equals is case sensitive
        System.out.println("Your name can't be password");
    }else{
        System.out.println("Hello "+name);
    }
*/
    if(name.equalsIgnoreCase("password")){ // use  .equalsIgnoreCase to ignore case sensitivity
        System.out.println("Your name can't be password");
    }else{
        System.out.println("Hello "+name);
    }
    }
}
