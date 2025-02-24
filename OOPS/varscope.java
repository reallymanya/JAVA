package OOPS;

import java.util.Random;

// default way , to access methods of diceroller in roll we had to create arguments
class DiceRoller {
    DiceRoller() {
        Random random = new Random();
        int num = 0;
        roll(random, num);
    }

    void roll(Random random, int num) {
        num = random.nextInt(6) + 1;
        System.out.println(num);
    }
}

// other way : using global, declaring outsdie the method
class DiceRoller2 {
    Random random;
    int num = 0;

    DiceRoller2() {
        Random random = new Random();
        roll(random, num);
    }

    void roll(Random random, int num) {
        num = random.nextInt(6) + 1;
        System.out.println(num);
    }
}

public class varscope {
    public static void main(String[] args) {
        // local = declared inside a method
        // visible only to that method

        // global = declared outside a method, but within a class
        // visible to all parts of a class
        DiceRoller diceRoller = new DiceRoller();
        DiceRoller2 diceRoller2 = new DiceRoller2();
    }
}
