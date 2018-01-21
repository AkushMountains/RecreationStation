public class FoodnDrinks
{
   private String first;
   private String last;
   private int attendancenumber;
   private String storename;
   private String seating;
   private String type;
   private double purchase;
   private String time;
   private String day;
   private String date;
   
   public FoodnDrinks (String tempfirst, String templast, int tempattendancenumber, String tempstorename, String tempseating, String temptype, double temppurchase, String temptime, String tempday, String tempdate)
   {
      first = tempfirst;
      last = templast;
      attendancenumber = tempattendancenumber;
      storename = tempstorename;
      seating = tempseating;
      type = temptype;
      purchase = temppurchase;
      time = temptime;
      day= tempday;
      date = tempdate;
    }
 }