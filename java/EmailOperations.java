import java.util.Scanner;

class EmailOperations
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter email address:");
      String email = sc.nextLine().trim();
   
      System.out.println("Length: " + email.length());
   
      int position = email.indexOf('@');
      String username = email.substring(0, position);
      System.out.println("Username: " + username);
   
      String domain = email.substring(position + 1);
      System.out.println("Domain: " + domain);
   
      if(domain.equals("bmsce.ac.in"))
         System.out.println("Belongs to BMSCE");
      else
         System.out.println("Does not belong to BMSCE");
   
      System.out.println("Lowercase: " + email.toLowerCase());
   
      System.out.println("Enter prefix:");
      String prefix = sc.nextLine();
   
      if(email.startsWith(prefix))
         System.out.println("Starts with given prefix");
      else
         System.out.println("Does not start with given prefix");
   
      if(email.endsWith("bmsce.ac.in"))
         System.out.println("Valid domain");
      else
         System.out.println("Invalid domain");
   
      String newEmail = email.replace("bmsce.ac.in", "cse.bmsce.ac.in");
      System.out.println("Updated email: " + newEmail);
   
      System.out.println("Enter word to search:");
      String word = sc.nextLine();
   
      if(email.contains(word))
         System.out.println("Email contains the word");
      else
         System.out.println("Email does not contain the word");
   
      System.out.println("Trimmed email: " + email);
   
      System.out.println("Enter another email:");
      String email2 = sc.nextLine().trim();
   
      if(email.equalsIgnoreCase(email2))
         System.out.println("Both emails are identical");
      else
         System.out.println("Emails are different");
   
      sc.close();
   }
}