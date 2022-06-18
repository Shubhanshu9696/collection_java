/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/

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


                    //faster approcah

// import java.util.Scanner;
// import java.util.HashMap;

// public class missing_number {

//     static int findNumber(int[] arr){
//         int sum = (nums.length)*(nums.length+1)/2;
//         for (int i : nums)
//             sum = sum-i;
//         return sum;
//     }
    
//     public static void main(String[] args ){
//         Scanner sc = new Scanner( System.in);
//         System.out.println("enter the size of array");
//         int n = sc.nextInt();
//         int [] arr = new int[n];
//         System.out.println("enter the element of array");
//         for(int i = 0 ; i<n ; i++)
//             arr[i] = sc.nextInt() ; 
//         int ans  = findNumber(arr);
//         System.out.println(ans);
//     }    
// }
