#include<bits/stdc++.h>
using namespace std;
int main(){
string s;
cin>>s;
int count=1;
int i=0;
while(i<s.length()-1){
	if(count==7){
		break;
	}
	else if(s[i]==s[i+1]){
		count++;
	}else{
		count=1;
	}
	i++;
}
if(count==7){
cout<<"YES";
}else {
cout<<"NO";
}

return 0;
}
