////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Loan Eligibility Checker Demo
// Input        : 30 30000 750 No
// Output       : Loan Approved
// Functions    : CheckLoan()
// Description  : Checks loan eligibility based on rules
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<string.h>

void CheckLoan(int age, int income, int score, char loan[])
{
    if(age < 0 || income < 0 || score < 0)
    {
        printf("Invalid input.\n");
        return;
    }

    if(age < 21 || age > 60)
    {
        printf("Loan Rejected: Age not eligible\n");
        return;
    }
    if(income < 25000)
    {
        printf("Loan Rejected: Income too low\n");
        return;
    }
    if(score < 700)
    {
        printf("Loan Rejected: Credit score too low\n");
        return;
    }
    if(strcmp(loan,"Yes")==0)
    {
        printf("Loan Rejected: Existing unpaid loan\n");
        return;
    }
    if(strcmp(loan,"No")!=0)
    {
        printf("Invalid input for loan status.\n");
        return;
    }

    printf("Loan Approved\n");
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Checks loan eligibility.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    int age,income,score;
    char loan[10];

    printf("Enter age : ");
    scanf("%d",&age);

    printf("Enter monthly income : ");
    scanf("%d",&income);

    printf("Enter credit score : ");
    scanf("%d",&score);

    printf("Existing unpaid loan (Yes/No) : ");
    scanf("%s",loan);

    CheckLoan(age,income,score,loan);

    return 0;
}
