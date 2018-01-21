import java.util.ArrayList;
import java.util.Scanner;
public class RecreationStation {

	
	public static void main(String[] args)
	{
		Scanner scan= new	Scanner (System.in);
	      ArrayList <Employee>	ListOfEmployees =	new ArrayList <Employee>();
	      ArrayList <WorkDays>	WeeklyWork = new ArrayList	<WorkDays>();
	      ArrayList <CustomerAttendance> CustomerAttendance = new ArrayList <CustomerAttendance>();
	      ArrayList <Swimming> Swimming = new ArrayList <Swimming>();
	      ArrayList <Bowling> Bowling = new ArrayList <Bowling>();
	      ArrayList <InflatableGames> InflatableGames = new ArrayList <InflatableGames>();
	      ArrayList <Theater> Theater = new ArrayList <Theater>();
	      ArrayList <FoodnDrinks> FoodnDrinks = new ArrayList <FoodnDrinks>();
	      ArrayList <GiftShop> GiftShop = new ArrayList <GiftShop>();
	      int count2 = 1;
	      int daycontrol = 1;
	      
	   
	   //enters employees into the database 
	      System.out.println	("Do you wish to enter Employees into the system? Enter 1 for yes, 0 for no");
	      int enteremploopcontrol = scan.nextInt();
	      if(enteremploopcontrol==1)
	      {	 
	         while	(enteremploopcontrol !=0) //fills	ListOfEmployees with	Employee	variables 
	         {
	        	System.out.println ("Please enter the first name of the employee");
	            String firstAlias = scan.next();
	            scan.nextLine();
                  System.out.println ("Is the first name " + firstAlias + " correct?\n Enter 1 for yes and 0 for no");
                  int firstcheck = scan.nextInt(); //since this is vital information, this if statement ensures the first name entered is correct
                  if (firstcheck==0)
                     {
                        System.out.println ("Please enter the corrected first name of the employee");
	                     firstAlias = scan.next();
	                     scan.nextLine();
                      } 
	            System.out.println ("Please enter the last name of the employee");
	            String lastAlias = scan.next();
	            scan.nextLine();
               System.out.println ("Is the last name " + lastAlias + " correct?\n Enter 1 for yes and 0 for no");
                  int lastcheck = scan.nextInt(); //since this is vital information, this if statement ensures the last name entered is correct
                  if (lastcheck==0)
                     {
                        System.out.println ("Please enter the corrected last name of the employee");
	                     lastAlias = scan.next();
	                     scan.nextLine();
                      }
	            System.out.println ("Please enter the Identification Number(ID)of the employee");
	            String IDAlias	= scan.next();
	            scan.nextLine();
               System.out.println ("Is the ID number " + IDAlias + " correct?\n Enter 1 for yes and 0 for no");
                   int IDcheck = scan.nextInt(); //since this is vital information, this if statement ensures the ID number entered is correct
                  if (IDcheck==0)
                     {
                        System.out.println ("Please enter the corrected ID number of the employee");
	                     IDAlias = scan.next();
	                     scan.nextLine();
                      }
	            System.out.println ("Please enter the Date Of Birth of the employee in the form of MM/DD/YYYY");
	            String DOBAlias	= scan.next();
	            scan.nextLine();
	            System.out.println ("Please enter the yearly salary of the employee(Only enter numbers!!)");
	            double salaryAlias	= scan.nextDouble();
	            System.out.println ("Please enter the department in which the employee works");
	            String deptAlias	= scan.next();
	            scan.nextLine();
	            System.out.println ("Please enter the benefits the employee receives such as extended break time, longer vacation days, etc(separate the list with commas) ");
	            String benefitsAlias	= scan.next();
	            scan.nextLine();
	            System.out.println ("Please enter the level of expertise/reponsibility the employee has on a scale from 1 to 10 \n with one being no skill to 10 being highly skillful");
	            int expAlias	= scan.nextInt();
				while (expAlias>11)
					{
						System.out.println ("Invalid input, enter another number for responsibility that is between 1 and 10");
						expAlias = scan.nextInt();
					}
	            System.out.println ("Please enter the employee's favorite color");
	            String colorAlias	= scan.next();
	            scan.nextLine();
	            System.out.println ("Please enter the employee's favorite candy");
	            String candyAlias	= scan.next();
	            scan.nextLine();
	            System.out.println("Please enter the gender the employee identifies with(Male, Female");
	            String genderAlias = scan.next();
	            scan.nextLine();
	            System.out.println("Please enter any medical restrictions or limitations the employee may have (Allergies will be addressed later)");
	            String medicalAlias = scan.next();
	            scan.nextLine();
	            System.out.println("Please enter the age of the employee");
	            int ageAlias = scan.nextInt();
            while(ageAlias>65) //makes sure age entered does not surpass retirement age
               {
                  System.out.println ("Invalid Age, please input another one");
                  ageAlias = scan.nextInt();
               }
	            System.out.println("Please enter the highest level of education the employee has \n Choose from:(High School Diploma,GED, College Degree, NONE) ");
	            String educationAlias = scan.next();
	            scan.nextLine();
	            System.out.println("Please enter any allergies the employee may have");
	            String allergyAlias = scan.next();
	            scan.nextLine();
	            System.out.println("Please enter the employee's phone number");
	            String phonenumAlias = scan.next();
	            scan.nextLine();
	            System.out.println("Please enter the employee's email address");
	            String emailAlias = scan.next();
	            scan.nextLine();
	            System.out.println("Please enter the employee's address");
	            String addressAlias = scan.next();
	            scan.nextLine();
	            System.out.println ("Please enter an emergency contact number for the employee");
	            String emergencynumAlias = scan.next();
	            scan.nextLine();
               //this next line adds a new Employee object to ListOfEmployees by calling the constructor in the Employee class. Each Employee object has the instance variable listed below
	            ListOfEmployees.add(new	Employee(firstAlias,lastAlias,IDAlias,DOBAlias,salaryAlias,deptAlias,benefitsAlias,expAlias,colorAlias,candyAlias,genderAlias,medicalAlias,ageAlias,educationAlias,allergyAlias,phonenumAlias,emailAlias,addressAlias,emergencynumAlias));
	            System.out.println ("Enter a value of 0 if you are finished inputting employees"); //0	to	quit loop
	            enteremploopcontrol =	scan.nextInt();
               System.out.println ("");
	         
	         }
	      }
	   	
	   //creates an employee's weekly work schedule	
	      System.out.println("Do you wish to create a work schedule for an employee? Enter 1 for yes, 0 for no");
	      int	createworkscheloopcontrol = scan.nextInt();		
	      if(createworkscheloopcontrol==1)
	      {	  
	      //allows the user to create a schedule for a specific employee
	         System.out.println("Enter the first name of the employee you wish to create a schedule for");
	         String tempfirst = scan.next();
	         scan.nextLine();
	         System.out.println("Enter the last name of the employee you wish to create a schedule for");
	         String templast = scan.next();scan.nextLine();
	         System.out.println("Also, enter the ID number of the employee");
	         String tempIDschedule = scan.next();
	         scan.nextLine();
	      
	         for ( Employee tempEmp: ListOfEmployees) //goes through the first ArrayList to find the employee with the requested information
	         {
	            if (tempEmp.getFirst().toUpperCase().equals(tempfirst.toUpperCase()) && tempEmp.getLast().toUpperCase().equals(templast.toUpperCase()) && tempEmp.getID().equals(tempIDschedule))
	            {
	               System.out.println("The employee has successfully been located");
	               while (count2!=0 && daycontrol<=7) //this loop will fill the	ArrayList WeeklyWork	with WorkDays objects which will	represent each	day of the week
	               {          //takes into account a day off for the employee
	                  System.out.println ("If the employee has off on day " + daycontrol + ", enter 0. If not, enter 1");
	                  int off = scan.nextInt();
	                  if (off==0)
	                  {	
								System.out.println ("Enter the date the employee has off");
								String offfdate = scan.next();
								scan.nextLine();	
	                     WeeklyWork.add(new WorkDays(offfdate,tempfirst,templast));
	                     daycontrol++;
	                  }
	                  else
	                  {
	                     daycontrol++;
	                     String firsttt = tempfirst;
	                     String lasttt = templast;
	                     String tempID = tempIDschedule;
	                     System.out.println ("The employee's first and last name as well as the ID has been saved to the Work Schedule");
	                     System.out.println ("Enter the date of the day the employee will work(MM/DD/YYYY)");
                        String tempdatee = scan.next();
                        scan.nextLine();
                        System.out.println ("Enter the start time for the employee");
	                     String tempstart	= scan.next();
	                     scan.nextLine();
	                     System.out.println ("Enter the end time for the employee");
	                     String tempend	= scan.next();
	                     scan.nextLine();
	                     System.out.println ("Enter the total hours the employee will work(only numbers)");
	                     double temphours	= scan.nextInt();
	                     System.out.println ("Enter the department the employee will work in");
	                     String tempdept	= scan.next();
	                     scan.nextLine();
	                     WeeklyWork.add(new WorkDays (tempstart,tempend,tempdatee,temphours,tempdept, tempID, firsttt, lasttt));
	                     System.out.println ("Enter a value of 0 if you are finished inputting work days for " + tempEmp.getFirst() + " " + tempEmp.getLast());
	                     createworkscheloopcontrol =	scan.nextInt(); //0 to quit loop
                        System.out.println ("");
	                  }
	               }
	            }
	            else
	               System.out.println("Employee not found, please try again");
	         
	         }
	      }
	   
	   //views the specific employee's weekly work schedule
	      System.out.println("Do you wish to view a report of an employee's work schedule? Enter 1 for yes, 0 for no");  
	      int repschedulecontrol = scan.nextInt();
	      if(repschedulecontrol==1)
	      {
	         System.out.println("Enter the employee's first name");
	         String empfirst = scan.next();
	         scan.nextLine();
	         System.out.println("Enter the employee's last name");
	         String emplast = scan.next();
	         scan.nextLine();
	         System.out.println("Enter the employee's ID number");
	         String empID = scan.next();
	         scan.nextLine();
	      //these two for loops will go through both ArrayLists. The first loop searches the Employee ArrayList and will only move on to the next ArrayList if the employee requested is in the database(as determined by the if statement)
         //The second for loop will go through the WorkDays ArrayList to find entries that contain the information entered(as determined by the second if statement)
	         for (Employee x : ListOfEmployees)
	         {
	            if(x.getFirst().toUpperCase().equals(empfirst.toUpperCase()) && x.getLast().toUpperCase().equals(emplast.toUpperCase()) && x.getID().toUpperCase().equals(empID.toUpperCase()))
	            {
	               for (WorkDays y : WeeklyWork)
	               {
	                  if(y!=null)
	                  {
	                     if(y.getFirst().toUpperCase().equals(empfirst.toUpperCase()) && y.getLast().toUpperCase().equals(emplast.toUpperCase()) && y.getID().toUpperCase().equals(empID.toUpperCase()))
	                     {
	                        System.out.println ("Here is the one of the days of the employee you requested");
	                        System.out.println (y);
                           System.out.println ("");
	                     
	                     }
                        
                        if(y.getFirst().toUpperCase().equals(empfirst.toUpperCase()) && y.getLast().toUpperCase().equals(emplast.toUpperCase()) && y.getID().toUpperCase().equals("")&& y.getStartTime().equals(""))
                        {
                           System.out.println ("The employee: " + empfirst + " " + emplast + " has off on " + y.getDate());
                        }

	                  }
	           		}				
	            }
	         }
	      }   	 
	   
	   //creates customer attendance records in general for the Recreation Station 
	      System.out.println ("Would you like to enter customer attendance for the day? Enter 1 for yes, 0 for no");
	      int customerattendancecontrol = scan.nextInt();
         int Recreationattendance=0;
	      if(customerattendancecontrol==1)
	      {
	         while(customerattendancecontrol==1)
	         {   //enters values for instance variables in the CustomerAttendance class
               Recreationattendance++;
               System.out.println ("You will now enter information regarding guest number " + Recreationattendance);
	            System.out.println ("Enter the first name of the customer");
	            String firstAlias = scan.next();
	            scan.nextLine();
	            System.out.println ("Enter the last name of the customer"); 
	            String lastAlias = scan.next();
	            scan.nextLine();
	            System.out.println ("Enter the total amount the customer purchased. If he/she did not purchase anything, enter 0");
	            double purchaseAlias = scan.nextDouble();
	            System.out.println ("Enter how satisfied the customer was with his/her experience with 10 being extremely satisfied and 0 being dissatisfied");
	            int ratingAlias = scan.nextInt();
	            System.out.println ("Enter the department(s) the customer visited. If he/she visited more than one, separate them using commas");
	            String deptAlias = scan.next();
	            scan.nextLine();
	            System.out.println ("If the customer found everything he/she was looking for, enter yes, if not enter no");
	            String satisfactionAlias = scan.next();
	            scan.nextLine();
	            System.out.println ("Enter the time of day the customer visited the the Family Entertainment Center");
	            String timeAlias = scan.next();
	            scan.nextLine();
	            System.out.println ("Enter the day of week the customer visited the the Family Entertainment Center");
	            String dayAlias = scan.next();
	            scan.nextLine();
	            System.out.println ("Enter the date the customer visited the the Family Entertainment Center in the form of MM/DD/YYYY");
	            String dateAlias = scan.next();
	            scan.nextLine();
	            CustomerAttendance.add(new CustomerAttendance(firstAlias, lastAlias, Recreationattendance, purchaseAlias, ratingAlias, deptAlias,satisfactionAlias, timeAlias, dayAlias, dateAlias));
	            System.out.println("Enter 0 if you are finished entering customers. Enter 1 if you are not");
	            customerattendancecontrol = scan.nextInt();
               System.out.println ("");
	         }
	      }        
	   //creates report of customer attendance according to time of day, day of week,and date of visit 
	      System.out.println ("Would you like to create a customer attendance report? Enter 1 for yes, 0 for no");
	      System.out.println ("This will include all the customers and their data you have entered thus far");
	      int customerreportcontrol =scan.nextInt();
	      if (customerreportcontrol==1)
	      {
	         for (CustomerAttendance x: CustomerAttendance)
	         {
	            System.out.println (x);    
                  
	         }
	      }         
	   
	   //removes employee from database in case of resignation or dismissal
	      System.out.println ("Do you wish to remove an employee from the database? Enter 1 for yes, 0 for no");
	      int quitloopcontrol = scan.nextInt();
	      int quitcontrol = 0;
      while (quitloopcontrol==1 && ListOfEmployees.size()!=0)
	      {
	         System.out.println ("Enter the first name of the employee");
	         String quitfirst = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the last name of the employee");
	         String quitlast = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the ID number of the employee");
	         String quitID = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the DOB of the employee");
	         String quitDOB = scan.next();
	         scan.nextLine();
	     	 
	         for (Employee x: ListOfEmployees) //searches through ArrayList to find the requested criteria  
	         {
	            if (x.getFirst().toUpperCase().equals(quitfirst.toUpperCase()) && x.getLast().toUpperCase().equals(quitlast.toUpperCase()) && (x.getID().toUpperCase().equals(quitID.toUpperCase()) || x.getDOB().toUpperCase().equals(quitDOB.toUpperCase())))
	            {
	               ListOfEmployees.remove(quitcontrol);
	               System.out.println ("The employee " + quitfirst + " " + quitlast + " has been removed from the database");
	               quitcontrol--;
	               System.out.println ("Do you wish to remove another employee? Enter 1 for yes and 0 for no");
	               quitloopcontrol = scan.nextInt();
                  System.out.println ("");
                  if (ListOfEmployees.size()==0)
                     {
                        System.out.println ("Sorry, there are no more employees entered in the database");
                        System.out.println ("");
                        break;
                     }
	            }
	            quitcontrol++;
	         }
	      }
	     
	   
	   //provides customer attendance information about the Swimming department of the Family Entertainment Center
	      System.out.println ("Do you wish to enter customer information in the Swimming department? Enter 1 for yes, 0 for no");
	      int swimmingloopcontrol = scan.nextInt();
         int Swimmingattendance = 0;
	      while (swimmingloopcontrol==1)
	      {   //enters values for instance variables in the Swimming class 
            Swimmingattendance++;
            System.out.println ("You will now enter information regarding guest number " + Swimmingattendance);
	         System.out.println ("Enter the first name of the guest");
	         String firstAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the last name of the guest"); //
	         String lastAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the time of day the guest visited the Swimming section");
	         String timeAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the day of week the guest visited the Swimming section");
	         String dayAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the date the guest visited the Swimming section in the form of MM/DD/YYYY");
	         String dateAlias = scan.next();
	         scan.nextLine();
	         Swimming.add(new Swimming (firstAlias, lastAlias, Swimmingattendance, dateAlias, timeAlias, dayAlias));
	         System.out.println ("Enter a value of 0 if you are finished entering information about the Swimming section");
	         swimmingloopcontrol = scan.nextInt();
            System.out.println ("");
	      }
	   
	   //provides customer attendance information about the Bowling department of the Family Entertainment Center
	      System.out.println ("Do you wish to enter customer information in the Bowling department? Enter 1 for yes, 0 for no");
	      int bowlingloopcontrol = scan.nextInt();
         int Bowlingattendance=0;
	      while (bowlingloopcontrol==1) 
	      {   //enters values for instance variables in the Bowling class 
            Bowlingattendance++;
            System.out.println ("You will now enter information regarding guest number " + Bowlingattendance);
	         System.out.println ("Enter the first name of the guest");
	         String firstAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the last name of the guest");
	         String lastAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the time of day the guest visited the bowling section");
	         String timeAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the day of week the guest visited the bowling section");
	         String dayAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the best bowling score the guest had when playing");
	         int scoreAlias = scan.nextInt();
	         System.out.println ("Enter the number of games the guest played");
	         int gamesAlias = scan.nextInt();
	         System.out.println ("Enter the date the guest visited the bowling section in the form of MM/DD/YYYY");
	         String dateAlias = scan.next();
	         scan.nextLine();
	         Bowling.add(new Bowling (firstAlias, lastAlias, Bowlingattendance, scoreAlias, gamesAlias, dateAlias, timeAlias, dayAlias));
	         System.out.println ("Enter a value of 0 if you are finished entering information about the Bowling section");
	         bowlingloopcontrol = scan.nextInt();
            System.out.println (""); 
	      }
	   
	   //provides customer attendance information about the Inflatable Games department of the Family Entertainment Center
	      System.out.println ("Do you wish to enter customer information in the Inflatable Games department? Enter 1 for yes, 0 for no");
	      int inflatableloopcontrol = scan.nextInt();
         int InflatableGamesattendance = 0;
	      while (inflatableloopcontrol==1) 
	      {   //enters values for instance variables in the InflatableGames class 
          InflatableGamesattendance++;
          System.out.println ("You will now enter information regarding guest number " + InflatableGamesattendance);
	    	 System.out.println ("Enter the first name of the guest");
	         String firstAlias = scan.next();
	         System.out.println ("Enter the last name of the guest");
	         String lastAlias = scan.next();
	         System.out.println ("Enter the total number of games played while at the Inflatable Games section");
	         String gamesplayedAlias = scan.next();
	         System.out.println ("Enter the total amount of time spent while at the Inflatable Games section");
	         int timespentAlias = scan.nextInt();
	         System.out.println ("Enter the total number of guests who played at the Inflatable Games section");
	         int numberofguestsplayedAlias = scan.nextInt();
	         System.out.println ("Enter the time of day the guest visited the Inflatable Games section");
	         String timeAlias = scan.next();
	         System.out.println ("Enter the day of week the guest visited the Inflatable Games section");
	         String dayAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the date the guest visited the Inflatable Games section in the form of MM/DD/YYYY");
	         String dateAlias = scan.next();
	         scan.nextLine();
	         InflatableGames.add(new InflatableGames (firstAlias, lastAlias, InflatableGamesattendance, gamesplayedAlias, timespentAlias,numberofguestsplayedAlias, dateAlias, timeAlias, dayAlias));
	         System.out.println ("Enter a value of 0 if you are finished entering information about the Inflatable Games section");
	         inflatableloopcontrol = scan.nextInt();
            System.out.println ("");
	      }
	   
	   //provides customer attendance information about the Theater department of the Family Entertainment Center
	      System.out.println ("Do you wish to enter customer information in the Theater department? Enter 1 for yes, 0 for no");
	      int theaterloopcontrol = scan.nextInt();
         int Theaterattendance =0;
	      while (theaterloopcontrol==1) 
	      {   //enters values for instance variables in the Theater class 
            Theaterattendance++;
	         System.out.println ("You will now enter information regarding guest number " + Theaterattendance);
            System.out.println ("Enter the first name of the guest who bought the tickets");
	         String firstAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the last name of the guest");
	         String lastAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the names of the movies the guest(s) watched while at the Theater. Choose from Moana, The Good Dinosaur, The Jungle Book, The Incredibles, Frozen");
	         String namesofmoviesAlias = scan.next(); 
	         scan.nextLine();
	         System.out.println ("Enter the rating of the movie the guest(s) saw. Choose from PG,G,PG-13");
	         String ratingAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the number of adults who visited the Theater section");
	         int numadultsAlias = scan.nextInt();
	         System.out.println ("Enter the number of children who visited the Theater section");
	         int numchildrenAlias = scan.nextInt();
	         System.out.println ("Enter the total purchase the guest made on concessions");
	         double purchaseAlias = scan.nextDouble();
	         System.out.println ("Enter the time of day the guest visited the Theater section");
	         String timeAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the day of week the guest visited the Theater section");
	         String dayAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the date the guest visited the Theater section in the form of MM/DD/YYYY");
	         String dateAlias = scan.next();
	         scan.nextLine();
	         Theater.add(new Theater (firstAlias, lastAlias, namesofmoviesAlias, Theaterattendance,numadultsAlias, numchildrenAlias,ratingAlias,purchaseAlias, dateAlias, timeAlias, dayAlias));
	         System.out.println ("Enter a value of 0 if you are finished entering information about the Theater section");
	         theaterloopcontrol = scan.nextInt();
            System.out.println ("");
	      }
	   
	   //provides customer attendance information about the Food and Drinks department of the Family Entertainment Center 
	      System.out.println ("Do you wish to enter customer information in the Food and Drinks department? Enter 1 for yes, 0 for no");
	      int foodndrinksloopcontrol = scan.nextInt();
         int FoodnDrinksattendance=0;
	      while (foodndrinksloopcontrol ==1)
	      {   //enters values for instance variables in the FoodnDrinks class 
            FoodnDrinksattendance++;
            System.out.println ("You will now enter information regarding guest number " + FoodnDrinksattendance);
	         System.out.println ("Enter the first name of the guest who bought the food/drinks");
	         String firstAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the last name of the guest who bought the food/drinks");
	         String lastAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the name(s) of the store(s) the guest visited. Choose from Ice Cream Galore, Tacos Express, Pizza Pizza, Hoagies and More, Frozen Yogurt, Coffee Co");
	         String storenameAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter where the guest chose to sit. Choose from terrace, high top tables, couches, bean bag chairs");
	         String seatingAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter whether the guest ordered a drink, food, or both");
	         String typeAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the total amount the guest spent in the FoodnDrinks department");
	         double purchaseAlias = scan.nextDouble();    
	         System.out.println ("Enter the time of day the guest visited the FoodnDrinks section");
	         String timeAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the day of week the guest visited the FoodnDrinks section");
	         String dayAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the date the guest visited the FoodnDrinks section in the form of MM/DD/YYYY");
	         String dateAlias = scan.next();
	         scan.nextLine();
	         FoodnDrinks.add(new FoodnDrinks (firstAlias, lastAlias, FoodnDrinksattendance, storenameAlias, seatingAlias, typeAlias, purchaseAlias, dateAlias, timeAlias, dayAlias));
	         System.out.println ("Enter a value of 0 if you are finished entering information about the FoodnDrinks section");
	         foodndrinksloopcontrol = scan.nextInt();
            System.out.println ("");
	      }
	   
	   
	   //provides customer attendance information about the Gift Shop department of the Family Entertainment Center
	      System.out.println ("Do you wish to enter customer information in the Gift Shop department? Enter 1 for yes, 0 for no");
	      int giftshoploopcontrol = scan.nextInt();
         int GiftShopattendance=0;
	      while (giftshoploopcontrol ==1)
	      {   //enters values for instance variables for the GiftShop class
	    	 System.out.println ("Enter the first name of the guest");
	         String firstAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the last name of the guest");
	         String lastAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the total amount the guest spent in the Gift Shop");
	         double purchaseAlias = scan.nextDouble();    
	         System.out.println ("Enter the number associated with the department the purchase they made came from. \n 1-Swimming, 2-Bowling, 3-Inflatable Games, 4-Theater, 5-the Family Entertainment Center in general");
	         int numAlias = scan.nextInt(); 
	         System.out.println ("Enter the time of day the guest visited the Gift Shop");
	         String timeAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the day of week the guest visited the Gift Shop");
	         String dayAlias = scan.next();
	         scan.nextLine();
	         System.out.println ("Enter the date the guest visited the Theater section in the form of MM/DD/YYYY");
	         String dateAlias = scan.next();
	         scan.nextLine();
	         GiftShop.add(new GiftShop(firstAlias, lastAlias, GiftShopattendance, purchaseAlias, numAlias, timeAlias, dayAlias, dateAlias));
	         System.out.println ("Enter a value of 0 if you are finished entering information about the FoodnDrinks section");
	         giftshoploopcontrol = scan.nextInt();
            System.out.println ("");
	      }

	   
	   
	   }

	}



