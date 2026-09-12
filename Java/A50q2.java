////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Student Result Classification Demo
// Input        : Marks in 5 subjects
// Output       : Fail or classification with average
// Functions    : main()
// Description  : Generates student result based on marks
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Generates student result classification.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class A50q2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0;

        System.out.println("Enter marks of 5 subjects (0-100): ");
        for(int i=0; i<5; i++)
        {
            marks[i] = sobj.nextInt();
            if(marks[i] < 0 || marks[i] > 100)
            {
                System.out.println("Invalid input.");
                return;
            }
            if(marks[i] < 35)
            {
                System.out.println("Result: Fail");
                return;
            }
            sum += marks[i];
        }

        double avg = sum / 5.0;
        System.out.println("Average Marks: " + avg);

        if(avg >= 75)
            System.out.println("Final Result: Distinction");
        else if(avg >= 60)
            System.out.println("Final Result: First Class");
        else if(avg >= 50)
            System.out.println("Final Result: Second Class");
        else
            System.out.println("Final Result: Pass");
    }
}
