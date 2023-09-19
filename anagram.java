/*Problem Statement 8: Given two strings, check if two strings are anagrams of each other or 
not.
 */
package java_assignment;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        int flag = 0;
        if(l1 == l2)
        {
            for(int i=0;i<l1;i++)
            {
                for(int j=0;j<l2;j++)
                {
                    if(s1.charAt(i) == s2.charAt(j))
                    {
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)
                {
                    System.out.println("Not an anagram");
                    break;
                }
            }
            if(flag == 1)
            {
                System.out.println("Anagram");
            }
        }
        else
        {
            System.out.println("Not an anagram");
        }
    }
}



      