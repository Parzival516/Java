import java.util.*;
import java.lang.*;


public class temperature {
    public static void main(String[] args) {
        System.out.println("Enter temeperature in celcius:");
        Scanner tmp=new Scanner(System.in);
        float tmpc=tmp.nextFloat();
        System.out.println((tmpc*2)+30);
    }
    
}
