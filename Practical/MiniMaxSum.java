import java.util.Scanner;
public class MiniMaxSum{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 5 integers: ");
    long[] arr = new long[5];
        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println("minSum: " + minSum + ", maxSum: " + maxSum);
}
}