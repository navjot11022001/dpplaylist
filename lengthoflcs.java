import java.util.*;
class Main{    

public static void main(String []Args){
Scanner s=new Scanner(System.in);
String s1=s.next();
String s2=s.next();
System.out.println(BottomUp(s1.length(),s2.length(),s1,s2));

}



 static int BottomUp(int x,int y,String s1,String s2)
    {
        int strg[][]=new int[x+1][y+1];
        for(int i=x-1;i>=0;i--)
        {
            for(int j=y-1;j>=0;j--)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    strg[i][j]=strg[i+1][j+1]+1;
                }
                else
                {
                    strg[i][j]=Math.max(strg[i+1][j],strg[i][j+1]);
                }
            }
        }
        return strg[0][0];
        
    }
    
}