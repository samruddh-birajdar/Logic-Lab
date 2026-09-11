////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : ATM Transaction Demo
// Input        : 30000 2000
// Output       : Transaction Successful. Remaining Balance: ₹28000
// Functions    : ATMTransaction()
// Description  : Validates ATM withdrawal rules
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void ATMTransaction(int balance, int withdrawAmount)
{
    if(balance < 0 || withdrawAmount <= 0)
    {
        printf("Invalid input.\n");
        return;
    }

    if(withdrawAmount % 100 != 0)
    {
        printf("Transaction Failed: Amount must be multiple of ₹100\n");
    }
    else if(withdrawAmount > 25000)
    {
        printf("Transaction Failed: Maximum withdrawal limit is ₹25000\n");
    }
    else if(balance - withdrawAmount < 1000)
    {
        printf("Transaction Failed: Minimum balance of ₹1000 must remain\n");
    }
    else
    {
        balance -= withdrawAmount;
        printf("Transaction Successful.\n");
        printf("Remaining Balance: ₹%d\n",balance);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Validates ATM withdrawal transaction.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int balance = 0, withdrawAmount = 0;

    printf("Enter current balance : ");
    scanf("%d",&balance);

    printf("Enter withdrawal amount : ");
    scanf("%d",&withdrawAmount);

    ATMTransaction(balance,withdrawAmount);

    return 0;
}
