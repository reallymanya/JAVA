package varargss;

public class introo {
    public static void main(String[] args) {
        
        System.out.println(add(1,2,3,4));
        System.out.println(average(1,2,3,4));
    }
    //varargs = allow a method to accept a varying # of arguments
    // makes methods more flexible, no need for overloaded methods
    // java will pack the arguments into an array
    // ...(ellipsis)


static int add(int... numbers){
    int sum = 0;

    for(int number : numbers){
        sum += number;
    }
    return sum;
}

static double average(double... nums){
    double summ = 0;

    for(double num : nums){
        summ += num;
    }
    return summ / nums.length; // array property
}
}