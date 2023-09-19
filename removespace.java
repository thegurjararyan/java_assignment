/*Problem Statement 4: Given a string, write a program to remove all the whitespaces from 
the string */
package java_assignment;
import java.util.Scanner;
public class removespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("enter the string");
       String  str1 = str.replaceAll("\\s", "");
        System.out.println(str1);
    }
    
}
