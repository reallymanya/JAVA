package statickeyword;

class Friend{
    int num_of_friends;
    String name;
    
    Friend(String name){
        this.name = name;
        num_of_friends++;
    }
}
public class intro {
    public static void main(String[] args) {
        //static = Makes a variable or method belong to the class
        // rather than to any specific object.
        // commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Spongebob");
        System.out.println(friend1.name);
        System.out.println(friend1.num_of_friends);
    }
}
