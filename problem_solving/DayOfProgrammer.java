import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    int n[]= new int []{31,28,31,30,31,30,31,31};
      int a=256;
     int sum=0, diff=0;
     if(year == 1918)
         return "26.09."+Integer.toString(year);
         if(year <= 1917)
         {
             if(year%4==0)
             n[1]=29;
             
         }
         if(((year%4==0)&&(year%100!=0))|| year %400==0)
         n[1]=29;
         for(int p:n)
         sum+=p;
         diff =a-sum;
         return Integer.toString(diff)+".09."+Integer.toString(year);
     
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}