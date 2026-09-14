////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Parking Fee Calculator Demo
// Input        : 12
// Output       : Total Parking Duration: 12 hours Total Parking Fee: ₹150
// Functions    : CalculateFee()
// Description  : Calculates parking fee based on duration rules
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void CalculateFee(int hours)
{
    if(hours < 0)
    {
        printf("Invalid input.\n");
        return;
    }

    int fee = 20; // first 2 hours flat
    if(hours > 2)
    {
        fee += (hours - 2) * 10;
    }
    if(hours > 10)
    {
        fee += 50; // penalty
    }

    printf("Total Parking Duration: %d hours\n",hours);
    printf("Total Parking Fee: ₹%d\n",fee);
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Calculates parking fee.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int hours = 0;

    printf("Enter total parking hours : ");
    scanf("%d",&hours);

    CalculateFee(hours);

    return 0;
}
