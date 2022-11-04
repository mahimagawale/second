import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code her
    
    float positives=0;
   float negatives=0;
  float  zc=0;
for(int i=0;i<arr.size();i++){
    if(arr.get(i) > 0){positives++;}
    else if(arr.get(i) == 0)
    {
        zc++;
    }
 else {
     negatives++;
     }    
    
}
positives /= arr.size();
negatives /= arr.size();
zc /= arr.size();
System.out.println(positives);
System.out.println(negatives);
System.out.println(zc);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
