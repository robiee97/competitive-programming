#include<bits/stdc++.h>
using namespace std;

int main()
{
   string s;
   cin>>s;
   int i=0;
   int j=0;
	while(i<s.length()){
		if(s[i]=='+'){
			continue;
		}
		else if(s[i]=='1'){
			swap(s[i],s[j]);
			i++;
			j++;
		}
		else if(s[i]=='2'){
			i++;
		}
	}
	for(int i=0;i<s.length();i++){
		cout<<s[i];
	}
return 0;
}
