
public class Employee 
{
	   private String first;
	   private String last;
	   private String ID;
	   private String DOB; 
	   private double salary;
	   private String benefits; // instance variables
	   private int expertise;
	   private String favcolor;
	   private String favcandy;
	   private String dept;
	   private String gender;
	   private String medical;
	   private int age;
	   private String education;
	   private String allergy;
	   private String phonenum;
	   private String email;
	   private String address;
	   private String emergencynum;
	   
	   
	   public Employee (String tempfirst,String templast, String tempID, String tempDOB, double tempsalary, String tempdept, String tempbenefits, int tempexpertise, String tempfavcolor, String tempfavcandy, String tempgender, String tempmedical, int tempage, String tempeducation, String tempallergy, String tempphonenum, String tempemail, String tempaddress, String tempemergencynum )
	      { 
	         first = tempfirst;
	         last = templast;
	         ID = tempID;
	         DOB = tempDOB;
	         salary = tempsalary;
	         dept = tempdept;
	         benefits = tempbenefits; // assigns instance variables for an employee values as determined in the driver 
	         expertise = tempexpertise;
	         favcolor = tempfavcolor;
	         favcandy = tempfavcandy;
	         gender = tempgender;
	         medical = tempmedical;
	         age = tempage;
	         education = tempeducation;
	         allergy = tempallergy;
	         phonenum = tempphonenum;
	         email = tempemail;
	         address = tempaddress;
	         emergencynum = tempemergencynum;
	         
	        }
	    public String toString ()
	      {
	        return "The employee you have requested has the following information stored: "+
	               "\n First Name is: " + first +
	               "\n Last Name is: " + last + 
	               "\n ID number is: " + ID + 
	               "\n Date Of Birth in MMDDYY form is: " + DOB +
	               "\n Yearly salary is: " + salary + 
	               "\n Works in Department of: " + dept +
	               "\n Benefits receieved is(are): " + benefits + 
	               "\n Level of expertise/resposibilty on a scale of 1-10 with one being unresponsible to 10 being extremely responsible: " + expertise +
	               "\n Favorite Color is: " + favcolor + 
	               "\n Favorite candy is: " + favcandy + 
	               "\n Gender is: " + gender +
	               "\n Medical Restrictions: " + medical + 
	               "\n Age is: " + age + 
	               "\n Highest Level of Education: " + education + 
	               "\n Email is: " + email + 
	               "\n Address is: " + address + 
	               "\n Emergency Contact Number: " + emergencynum;
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
	        
	     //accessor     
	      public String getID()
	         {
	            return ID;
	         }
	      //accessor 
	      public String getDOB()
	         {
	            return DOB;
	         }
	      
	      
	      
	      
	        
	   }
