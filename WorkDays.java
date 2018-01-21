public class WorkDays
{
   private String starttime;
   private String endtime;
   private String date;
   private double totalhours;
   private String deptworked;
   private String ID;
   private String first;
   private String last;
	
   
   public WorkDays (String start, String end, String tempdate, double hours, String deptt, String IDconstructor, String firstt, String lastt)
      {
         starttime = start;
         endtime = end;
         date = tempdate;
         totalhours = hours;
         deptworked = deptt;
         ID = IDconstructor;
         first = firstt;
         last = lastt;
 		} 
	public WorkDays (String offdate, String firsttt, String lasttt)
		{
			date = offdate;
			first = firsttt;
			last = lasttt;
			ID = "";
         starttime = "";
		}

   public String toString ()
      {
         return "The employee has the following work schedule for that day: " + 
                "\n Date: " + date +
                "\n First Name: " + first +
                "\n Last Name: " + last + 
                "\n ID #: " + ID +
                "\n Start Time: " + starttime +
                "\n End Time: " + endtime + 
                "\n Total Hours: " + totalhours + 
                "\n Department: " + deptworked ;    
       }
		  
		 
		 //accessor
		 public String getFirst()
		 	{
				return first;
			}
       public String getLast()
         {
            return last;
         } 
		 //accessoreriei	
		 public String getID()
		 	{
				return ID;
			}
        public String getStartTime()
        {
         return starttime;
         }
			
		public String getDate()
			{
				return date;
			}	
}