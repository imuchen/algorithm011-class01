package sword.easy;

import java.util.HashMap;

/**
 * Created by tianguoxing on 2021/3/3 23:07.
 */
public class Sword10Fib02 {



    public static void main(String[] args) {
        Sword10Fib02 sword10Fib02 = new Sword10Fib02();
        sword10Fib02.numWays(10);
    }

    public int numWays(int n){
        if(n<=2){
            return n==0?1:n;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
            dp[i]%=1000000007;
        }
        return dp[n];
    }
}
