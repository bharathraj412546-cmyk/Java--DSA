import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Income Tax Calculator");

        System.out.print("Enter your annual income: ");
        double income = sc.nextDouble();
        double tax = 0;

       
        if(income <= 250000) {
            tax = 0;
        } else if(income <= 500000) {
            tax = (income - 250000) * 0.05; 
        } else if(income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.2; 
        } else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3; 
        }

        System.out.printf("Your tax amount is: ₹%.2f\n", tax);
    }
}
