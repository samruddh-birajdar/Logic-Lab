////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Armstrong Number Checker Demo
// Input        : 153
// Output       : Armstrong Number
// Functions    : CheckArmstrong()
// Description  : Checks whether a given number is Armstrong or not
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<math.h>

void CheckArmstrong(int num)
{
    int temp = num, digits = 0, sum = 0;

    // Count digits
    while(temp > 0)
    {
        digits++;
        temp /= 10;
    }

    temp = num;
    while(temp > 0)
    {
        int digit = temp % 10;
        sum += (int)pow(digit, digits);
        temp /= 10;
    }

    if(sum == num)
        printf("Armstrong Number\n");
    else
        printf("Not Armstrong Number\n");
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks Armstrong number.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int num;

    printf("Enter number : ");
    scanf("%d",&num);

    CheckArmstrong(num);

    return 0;
}
