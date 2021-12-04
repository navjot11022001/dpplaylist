import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();while(t-->0){
	int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=s.nextInt();
}
int dp[]=new int[n+1];
Arrays.fill(dp,-1);
System.out.println(callme(0,dp,arr));
    }
	}
	public static int callme(int n,int dp[],int[] arr){
if(n>=arr.length)return 0;

if(dp[n]!=-1)return dp[n];
int rob=arr[n]+callme(n+2,dp,arr);
int notrob=callme(n+1,dp,arr);

return dp[n]=Math.max(rob,notrob);

	}
}
