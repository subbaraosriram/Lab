public class GreenBus{
	public static void main(String args[])
	{
		Bus b1 = new Bus();
		Passenger p = new Passenger(2,b1,"sriram");
		Passenger c = new Passenger(2,b1,"ramani");
		p.start();
		c.start();
	}
}
class Passenger extends Thread
{
	private int seatsNeeded;
	Passenger(int seatsNeeded,Runnable target,String name)
	{
		super(target,name);
		this.seatsNeeded=seatsNeeded;
	}
	public int getSeatsNeeded()
	{
		return seatsNeeded;
	}
}
class Bus implements Runnable
{
	      private int totalSeatsAvailable;
	      public int getTotalSeatsAvailable()
         {
		    return totalSeatsAvailable;
	     }
	      public boolean bookTicket(int seats,String name)
	    {
		    System.out.println("Welcome to Bhuma Bus\n"+Thread.currentThread().getName()+" Number of tickets available "+this.getTotalSeatsAvailable());
		    if(seats > this.getTotalSeatsAvailable())
		    {
			     return false;
		    }
		    else
		    {
			     totalSeatsAvailable = totalSeatsAvailable-seats;
			     return true;
		    }
        }
	      public void run()
	   {
		   Passenger pt = (Passenger)Thread.currentThread();
		   boolean ticketsBooked = this.bookTicket(pt.getSeatsNeeded(),pt.getName());
		   if(ticketsBooked == true)
		   {
			System.out.println("Congrats Mr."+Thread.currentThread().getName());
			System.out.println("Number of tickets booked"+pt.getSeatsNeeded());
		   }
		  else
		  {
		  System.out.println("Number of tickets booked"+pt.getSeatsNeeded());
		  }
	   }
}