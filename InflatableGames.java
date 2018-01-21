public class InflatableGames
{
   private String first;
   private String last;
	private int attendancenumber;
   private String gamesplayed;
   private int timespent;
   private int numberofguestsplayed;
   private String date;
   private String time;
   private String day;
   
   public InflatableGames(String tempfirst, String templast, int tempattendancenumber, String tempgamesplayed, int temptimespent, int tempnumberofguestsplayed, String tempdate, String temptime, String tempday)
   {
      first = tempfirst;
      last = templast;
      attendancenumber = tempattendancenumber;
      gamesplayed= tempgamesplayed;
      timespent = temptimespent;
      numberofguestsplayed = tempnumberofguestsplayed;
      date = tempdate;
      time = temptime;
      day = tempday;
    }
 }