//********************************************************************
//  HourlyEmployee.java
//
//  For secure coding laboratory exercise which addresses
//  potential vulnerabilities in extensibility through inheritance
//********************************************************************

public class HourlyEmployee extends EmployeePayInfo

{
   private double hoursWorked;

   //-----------------------------------------------------------------
   //  Constructor:  Establishes pay information for an hourly employee
   //   			 Primarily uses the EmployeePayInfo parent data/constructor
   //-----------------------------------------------------------------
   public HourlyEmployee (String firstName, String lastName, String officeAddress,
   			String officePhone, double payRate)
   {  super (firstName, lastName, officeAddress, officePhone,
   			 payRate);
	  hoursWorked = 0.0;
   }

   //-----------------------------------------------------------------
   //  Adds hours worked for a given period of time to an hourly
   //  employees data
   //-----------------------------------------------------------------
   protected void addHoursWorked (double moreHours)
   { hoursWorked += moreHours;  }

   //-----------------------------------------------------------------
   //  Calculates and returns pay for hourly employee and resets
   //  hours worked to zero.
   //-----------------------------------------------------------------
   public final double pay()
   {  double payment = getPayRate() * hoursWorked;
      hoursWorked = 0.0;
      return payment;
   }

   //-----------------------------------------------------------------
   //  Returns information about this hourly employee as a string.
   //-----------------------------------------------------------------
   public String toString()
   {  String result = super.toString();
      result += "\nCurrent hours: " + hoursWorked;
      return result;
   }
}
