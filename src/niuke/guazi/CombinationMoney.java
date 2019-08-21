package niuke.guazi;

public class CombinationMoney {
    
    /**
     * 
     * 有1分，2分，5分，10分四种硬币，每种硬币数量无限，给定n分钱(n<10000)，有多少中组合可以组成n分钱？
     * 
     * 
     * 动态规划的经典题，直接copy了一段代码。对于每个n，都可以分解开来，它的组合数=每个硬币（n-面值）的组合数之和。
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

	