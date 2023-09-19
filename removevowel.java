/*Problem Statement 3: Given a String, write a program to remove vowels from a given 
String. */
package java_assignment;
import java.util.Scanner;
public class removevowel {
    public static void main(String [] args)
    {
    Scanner sc =new Scanner(System.in);
    String str = sc.nextLine();
    char arr[] = str.toCharArray();
    for(int i = 0; i < arr.length; i++)
    {
        if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'|| arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O'|| arr[i] == 'U')
         continue;
            System.out.print(arr[i]);
    }
 
    }
    
}
