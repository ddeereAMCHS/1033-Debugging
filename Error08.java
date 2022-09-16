import java.util.Scanner;

public class Error1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of apples you want to buy: ");
    int numApples = in.nextInt();
    System.out.print("Enter the cost of one apple: ");
    int costApples = in.nextInt();

    int totalCost = numApples * costApples; System.out.println(totalCost);
    in.close();
  }
}
/*
Use inputs
3
2.50
*/
