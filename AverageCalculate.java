// Q3. Write a Java program to calculate the average of a list of numbers using a do-while loop.
import java.util.Scanner;

public class AverageCalculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        int sum = 0;
        int i = 0;

        do {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;
            i++;
        } while (i < count);

        double average = (double) sum / count;

        System.out.println("Average: " + average);

        scanner.close();  	 

    }
}

