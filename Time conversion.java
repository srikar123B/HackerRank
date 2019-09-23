/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in 12  hour format

*/



import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
         int hrs=0;
         String hh="";
         String sub=s.substring(8);
         String s2="";
         if(sub.equals("AM"))
         {
             if((s.substring(0,2)).equals("12"))
             {
                 s2="00:"+s.substring(3,5)+":"+s.substring(6,8);
             }
             else
             {
                 s2=s.substring(0,8);
             }
             return s2;
         }
         else
         {
             if((s.substring(0,2)).equals("12"))
             {
                 s2="12:"+s.substring(3,5)+":"+s.substring(6,8);
             }
             else
             {
             hrs=Integer.parseInt(s.substring(0,2));
             //mm=Integer.parseInt(s.charAt(3)+s.charAt(4));
             //ss=Integer.parseInt(s.charAt(6)+s.charAt(7));
             hrs=hrs+12;
             hh=Integer.toString(hrs);
             s2=hh+":"+s.substring(3,5)+":"+s.substring(6,8);
             }

         }
         return s2;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
