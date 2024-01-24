import java.util.Scanner;

public class Range1To10 {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  
  public static int RangeCalc(int number) {
    boolean run = true;
    while (run) {
      Scanner input = new Scanner(System.in);
      try {
        System.out.print("Enter a number between 1 - 10: ");
        number = input.nextInt();
        if (number < 1 || number > 10) {
          System.out.println("");
            System.out.println(ANSI_YELLOW +"That's not a valid range!" + ANSI_RESET);
          System.out.println("");
        }
        else {
          run = false;
          return number;
        }
      }
      catch(Exception e) {
        System.out.println("");
        System.out.println(ANSI_YELLOW + "That's not a valid input type!" + ANSI_RESET);
        System.out.println("");
      }
    }
    return(number);
  }
}