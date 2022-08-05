import java.util.*;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String strInput = input.nextLine();

        System.out.println("Value is: " + romanToInt( strInput ) );
        input.close();
    }

    public static int romanToInt (String s) {
        // convert roman integer into integer
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int romanToInt = 0;
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        for ( int i = 0; i < s.length(); ++i ) {
            romanToInt += (map.get(s.charAt(i)));
        }

        return romanToInt; // returns the roman number in integer form
    }
}
