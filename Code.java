import java.util.*;

// Subarray of arrays
class Code{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }   

        // find Subarray for 1 2 3 
        // 1
        // 1 2
        // 1 2 3
        // 2 
        // 2 3
        // 3

        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}