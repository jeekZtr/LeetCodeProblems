package niuke.guazi;

public class CombinationMoney {
    
    /**
     * 
     * 有1分，2分，5分，10分四种硬币，每种硬币数量无限，给定n分钱(n<10000)，有多少中组合可以组成n分钱？
     * 
     * @author zhngtr-mi
     * @since 2019-08-21
     */
    public static void main(String args[]) {
         
    }
    public static int countWays(int[] coins,int n) {   
        
        int[] dp = new int[n+1];         
        dp[0] = 1;  
        for(int i = 0;i < coins.length;++i){  
            for(int j = coins[i];j <= n;++j){ 
                dp[j] += dp[j-coins[i]];   
            }  
        }  
        return dp[n];  
    }
}

	