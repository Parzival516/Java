import java.util.*;
import java.lang.*;

public class conditions {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your salary:");
        int sal=input.nextInt();
        if (sal<10000) {
            System.out.println(sal+2000);
            
        }
        else
        {
            System.out.println(sal+1000);
        }
        
    }
    
}
