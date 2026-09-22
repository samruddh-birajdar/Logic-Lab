////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Sunny Number
// Input        : One integer num
// Output       : Sunny Number or Not Sunny Number
// Functions    : main()
// Description  : Checks whether a given number is a Sunny Number
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks Sunny Number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class SunnyNumber
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sobj.nextInt();

        int target = num + 1;
        boolean found = false;

        for(int i = 0; i * i <= target; i++)
        {
            if(i * i == target)
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not Sunny Number");
        }
    }
}
