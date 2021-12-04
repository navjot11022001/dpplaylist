import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)arr[i]=s.nextInt();
int dp[]=new int[n];
Arrays.fill(dp,1);
for(int i=1;i<n;i++){
	for(int j=0;j<i;j++){
if(arr[i]>arr[j]){
	dp[i]=Math.max(dp[i],dp[j]+1);
}
	}
}
int max=0;
for(int i:dp){
	max=Math.max(max,i);
}
System.out.println(max);
    }
}