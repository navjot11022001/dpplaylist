import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);

int k=s.nextInt();
int n=s.nextInt();
int arr[]=new int[k];
int arr2[]=new int[k];

int cashe[][]=new int[k+1][n+1];
for(int[] ar:cashe){
	Arrays.fill(ar,-1);
}
for(int i=0;i<k;i++){
	arr[i]=s.nextInt();
}

for(int i=0;i<k;i++){
	arr2[i]=s.nextInt();
}

System.out.println(callme(arr,arr2,cashe, 0,n));
	}
public static int callme(int arr[],int arr2[],int cashe[][],int i,int amount){

// if(amount==0)return 0;
if(i>=arr.length)return 0;
if(cashe[i][amount]!=-1)return cashe[i][amount];
int take=0;
if(amount>=arr[i]){

 take=arr2[i]+callme(arr,arr2,cashe,i,amount-arr[i]);

}
int dont=callme(arr,arr2,cashe,i+1,amount);
return cashe[i][amount]=Math.max(take,dont);
}
 
    }

