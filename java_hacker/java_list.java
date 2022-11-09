import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc= new Scanner(System.in);
int n= sc.nextInt();
List<Integer> intlist =new ArrayList<>(n);
for(int i=0;i<n;i++)
{
    intlist.add(sc.nextInt());
}
int q =sc.nextInt();
for(int i=0;i<q;i++)
 {
     String com= sc.next();
     if(com.equals("Insert")){
         int x= sc.nextInt();
         int y= sc.nextInt();
         intlist.add(x,y);
     }if(com.equals("Delete")){
         int x=sc.nextInt();
         intlist.remove(x);
     }
     
 } 
    
    for(Integer i : intlist){
        System.out.print(i + " ");
    }
    }
} 