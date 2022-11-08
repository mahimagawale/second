import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 List<List<Integer>>listOfList =new ArrayList<>();
 Scanner sc =new  Scanner(System.in);
 int n= sc.nextInt();
 for(int i=0;i<n;i++){
     int d= sc.nextInt();
     List<Integer> List= new ArrayList<>();
     for(int j=0; j<d;j++){
         
         List.add(sc.nextInt());
     //System.out.println(sc.nextInt() +" ");
     }
 listOfList.add(List);
 }
 
 int q= sc.nextInt();
 for(int i=0;i<q;i++){
     int x=sc.nextInt();
     int y=sc.nextInt();
     try{
    System.out.println ( listOfList.get(x-1).get(y-1));
     }
     catch(Exception e){System.out.println("ERROR!");}

 }
    }
}