package _03_07b;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoops {

  public static void main(String[] args) {
    int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19 };
    // Write an enhanced for loop to print out each prime number in the array.
    for (int i : primeNumbers) {
      System.out.print(" " + i);
    }
    System.out.println();
    List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
    // Write an enhanced for loop to print out each week day in the list.
    for (String Array : weekDays) {
      System.out.print(" " + Array);
    }
    System.out.println();
    int[] randomNumbers = { 23, 51, 72, 84, 1, 60, 34, 102 };
    // Write an enhanced for loop to print out the numbers in the array that are
    // greater than 50.
    for (int number : randomNumbers) {
      if (number > 50)
        System.out.print(" " + number);
    }
    System.out.println();
  }

}
