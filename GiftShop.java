public class GiftShop
{
   private String first;
   private String last;
   private int attendancenumber;
   private double purchase;
   private int num;
   private String time;
   private String day;
   private String date;
   
  public GiftShop (String tempfirst, String templast, int tempattendancenumber, double temppurchase, int tempnum, String temptime, String tempday, String tempdate)
  {
      first = tempfirst;
      last = templast;
      attendancenumber = tempattendancenumber;
      purchase = temppurchase;
      num = tempnum;
      time = temptime;
      day = tempday;
      date = tempdate;
   }
}