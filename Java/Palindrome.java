////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Palindrome Number
// Input        : One integer num
// Output       : Palindrome Number or Not Palindrome Number
// Functions    : main()
// Description  : Checks whether a given number is a Palindrome
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks Palindrome Number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sobj.nextInt();

        int temp = num;
        int reverse = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp /= 10;
        }

        if(reverse == num)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
