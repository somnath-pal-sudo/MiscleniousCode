package InterviewPrograms;

import java.util.Scanner;

class Swappingwithoutthirdvar
{
   public static void main(String args[])
   {
      int x, y;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
  
      x = in.nextInt();
      y = in.nextInt();
  
      System.out.println("Before Swapping\n x = "+x+"\n y = "+y);
  
      x = x + y;
      y = x - y;
      x = x - y;
  
      System.out.println("After Swapping without third variable\n x = "+x+"\ny = "+y);
   }
}
