import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer x = input.nextInt();

        System.out.println(palindrome(x));

        input.close();
    }

    public static boolean palindrome(int x) {
        String strX = Integer.toString(x);
        ArrayList<Character> arrList = new ArrayList<Character>();
        // convert string to character array
        char[] strCh = strX.toCharArray();
        
        for ( int i = strCh.length - 1; i >= 0; --i ) {
            arrList.add(strCh[i]);    
        }

        for ( int i = 0; i < strCh.length; ++i ) {
            if( strCh[i] == arrList.get(i)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
        

    }   
}
