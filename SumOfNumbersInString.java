import java.util.Scanner;
  
public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int sum = calculateSumOfNumbers(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + sum);
        
    }

    public static int calculateSumOfNumbers(String input) {
        int sum = 0;
        int currentNumber = 0;
        boolean inNumber = false;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                inNumber = true;
            } else {
                if (inNumber) {
                    sum += currentNumber;
                    currentNumber = 0;
                    inNumber = false;
                }
            }
        }
        if (inNumber) {
            sum += currentNumber;
        }

        return sum;
    }
}
