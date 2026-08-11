import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Prime digits: ");
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                System.out.print(digit + " ");
            }
            n = n / 10;
        }
    }
}