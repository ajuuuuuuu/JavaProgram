#include <iostream>
using namespace std;
//  print 1 2 3 4 for n =4
int main()
{
    int n = 4;
    for (int i = 0; i <= n; i++)
    {
        for (int j = 0; j <= n; j++)
        {
            cout << j << endl;
        }
        cout<<endl;
    }
    return 0;
}