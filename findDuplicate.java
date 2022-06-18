import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public  class findDuplicate{
    static void duplicate(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i =0 ; i<n-1 ; i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size of array ");
        int n = sc.nextInt();
        int [] arr =  new int [n];
        System.out.println("enter the elements of array ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        duplicate(arr);
    }
}


/* next approach and faster approach for finding duplicate is hashmap */

// public  class findDuplicate{
    
//     static int duplicate(int [] arr){
//         HashSet hs = new HashSet<>();

//         for (int i = 0; i<arr.length; i++){
//             if(hs.contains(arr[i]))
//                 return arr[i];
//             else
//                 hs.add(arr[i]);
//         }
//         return 0;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter the size of array ");
//         int n = sc.nextInt();
//         int [] arr =  new int [n];
//         System.out.println("enter the elements of array ");
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         sc.close();
//         System.out.println("duplicate entry is ");
//         System.out.println(duplicate(arr));
//     }
// }