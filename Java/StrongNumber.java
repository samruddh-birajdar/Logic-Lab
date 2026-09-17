////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Strong Number
// Input        : One integer num
// Output       : Strong Number or Not Strong Number
// Functions    : main()
// Description  : Checks whether a given number is a Strong Number
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks Strong Number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class StrongNumber
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sobj.nextInt();

        int temp = num;
        int sum = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            int fact = 1;

            for(int i = 1; i <= digit; i++)
            {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if(sum == num)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }
    }
}
