////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Income Tax Calculator Demo
// Input        : Annual income
// Output       : Total tax payable
// Functions    : main()
// Description  : Calculates income tax based on slabs
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Calculates income tax.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class IncomeTaxCalculator
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter annual income : ");
        int income = sobj.nextInt();

        if(income < 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        double tax = 0;

        if(income > 250000)
        {
            int slab = (income > 500000) ? 250000 : income - 250000;
            tax += slab * 0.05;
        }
        if(income > 500000)
        {
            int slab = (income > 1000000) ? 500000 : income - 500000;
            tax += slab * 0.20;
        }
        if(income > 1000000)
        {
            tax += (income - 1000000) * 0.30;
        }

        System.out.println("Annual Income: ₹" + income);
        System.out.println("Total Tax Payable: ₹" + (int)tax);
    }
}
