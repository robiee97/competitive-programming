#include <bits/stdc++.h>
using namespace std;
int main(int argc,char** argv)
{
    long long int t, c, i;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        c = 0;
        long long int n = s.length();
        sort(s.begin(), s.end());
        for (i = 0; i < n - 1; i++)
        {
            if ((s[i] + 1) != s[i + 1])
            {
                c++;
                cout << "NO" << endl;
                break;
            }
        }
        if (c == 0)
            cout << "YES" << endl;
    }
}