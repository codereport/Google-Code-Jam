// code_report Solution
// Video Link: https://youtu.be/SIRDTt89zKk
// Problem Link: https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/00000000000881da

import java.util.*;
import java.io.*;

public class Solution {
    
    public static void solve(StringBuffer s) {
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i) == 'E' ? 'S' : 'E';
            s.setCharAt(i, c);
        } 
    }

    public static void main(String []args) {
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt ();
        for (int j = 1; j <= t; j++) {
            int n = scan.nextInt ();
            StringBuffer s = new StringBuffer(scan.next());
            solve(s);
            System.out.println ("Case #" + Integer.toString(j) + ": " + s);
        }
    }
}
