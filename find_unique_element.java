 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Collections;

public class Arraylists{
  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);
    System.out.println("Enter the size for arraylist ");
    int n = sc.nextInt();
    ArrayList<Integer> integer= new ArrayList<>();
    System.out.println("enter the elements of the list ");
    
    for(int i= 0; i<n; i++){
      int temp = sc.nextInt();

      if (!integer.contains(temp)) {
        integer.add(temp);
      }
    }
    Collections.sort(integer);
    System.out.println("list having unique elements and in sorted order "+integer);
  }
}
