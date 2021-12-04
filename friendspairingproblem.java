import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);

int t=s.nextInt();
while(t-->0){
int n=s.nextInt();
long dp[]=new long[n+1];
Arrays.fill(dp,-1);
System.out.println(callme(dp,n));

}}
public static long callme(long dp[],int n){
if(n<=2)return n;
if(dp[n]!=-1)return dp[n];

long a=(((n-1))*callme(dp,n-2));
//n-1 mtlb h ki ek bnde ka pair bnne ka chance bche hue element ke sath h
//n-2 mtlb pair hogya to bakio ko dekh
//navjot
long b=callme(dp,n-1);
 return dp[n]=a+b;
}

    
}
