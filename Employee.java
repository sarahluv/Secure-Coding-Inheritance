//********************************************************************
//  Employee.java
//
//  For secure coding laboratory exercise which addresses
//  potential vulnerabilities in extensibility through inheritance
//
//********************************************************************

public class Employee
{
   private String firstName;
   private String lastName;
   private String officeAddress;
   private String officePhone;

   //-----------------------------------------------------------------
   //  Constructor:  Establishes basic information for an employee
   //-----------------------------------------------------------------
   public Employee (String firstName, String lastName, String officeAddress,
   					String officePhone)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.officeAddress = officeAddress;
      this.officePhone = officePhone;
   }
   //-----------------------------------------------------------------
   //  Accessor and mutator methods for data members
   //-----------------------------------------------------------------
   public final String getFirstName()
   {	return firstName;	}
   public final String getLastName()
   {	return lastName;	}
   public final String getOfficeAddress()
   {	return officeAddress;	}
   public final String getOfficePhone()
   {	return officePhone;	}


   //-----------------------------------------------------------------
   //  Returns a string based upon an employee's basic information
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "Name: " + firstName + " " + lastName + "\n";

      result += "Address: " + officeAddress + "\n";
      result += "Phone: " + officePhone;

      return result;
   }
}
