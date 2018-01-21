public class Theater 
{
   private String first;
   private String last;
   private int attendancenumber;
   private String namesofmovies;
   private int numadults;
   private int numchildren;
   private String rating;
   private double purchase;
   private String date;
   private String time;
   private String day;
   
   public Theater (String tempfirst, String templast, String tempnamesofmovies, int tempattendancenumber, int tempnumadults, int tempnumchildren, String temprating, double temppurchase, String tempdate, String temptime, String tempday)
   {
      first = tempfirst;
      last = templast;
      namesofmovies = tempnamesofmovies;
      attendancenumber = tempattendancenumber;
      numadults = tempnumadults;
      numchildren = tempnumchildren;
      rating = temprating;
      purchase = temppurchase;
      date = tempdate;
      time = temptime;
      day = tempday;
    }
 }