package printff;
//printf() = method used to format an output
// %[flags][width][.precision][conversion-character]
public class neww{
    public static void main(String[] args){
        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
// [conversion-character]
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);
        System.out.println("\n");
// [precision]
        double price1 = 9.99;
        double price2 = 9.99;
        double price3 = 54.01;
        double price4 = -78.34;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);
        System.out.printf("%.2f\n", price4);

        // [flags]
        
        // + = output plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed  in a ()
        // space = display a minus if negative, space is positive

        System.out.printf("%+.1f\n", price1);
        System.out.printf("%+.2f\n", price4);

        double z = 9000.99;
        double y = 1000000.15;

        System.out.printf("%,.2f\n", z);
        System.out.printf("%,.2f\n", y);

        System.out.printf("%(.2f\n", price4);
        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n", price3);

        // [width]

        //0 = zero padding
        //number = right justified padding
        // negative number = left justified padding

        int id1 =1 ;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;


        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        System.out.printf("Hellp %10s", name);

     
    }
}