

import java.util.Scanner;
import java.util.HashMap;

public class missing_number {

    static int findNumber(int[] arr){
        int ans = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr)
            hm.put(i,1);
        for (int i=0; i<arr.length ; i++){
            if(!hm.containsKey(i))
            ans = i;
        }
        return ans ;

    }
    public static void main(String[] args ){
        Scanner sc = new Scanner( System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the element of array");
        for(int i = 0 ; i<n ; i++)
            arr[i] = sc.nextInt() ; 
        int ans  = findNumber(arr);
        System.out.println(ans);
    }    
}
