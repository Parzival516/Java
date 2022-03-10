import java.util.*;
import java.lang.*;


public class function {
    public static void main(String[] args) {
        //sum();
        //sum2();
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(sum3(a, b));
        
    }
    static int sum3(int a ,int b)
    {
        int sum=a+b;
        return sum;

    }



    static int sum2()
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=a+b;
        return sum;
    }




    static void sum()
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(a+b);
    }
    
}
