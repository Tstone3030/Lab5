import java.util.Scanner;
public class Lab5C 
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    int x;
    int y;
    System.out.println("Enter x: ");
    x = scan.nextInt();
    System.out.println("Enter y: ");
    y = scan.nextInt();
    if (x == 0 && y == 0)
    {
      System.out.println("This point is the origin.");
    }
    else if (x == 0 && y != 0)
    {
      System.out.println("This point is on the y axis.");
    }
    else if (x != 0 && y == 0)
    {
      System.out.println("This point is on the x axis.");
    }
    else if (x > 0)
    {
      if (y > 0)
      {
        System.out.println("This point is in the first quadrant.");
      }
      else if (y < 0)
      {
        System.out.println("This point is in the third quadrant.");
      } 
    }
  }
}