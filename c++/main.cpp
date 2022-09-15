#include <iostream>

using namespace std;

long factorial(int n)
{
    if (n == 0) return 1;
    return n * factorial(n - 1);
}

int main()
{
    int x;
    cout << "Enter x: ";
    cin >> x;

    cout << "\nYou have entered: " << x << endl;
    cout << x << "! = " << factorial(x) << endl << endl;

    return 0;
}