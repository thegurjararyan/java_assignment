/*Problem Statement 2: Given a string, write a program to count the number of vowels, 
consonants, and spaces in that string.
 */
package java_assignment;

import java.util.Scanner;
public class vowelconsonant {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countv = 0;
        int countc = 0;
        int counts = 0;
        char arr[] =str.toCharArray();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'|| arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O'|| arr[i] == 'U')
            {
                countv++;
            }
            else if(arr[i] == ' ')
            {
                counts++;
            }
            else
            {
                countc++;
            }
        }
        System.out.println("Number of vowels in the string: " + countv); 
        System.out.println("Number of consonants in the string: " + countc);
        System.out.println("Number of spaces in the string: " + counts);
        }                                                                    
    }
