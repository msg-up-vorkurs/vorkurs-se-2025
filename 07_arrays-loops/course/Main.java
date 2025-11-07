package course;

import java.util.Arrays;

public class Main {

    static void main() {



        // create numbers array
        int[] numbers = {7, 3, 2, 10, 8, 1, 7, 4};

        // for-each-loop
        for (int number : numbers){
      //      IO.println(number);
        }

        // for-loop
        for (int i = 0; numbers.length > i; i = i +1){
       //    IO.println(numbers[i]);
        }

       // whileExample();
        doWhileExample();
    }

    // while & do-while example with dice
    private static void whileExample() {
        int result = 0;
        while (result != 6){
            result = Dice.roll();
            IO.println("Würfelergebnis: " + result);
        }

        IO.println("Ich habe eine Sechs gewürfelt");
    }

    static void doWhileExample() {
        int result = 0;

        do {
            result = Dice.roll();
            IO.println("Würfelergebnis: " + result);
        } while(result != 6);

        IO.println("Ich habe eine Sechs gewürfelt");
    }
}
