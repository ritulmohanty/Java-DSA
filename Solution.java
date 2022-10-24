package ConditionalDays;

import java.util.*;


public class Solution{
    public static void main(String []argh){
        int s = 0;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                s = (int) (s + a + (b * Math.pow(2, j)));
                System.out.print(s + " ");
            }
        }
        
        
        in.close();
    }
}
