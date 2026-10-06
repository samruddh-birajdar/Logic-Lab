#include <iostream>
using namespace std;

class CabFare
{
private:
    int iDistance;
    string sPeakHour;
    double dFare;

public:
    void Accept()
    {
        cin >> iDistance;
        cin >> sPeakHour;
    }

    void CalculateFare()
    {
        if(iDistance < 0)
        {
            return;
        }

        dFare = 50;

        if(iDistance <= 10)
        {
            dFare = dFare + (iDistance * 12);
        }
        else
        {
            dFare = dFare + (10 * 12);
            dFare = dFare + ((iDistance - 10) * 15);
        }

        if(sPeakHour == "Yes")
        {
            dFare = dFare + (dFare * 0.20);
        }
    }

    void Display()
    {
        if(iDistance < 0)
        {
            cout << "Invalid Distance";
            return;
        }

        cout << "Distance: " << iDistance << " km" << endl;
        cout << "Peak Hour: " << sPeakHour << endl;
        cout << "Total Fare: ₹" << dFare << endl;
    }
};

int main()
{
    CabFare obj;

    obj.Accept();
    obj.CalculateFare();
    obj.Display();

    return 0;
}
