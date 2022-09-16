import java.util.Scanner;

public class Error5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of apples you wish to buy: ");
    String numApples = in.nextLine();
    System.out.println("Enter the cost of one apple: ");
    String costApple = in.nextLine();

    System.out.println("The total cost of all the apples is " + (numApples * costApple));
  }
}
