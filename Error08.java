import java.util.Scanner;

public class Error08 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of apples you want to buy: ");
    int numApples = Integer.parseInt(in.nextLine());
    System.out.print("Enter the cost of one apple: ");
    int costApples = Integer.parseInt(in.nextLine());

    int totalCost = numApples * costApples; System.out.println(totalCost);
    in.close();
  }
}
/*
Use inputs
3
2.50
*/
