/*Problem Statement 1: “Given a string, check if the string is palindrome or not.”  */
package java_assignment;
import java.util.Scanner;

public class pallindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
  

        boolean ispalindrome = ispalindrome(str);

        if (ispalindrome) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    public static boolean ispalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if (ch1 != ch2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
