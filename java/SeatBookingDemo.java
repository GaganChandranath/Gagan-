class SeatUnavailableException extends Exception
{
   int requestedSeats, availableSeats;

   SeatUnavailableException(String msg, int r, int a)
   {
      super(msg);
      requestedSeats = r;
      availableSeats = a;
   }

   public int getRequestedSeats()
   {
      return requestedSeats;
   }

   public int getAvailableSeats()
   {
      return availableSeats;
   }
}

class Theater
{
   int availableSeats = 5;

   void bookSeats(int seats) throws SeatUnavailableException
   {
      if(seats <= 0)
         throw new IllegalArgumentException("Invalid number of seats");
   
      if(seats > availableSeats)
         throw new SeatUnavailableException("Not enough seats", seats, availableSeats);
   
      availableSeats -= seats;
   
      System.out.println("Booked " + seats + " seats");
      System.out.println("Remaining seats: " + availableSeats);
   }
}

public class SeatBookingDemo
{
   public static void main(String args[])
   {
      Theater t = new Theater();
   
      try
      {
         t.bookSeats(3);
         t.bookSeats(4);
      }
      catch(SeatUnavailableException e)
      {
         System.out.println(e.getMessage());
         System.out.println("Requested: " + e.getRequestedSeats());
         System.out.println("Available: " + e.getAvailableSeats());
      }
   }
}
