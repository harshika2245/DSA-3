import java.util.Scanner;
public class MaxAndMin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("The array is: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("The maximum element is: "+max);
        System.out.println("The minimum element is: "+min);
    }
}