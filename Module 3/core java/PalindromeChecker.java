import java.util.Scanner;

public class PalindromeChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed) ? "Palindrome" : "Not a palindrome");
    }
}
