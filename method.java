// Create a class named 'Time' with data members (hours, mins, secs). Define methods in this class named 'hourConvertor', 'minConvertor' and 'secConvertor'. Calculate total hours, mins and secs for any integer value (in days).
// For eg:
// Input : 2 (days)
// output: total_hours:48
// total_mins:2880
// total_secs:172800
import java.util.*;

public class method {
    public static void main(String[] args)
{
   


Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int time=scanner.nextInt();
        hourConvertor(time);
        minConvertor(time);
        secConvertor(time);
        System.out.println(hourConvertor(time));
        System.out.println(minConvertor(time));
        System.out.println(secConvertor(time));




}    



static int hourConvertor(int time){

    return time*24;


}
 
static int minConvertor(int time){

    return (time*24)*60;


}
static int secConvertor(int time){

    return (time*24)*3600;


}










}
