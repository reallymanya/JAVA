package methods;

public class introo {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different
        // parameters
        // method name + parameters = method signature

        System.out.println(add(4, 5));
        System.out.println(add(4, 5, 9));
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method 2");
        return a + b + c;
    }
}
