////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Program      : Warehouse Stock Management Demo
// Input        : Current stock, Requested quantity
// Output       : Order status and remaining stock
// Functions    : main()
// Description  : Manages stock and processes orders
// Author       : Samruddh Shivkumar Birajdar
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application : Processes warehouse orders.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class WareHouseStock
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter current stock : ");
        int stock = sobj.nextInt();

        System.out.print("Enter requested quantity : ");
        int req = sobj.nextInt();

        if(stock < 0 || req <= 0)
        {
            System.out.println("Invalid input.");
            return;
        }

        if(req > stock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
        }
        else
        {
            stock -= req;
            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + stock);
            if(stock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}
