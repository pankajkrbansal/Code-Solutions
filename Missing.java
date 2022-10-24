import java.util.*;
import java.io.*;

class Missing{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elemtnst");

        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        int ArraySum = ((n+1)*(n))/2;
        // int find = 0;
        for(int i=0;i<n;i++){
            ArraySum -= arr[i];
        }

        System.out.println("Missing Number = "+ArraySum);
    }
}