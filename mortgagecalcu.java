import java.util.Scanner;

public class mortgagecalcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("principal: ");
        int principal = scanner.nextInt();
        System.out.println("annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / 100 / 12;

        System.out.println("period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * 12;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(monthlyInterest + 1, numberOfPayments) - 1);

        System.out.println("mortage: $git int" + mortgage);
        scanner.close();
    }

}
