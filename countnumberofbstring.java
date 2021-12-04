import java.util.*;
public class Main {
    public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0){
int n=s.nextInt();

System.out.println(callme(n));

	}
		}	static long callme(int n){
long a[]=new long[n+1];
long b[]=new long[n+1];
a[0]=b[0]=1;

for(int i=1;i<n;i++){
	a[i]=a[i-1]+b[i-1];
	b[i]=a[i-1];
}

return a[n-1]+b[n-1];
		}
    }
