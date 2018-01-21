public class CustomerAttendance
{
   private String first;
   private String last;
   private int attendancenumber;
   private double totalpurchase;
   private int rating;
   private String deptvisited;
   private String satisfaction;
   private String timeOfday;
   private String day;
   private String date;
    
   public CustomerAttendance (String tempfirst, String templast, int tempattendance, double temppurchase, int temprating, String tempdept, String tempsatisfaction, String temptime, String tempday, String tempdate)
      {
         first = tempfirst;
         last = templast;
         attendancenumber = tempattendance;
         totalpurchase = temppurchase;
         rating = temprating;
         deptvisited = tempdept;
         satisfaction = tempsatisfaction;
         timeOfday = temptime;
         day = tempday;
         date = tempdate;
       }
       
    public String toString ()
      {
         return "\n First Name is: " + first +
                "\n Last Name is: " + last +
                "\n Attendance number: " + attendancenumber +
                "\n Total Purchase: " + totalpurchase + 
                "\n Store Rating: " + rating + 
                "\n Department(s) visited: " + deptvisited + 
                "\n Satisfied with experience?: " + satisfaction +   
                "\n Time of Day entered: " + timeOfday + 
                "\n Day of Week: " + day + 
                "\n Date (MM/DD/YYYY): " + date + "\n";
      }
   
   
   
}  