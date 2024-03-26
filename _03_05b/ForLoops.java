package _03_05b;

public class ForLoops {

  public static void main(String[] args) {
    // Write a for loop that prints out the phrase "I love for loops" 5 times
    for (int i = 0; i < 5; i++) {
      System.out.println("I love for loops");
    }
    // Write a for loop that prints out the numbers 1 to 10
    for (int j = 1; j <= 10; j++) {
      System.out.print(" " + j);
    }
    System.out.println('\n');
    // Write a for loop that prints out the numbers 10 to 1
    for (int j = 0; j < 10; j++) {
      System.out.print(" " + (10 - j));
    }
  }

}
