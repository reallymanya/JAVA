package OOPS;

public class constructors {
    // constructor = special method that is called when an object is created
    public static void main(String[] args) {
        Human human = new Human("manya", 18, 50.0);
        Human human2 = new Human("Sanya", 18, 45.0);

        System.out.println(human.name);
        System.out.println(human2.name);
        human2.eat();
        human.drink();
       
    }

}

class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking");
    }
}

/*
 * Agar alag naam hota toh this ki zaroorat nahi hoti:
 * java
 * Copy
 * Edit
 * class Human {
 * String personName;
 * int personAge;
 * double personWeight;
 * 
 * Human(String name, int age, double weight) {
 * personName = name;
 * personAge = age;
 * personWeight = weight;
 * }
 * }
 * Yahan this ki koi zaroorat nahi, kyunki instance variables (personName,
 * personAge, personWeight) aur constructor ke parameters (name, age, weight) ka
 * naam alag hai.
 * 
 * Short answer:
 * Jab constructor ke parameter aur class ke variables ka naam same ho, tab this
 * lagana zaroori hota hai, taki Java ko pata chale ki kis variable ki baat ho
 * rahi hai.
 */