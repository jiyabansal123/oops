import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)

                sum += i;

        }
        if (sum == num) {
            System.out.println("perfect number");
        } else {
            System.out.println("not a perfect number");
        }
        sc.close();
    }
}