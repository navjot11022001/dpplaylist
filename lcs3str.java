import java.util.*;
class Main{    

public static void main(String []Args){
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
String s3=s.next();

System.out.println(callme(s1,s2,s3,s1.length(),s2.length(),s3.length()));

}


 static int callme(String A, String B, String C, int n1, int n2, int n3) 
    { 
      int  a[][][]=new int[n1+1][n2+1][n3+1]; 
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                for(int k=1;k<=n3;k++){
                    if(A.charAt(i-1)==B.charAt(j-1)&&B.charAt(j-1)==C.charAt(k-1)){
                        a[i][j][k]=1+a[i-1][j-1][k-1];
                    }
                    else{
                        a[i][j][k]=Math.max(a[i-1][j][k],Math.max(a[i][j-1][k],
                        a[i][j][k-1]));
                    }
                }
            }
        }
        return a[n1][n2][n3];
    }
    
}