
package sumofNthdigits;
import java.util.Scanner;
public class SumOfNthDigits {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    
   System.out.println("Enter the number:");
   int num = sc.nextInt();

      int  rem = 0, sum =0, hold;
      hold = num;
      
      while (num>0)
      {
          rem = num %10;
          sum = sum + rem;
          num = num/10;
      }
      {
          System.out.println("Sum of digits of " + hold + "is:" + sum);
      }
    }
    
}
