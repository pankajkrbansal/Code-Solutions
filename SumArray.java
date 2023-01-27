import java.util.*;

public class SumArray {
    // adding two array & printing sum
    public static void main(String[] args) {
        int n1, n2, n;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter first array");
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter second array");
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        if(n1>n2){
            n = n1;
            int diff = n1-n2;
            int[] arr = new int[n];
            for(int j=0;j<diff;j++){
                arr[j] = arr1[j];
            }
            for(int k=diff;k<arr1.length;k++){
                arr[k] = arr1[k]+arr2[k];
            }
            
        System.out.println("Result Array");
        for(int i=0;i<arr.length;i++){
            
        }
        }else if(n2>=n1){
            n = n2;
            // n = n1;
            int diff = n2-n1;
            int[] arr = new int[n];
            for(int j=0;j<diff;j++){
                arr[j] = arr2[j];
            }
            for(int k=diff;k<arr1.length;k++){
                arr[k] = arr1[k]+arr2[k];
            }
            
        System.out.println("Result Array");
        for(int i=0;i<arr.length;i++){
            
        }
        }
        
    }
}
