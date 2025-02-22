/*
 * wrapper class = provides a way to use primitive data types as reference data types 
 * reference data types contains useful methods can be used with collections (ex. ArrayList)
 * 
 * // primitive  //wrapper
 * //----------  //-------
 *  boolean      Boolean
 *  char         Character
 *  int          Integer
 *  double       Double
 * 
 * autoboxing = the automatic conversion that the
 *               Java compiler makes between primitive types and their corresponding object wrapper classes
 * unboxing = the reverse of autoboxing. automatic conv of wrapper classes to primitive
 */

package wrapper;

public class intro {
    public static void main(String[] args) {
        int parsedNum = Integer.parseInt("100"); // Converts String to int
        System.out.println("Parsed int from String: " + parsedNum);



        double value = 12.34;
        Double obj = value; // Autoboxing (double → Double)
        double newValue = obj; // Unboxing (Double → double)
        System.out.println("Wrapper Object: " + obj);
        System.out.println("Primitive: " + newValue);



        int a = 35, b = 90;
        int max = Integer.max(a, b); // Finds the maximum
        System.out.println("Maximum: " + max);




        char ch = '5';
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is NOT a digit.");
        }



        String str = "75";
        int intValue = Integer.parseInt(str);
        float floatValue = Float.parseFloat(str);
        double doubleValue = Double.parseDouble(str);

        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

    }
}