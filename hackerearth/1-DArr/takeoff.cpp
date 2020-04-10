#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin >> t;
	while(t--){
		int c=0;
		int N,p,q,r;
		cin>>N>>p>>q>>r;
		vector<bool> arr(N+1,false);
		for(int i=1;i<arr.size();i++){
			if(i%p==0){
				if(!arr[i] && i%q!=0 && i%r!=0){
					arr[i]=true;
				}
			}
			if(i%q==0){
				if(!arr[i] && i%p!=0 && i%r!=0){
					arr[i]=true;
				}
			}
			if(i%r==0){
				if(!arr[i] && i%p!=0 && i%q!=0){
					arr[i]=true;
				}
			}
		}
		for(bool i: arr){
			if(i){
				c++;
			}	
		}
		cout<<c<<endl;
	}
}