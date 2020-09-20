import java.util.Scanner;
public class Lab5B 
{
  public static void main(String [] args )
  {
    Scanner scan = new Scanner (System.in);
    int Today;
    int NextMeeting;
    int DayOfWeek;
    System.out.println("Enter a number that represents today (Sunday==0, Monday==1,...)");
    Today = scan.nextInt();
    System.out.println("Enter the number of days until the meeting: ");
    NextMeeting = scan.nextInt();
    DayOfWeek = (Today + NextMeeting) % 7;
    switch (DayOfWeek)
    {
      case 0:
      System.out.println("Meeting day is Sunday");
      break;
      case 1:
      System.out.println("Meeting day is Monday");
      break;
      case 2:
      System.out.println("Meeting day is Tuesday");
      break;
      case 3:
      System.out.println("Meeting day is Wednesday");
      break;
      case 4:
      System.out.println("Meeting day is Thursday");
      break;
      case 5:
      System.out.println("Meeting day is Friday");
      break;
      case 6:
      System.out.println("Meeting day is Saturday");
      break;
    }
  }  
}