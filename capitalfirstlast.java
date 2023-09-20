/*Problem Statement 7: Given a string, write a program to Capitalize the first and last 
character of each word of that string */
import java.util.Scanner;
public class capitalfirstlast {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String first = s.substring(0, 1);
            String last = s.substring(s.length() - 1);
            String mid = s.substring(1, s.length() - 1);
            System.out.println(first.toUpperCase() + mid + last.toUpperCase());
        }
    }
}
