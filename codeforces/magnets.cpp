#include <bits/stdc++.h>
using namespace std;

int main()
{
	int n;
	cin >> n;
	int mag = 1;
	string prev="22";
	while (n--)
	{
		string cur;
		cin >> cur;
		if(cur[0]!=prev[1]){
			prev[0] = cur[0];
			prev[1] = cur[1];
		}
		else if (cur[0] == prev[1])
		{
			mag++;
			prev[0] = cur[0];
			prev[1] = cur[1];
		}
	}
	cout<<mag<<endl;
}