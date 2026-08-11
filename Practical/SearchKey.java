import java.util.Scanner;
public class SearchKey{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("The array is: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("key = ");
        int key = sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==key){
                System.out.println("The key is found at index:"+i);
                return;
            }
        }
        System.out.println("The key is not found");
    }
}