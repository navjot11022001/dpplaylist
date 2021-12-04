import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
		
	int n=s.nextInt();
long arr[]=new long[n];
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
long dp[]=new long[n+1];
Arrays.fill(dp,-1);
System.out.println(Math.min(callme(n-1,dp,arr),callme(n-2,dp,arr)));
    }
	
	public static long callme(int n,long cashe[],long[] cost){ 
         if(n<0)return 0;
        if(cashe[n]!=-1)return cashe[n];
        
        long one=callme(n-1,cashe,cost);
        long two=callme(n-2,cashe,cost);
        
        return cashe[n]=Math.min(one,two)+cost[n];
        
}}