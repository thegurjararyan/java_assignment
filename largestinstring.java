/*Problem Statement 9: Given a String, find the largest word in the string. */
import java.util.Scanner;
public class largestinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max)
                max = arr[i].length();
        }
        System.out.println("The largest word in the string is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == max)
                System.out.println(arr[i]);
        }
    }
}