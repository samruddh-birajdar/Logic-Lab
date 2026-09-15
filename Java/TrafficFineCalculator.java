////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Traffic Violation Fine Calculator Demo
// Input        : Helmet worn, License available, Overspeeding (Yes/No)
// Output       : Total fine amount
// Functions    : main()
// Description  : Calculates fine based on violations
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Calculates traffic violation fines.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class TrafficFineCalculator
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Helmet worn (Yes/No) : ");
        String helmet = sobj.nextLine();

        System.out.print("License available (Yes/No) : ");
        String license = sobj.nextLine();

        System.out.print("Overspeeding (Yes/No) : ");
        String speed = sobj.nextLine();

        if(!(helmet.equalsIgnoreCase("Yes") || helmet.equalsIgnoreCase("No")) ||
           !(license.equalsIgnoreCase("Yes") || license.equalsIgnoreCase("No")) ||
           !(speed.equalsIgnoreCase("Yes") || speed.equalsIgnoreCase("No")))
        {
            System.out.println("Invalid input.");
            return;
        }

        int fine = 0;

        if(helmet.equalsIgnoreCase("No"))
            fine += 500;
        if(license.equalsIgnoreCase("No"))
            fine += 1000;
        if(speed.equalsIgnoreCase("Yes"))
            fine += 1500;

        System.out.println("Total Fine Amount: ₹" + fine);
    }
}
