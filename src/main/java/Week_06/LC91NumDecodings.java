package Week_06;

/**
 * Desc:
 *
 * @Author Created by tiangx
 * @Date 2020/8/9 21:14
 */
public class LC91NumDecodings {
    public int numDecodings(String s) {
        char[] array = s.toCharArray();
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = array[0]=='0'?0:1;
        if(s.length()<=1) {
            return dp[1];
        }
        for(int i=2;i<=s.length();i++){
            int x = (array[i-2]-'0')*10+(array[i-1]-'0');
            if(array[i-1]=='0' && array[i-2]=='0'){
                return 0;
            }else if(array[i-2]=='0'){
                dp[i] = dp[i-1];
            }else if(array[i-1]=='0'){
                if(x>26) {
                    return 0;
                }
                dp[i] = dp[i-2];
            }else if(x>26){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[dp.length-1];
    }
}
