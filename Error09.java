import java.util.Scanner;

public class Error09 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    String fullName = in.nextLine();
    String firstName = fullname.substring(0, " ");
    System.out.println(firstName)
  }
}
