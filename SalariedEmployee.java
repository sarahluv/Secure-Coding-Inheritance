//********************************************************************
//  SalariedEmployee.java
//
//  For secure coding laboratory exercise which addresses
//  potential vulnerabilities in extensibility through inheritance
//
//  This type of employee can accrue comp time (in whole hours only).
//  At the end of the year, //  a bonus of one month's salary is paid
//  if compTime > 200 hours
//********************************************************************

public class SalariedEmployee extends EmployeePayInfo
{
   private int compTime;

   //-----------------------------------------------------------------
   //  Constructor:  Establishes pay information for a salaried employee
   //   			 Primarily uses the EmployeePayInfo parent data/constructor

   //-----------------------------------------------------------------
   public SalariedEmployee (String firstName, String lastName, String officeAddress,
   			String officePhone, double payRate)
   {  super (firstName, lastName, officeAddress, officePhone,
   			 payRate);
      compTime = 0;
  }

   //-----------------------------------------------------------------
   //  Add hours to compTime
   //-----------------------------------------------------------------
	protected void addCompHours (int moreHours)
   { compTime += moreHours;  }

   //-----------------------------------------------------------------
   //  Get comp hours
   //-----------------------------------------------------------------
   public final double getCompHours()
   {	return compTime;	}

   //-----------------------------------------------------------------
   //  Calculates and returns the pay for a salaried employee
   //-----------------------------------------------------------------
   public final double pay()
   {  return payRate;  }

   //-----------------------------------------------------------------
   //  Calculates and returns comp time pay (the same as one month's pay)
   //  This is only done once a year.  Once paid, the hours are zeroed.
   //-----------------------------------------------------------------
   public double payCompTime()
   {   double paidTime = 0.0;
	   if (compTime >= 200) paidTime = pay();
	   payRate = 0.0;
	   return paidTime;	}
}
