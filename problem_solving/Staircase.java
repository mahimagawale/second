import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
for(int numSymbols =1; numSymbols<=n;numSymbols++){
    int numSpaces= n-numSymbols;
    for(int i=0;i<numSpaces;i++){
        System.out.print(' ');
    //System.out.println(numSpaces + " "+ numSymbols);
    }    
     for(int i=0;i<numSymbols;i++){
        System.out.print('#');}
    System.out.println();
    }    
}
    }
