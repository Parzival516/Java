import java.lang.*;
import java.util.*;


public class casecheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0;
        int b=1;
        int c=in.nextInt();
        for (int i = 0; i <c; i++) {
            int temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);

            
        }
        
    }
}
