import java.util.*;
import java.lang.*; 
 
 
 public class array
 {
     public static void main(String[] args) {
         //store a roll number:
         int[] rno= new int[5];
         Scanner in=new Scanner (System.in);

        //  int[] rno2={12,23,36,35,34};
        //  System.out.println(rno2[0]);

        //  String[] arr=new String[4];
        //  System.out.println(arr[0]);

        //  for (int i = 0; i < rno.length; i++) {
        //      rno[i]=in.nextInt();
             
        //  }
        //  for (int i = 0; i <= rno.length; i++) {
        //      System.out.println(rno[i]);
             
        //  }
        //  int[][] twod={
        //      {1,2,3},
        //      {4,5},
        //      {6,7,8,9}
        //  };
        int [][] arr2d= new int[3][3];
         for(int row=0;row<arr2d.length;row++) 
         {
             for (int col = 0; col < arr2d[row].length; col++) {
                 arr2d[row][col]=in.nextInt();
                }


             for(int row1=0;row1<arr2d.length;row1++) 
             {
                 for (int col = 0; col < arr2d[row].length; col++) {
                     System.out.println(arr2d[row][col]+" ");
                    }
                    System.out.println();
                
    
             };
            

         };

 }
}