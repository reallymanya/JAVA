package variables;
public class swap{
    public static void main(String[] args){
        String x = "water";
        String y = "kool-aid";
        String temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}