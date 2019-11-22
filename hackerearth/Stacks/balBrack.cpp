#include <iostream>
#include <stack>
using namespace std;

bool balancedBrackets(string &exp)
{
    stack<char> st;
    for (int i = 0; i < exp.size(); i++)
    {
        if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
        {
            st.push(exp[i]);
        }
        else if (exp[i] == ')')
        {
            if (st.size() == 0 || st.top() != '(')
            {
                return false;
            }
            else
            {
                st.pop();
            }
        }
        else if (exp[i] == '}')
        {
            if (st.size() == 0 || st.top() != '{')
            {
                return false;
            }
            else
            {
                st.pop();
            }
        }
        else if (exp[i] == ']')
        {
            if (st.size() == 0 || st.top() != '[')
            {
                return false;
            }
            else
            {
                st.pop();
            }
        }
    }
    if (st.size() > 0)
    {
        return false;
    }
    else
    {
        return true;
    }
}
int main()
{
    int T;
    cin >> T;
    while (T-- > 0)
    {
        string s;
        cin >> s;
        bool res = balancedBrackets(s);
        if (res)
        {
            cout << "YES" << endl;
        }
        else
        {
            cout << "NO" << endl;
        }
    }
}
