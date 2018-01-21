public class Bowling
{
   private String first;
   private String last;
	private int attendancenumber;
   private int score;
   private int games;
   private String date;
   private String time;
   private String day;
   
   public Bowling (String tempfirst, String templast, int tempattendancenumber, int tempscore, int tempgames, String tempdate, String temptime, String tempday)
   {
      first = tempfirst;
      last = templast;
      attendancenumber = tempattendancenumber;
      score = tempscore;
      games = tempgames;
      date = tempdate;
      time = temptime;
      day = tempday;
    }
 }