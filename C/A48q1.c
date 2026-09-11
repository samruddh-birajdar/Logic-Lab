////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Library Fine Calculator Demo
// Input        : 10
// Output       : Total fine to be paid: ₹15
// Functions    : CalculateFine()
// Description  : Calculates fine based on library rules
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void CalculateFine(int daysKept)
{
    if(daysKept < 0)
    {
        printf("Invalid input.\n");
        return;
    }

    if(daysKept <= 7)
    {
        printf("Returned on time. No fine applicable.\n");
    }
    else if(daysKept <= 12)
    {
        int fine = (daysKept - 7) * 5;
        printf("Total fine to be paid: ₹%d\n",fine);
    }
    else
    {
        int fine = (5 * 5) + ((daysKept - 12) * 10);
        printf("Total fine to be paid: ₹%d\n",fine);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Calculates fine for late book return.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int daysKept = 0;

    printf("Enter total days kept : ");
    scanf("%d",&daysKept);

    CalculateFine(daysKept);

    return 0;
}
