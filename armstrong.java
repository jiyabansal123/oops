import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int high = sc.nextInt();

        for (int n = low; n <= high; n++) {
            int num = n;
            int result = 0;
            int digits = String.valueOf(num).length();

            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                result += Math.pow(digit, digits); // Use += to accumulate the sum
                temp /= 10;
            }

            if (result == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }

        sc.close(); // close the scanner inside the method, not outside
    }
}
