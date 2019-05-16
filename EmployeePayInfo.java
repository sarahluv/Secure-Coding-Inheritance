//********************************************************************
//  EmployeePayInfo.java
//
//
//  For secure coding laboratory exercise which addresses
//  potential vulnerabilities in extensibility through inheritance
//********************************************************************

public class EmployeePayInfo extends Employee
{
   public double payRate;

   //-----------------------------------------------------------------
   //  Constructor:  Establishes pay information for an employee
   //-----------------------------------------------------------------
   public EmployeePayInfo (String firstName, String lastName, String officeAddress,
            String officePhone, double payRate)
   {  super (firstName, lastName, officeAddress, officePhone);
      if (payRate > 0) {
          this.payRate = payRate;
      } else {
          this.payRate = 0;
      }
   }

   //-----------------------------------------------------------------
   //  Returns information about an employee as a string, including
   //  pay information.
   //-----------------------------------------------------------------
   public String toString()
   {  String result = super.toString();
      result += "\nPay Rate: " + payRate;
      return result;
   }

   //-----------------------------------------------------------------
   //  Accessor and mutator methods for data members
   //-----------------------------------------------------------------
   public final double getPayRate()
   {  return payRate;     }


}
