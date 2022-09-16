import java.util.Scanner;

public class Error2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String name = in.nextLine();
    int pos = name.indexOf('e');
    String sub = name.substring(0, pos);
    System.out.println(sub);
  }
}
/*
Use input
Will
*/
