import java.util.Scanner;
public class Lab5A 
{
  public static void main (String [] args)
  {
    String Symptoms;
    String Contact;
    Scanner scan = new Scanner (System.in);
    System.out.println("Experiencing severe symptoms (Y/N)? ");
    Symptoms = scan.nextLine();
    if (Symptoms.equals("Y"))
    {
      System.out.println("Seek emergency care.");
    }
    else 
    {
      System.out.println("Close contact with someone who has COVID (Y/N)? ");
      Contact = scan.nextLine();
      if (Contact.equals("Y"))
      {
        System.out.println("Quarantine and get tested if you feel sick.");
      }
      else 
      {
        System.out.println("If you experience other symptoms, isolate and get tested.");
      }
    }
  }
}