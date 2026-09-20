////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Harshad Number
// Input        : One integer num
// Output       : Harshad Number or Not Harshad Number
// Functions    : main()
// Description  : Checks whether a given number is a Harshad Number
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks Harshad Number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class HarshadNumber
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
            sum += digit;
            temp /= 10;
        }

        if(num % sum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}
