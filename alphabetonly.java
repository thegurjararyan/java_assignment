/*Problem Statement 5 : Write a program to remove all characters from a string except 
alphabets in a given string */
package java_assignment;
import java.util.Scanner;
public class alphabetonly {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z')
            {
                System.out.print(arr[i]);
            }
        }

    }
}
