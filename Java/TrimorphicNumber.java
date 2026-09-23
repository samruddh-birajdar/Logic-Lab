////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Trimorphic Number
// Input        : One integer num
// Output       : Trimorphic Number or Not Trimorphic Number
// Functions    : main()
// Description  : Checks whether a given number is a Trimorphic Number
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks Trimorphic Number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class TrimorphicNumber
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sobj.nextInt();

        int square = num * num;
        int cube = square * num;

        int temp = num;
        boolean found = true;

        while(temp > 0)
        {
            if(cube % 10 != temp % 10)
            {
                found = false;
                break;
            }

            cube /= 10;
            temp /= 10;
        }

        if(found)
        {
            System.out.println("Trimorphic Number");
        }
        else
        {
            System.out.println("Not Trimorphic Number");
        }
    }
}
