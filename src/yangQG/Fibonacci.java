package yangQG;

import java.math.BigInteger;
import java.util.Date;

public class Fibonacci {
	public static void main(String[] args){
		Date start_time =  new Date(); //开始时间
        int n = 40;
        BigInteger t1 = rec_fib(n);  // 递归法求解--102334155
//        BigInteger t1 = DP_fib(n);  // 动态规划法求解--102334155
        Date end_time =  new Date(); // 结束时间
        Long cost_time = end_time.getTime()-start_time.getTime();  // 计算时间，返回毫秒数
        System.out.println(String.format("The fib(%d) is %s.\nCost time is %.3fs.", n, t1, cost_time*1.0/1000));
	}
	
	//归纳法
	public static BigInteger rec_fib(int n){
		if(n==0)
			return BigInteger.ZERO;
		if(n==1)
			return BigInteger.ONE;
		return rec_fib(n-2).add(rec_fib(n-1));
	}
	
	//动态规划发DP
	public static BigInteger DP_fib(int n){
		if(n==0)
			return BigInteger.ZERO;
		if(n==1)
			return BigInteger.ONE;
		BigInteger prev = BigInteger.ZERO;
		BigInteger curr = BigInteger.ONE;
		BigInteger temp;
		for(int i=2; i<=n; i++){
			temp = prev.add(curr);
			prev = curr;
			curr = temp;
		}
		return curr;
	}
}
