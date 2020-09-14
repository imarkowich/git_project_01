//Adding 2 integers
//import scan class
import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        //create a Scanner to get input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first int: ");
        int number1 = input.nextInt();

        System.out.print("Enter second int: ");
        int number2 = input.nextInt();

        int number3 = 1_000; //no commas, underscores for readability
        int sum = number1 + number2;

        System.out.printf("1st Int: %d%n2nd Int: %d%nSum: %d", number1, number2, sum);

    }
}
