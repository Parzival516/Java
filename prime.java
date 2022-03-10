import java.lang.*;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans);

        
    }
    static boolean isPrime(int n)
    {
        if (n<=1) {
            return false;
            
        }
        if (n%2==0||n%3==0||n%5==0) {
            return false;
            
        }
        return true;
    }
    
}
