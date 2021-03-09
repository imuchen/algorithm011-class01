package sword.easy;

import java.util.HashMap;

/**
 * Created by tianguoxing on 2021/3/3 23:07.
 */
public class Sword10Fib01 {
    private HashMap hashMap = new HashMap<>();

    public int fib(int n) {
        int midResult = subFib(n);
        return midResult % 1000000007;
    }

    private int subFib(int n) {
        if (n <= 1) {
            return n;
        }
        if (hashMap.get(n) != null) {
            return Integer.parseInt(hashMap.get(n).toString());
        } else {
            int a = subFib(n - 1) + subFib(n - 2);
            hashMap.put(n, a);
            return a;
        }
    }


    public static void main(String[] args) {
        Sword10Fib01 sword10Fib01 = new Sword10Fib01();
        sword10Fib01.fib(10);
    }

    public int fib2(int n){
        if(n==0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
            dp[i]%=1000000007;
        }
        return dp[n];
    }
}
