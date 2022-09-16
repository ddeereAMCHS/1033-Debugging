import java.util.Scanner;

public class Error9 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String fullName = in.nextLine();
    String firstName = fullname.substring(0, " ");
    System.out.println(firstName)
  }
}
