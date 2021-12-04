import java.util.*;
public class Main {
    public static void main (String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int arr1[]=new int[n];
int arr2[]=new int[m];
int k=s.nextInt();
for(int i=0;i<n;i++){
    arr1[i]=s.nextInt();
}

for(int i=0;i<m;i++){
    arr2[i]=s.nextInt();
}
int dp[][][]=new int[n+1][m+1][k+1];
for(int[][] ar:dp){
	for(int[] kl:ar){
    Arrays.fill(kl,-1);
}}
int ans=callme(dp,arr1,arr2,0,0,k);
System.out.println(ans);
    }
    public static int callme(int dp[][][],int arr1[],int arr2[],int i,int j,int k){
if(i==arr1.length|| j==arr2.length)return 0;
if(dp[i][j][k]!=-1)return dp[i][j][k];
int c1=0,c2=0;
if(arr1[i]==arr2[j]){
   c1=1+callme(dp,arr1, arr2, i+1, j+1,k);
}
if(k>0){
c2=1+callme(dp,arr1, arr2, i+1, j+1,k-1);
}
int c3=Math.max(callme( dp, arr1, arr2, i+1, j,k),callme( dp, arr1, arr2, i, j+1,k));

return dp[i][j][k]=Math.max(c1,Math.max(c2,c3)); 

}
    
}