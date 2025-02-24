package OOPS;

class Pizza{

    String bread;
    String sauce;
    String cheese;
    String toppings;

    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }


    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String toppings){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }
}
public class overloadconst {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors
       // within a class with the same name,
       // but have different parameters
       // name + parameters = signature

       Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella");
       System.out.println("Here are the ingredients of your pizza: ");
       System.out.println(pizza.bread);
       System.out.println(pizza.sauce);
       System.out.println(pizza.cheese);
     
    }
}
