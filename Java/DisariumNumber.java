////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Disarium Number
// Input        : One integer num
// Output       : Disarium Number or Not Disarium Number
// Functions    : main()
// Description  : Checks whether a given number is a Disarium Number
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks Disarium Number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class DisariumNumber
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sobj.nextInt();

        int temp = num;
        int digits = 0;
        int sum = 0;

        while(temp > 0)
        {
            digits++;
            temp /= 10;
        }

        temp = num;

        int arr[] = new int[digits];

        for(int i = digits - 1; i >= 0; i--)
        {
            arr[i] = temp % 10;
            temp /= 10;
        }

        for(int i = 0; i < digits; i++)
        {
            int power = 1;

            for(int j = 1; j <= i + 1; j++)
            {
                power *= arr[i];
            }

            sum += power;
        }

        if(sum == num)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }
    }
}
