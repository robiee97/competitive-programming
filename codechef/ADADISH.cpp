#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n];
        for(int i=0;i<n;i++){
            int ele;
            cin>>ele;
            arr[i]=ele;
        }
        int tim=0;
        if(n==1){
            cout<<arr[0]<<endl;
        }else if(n==2){
            if(arr[0]>=arr[1]){
                cout<<arr[0]<<endl;
            }else{
                cout<<arr[1]<<endl;
            }
        }else{
            priority_queue<int> pq;
            for(int i:arr){
                pq.push(i);
            }
            while(pq.size()>2){
                int a=pq.top();pq.pop();
                int b=pq.top();pq.pop();
                tim+=b;
                pq.push(a-b);
            }
            int f=pq.top();pq.pop();
            int s=pq.top();pq.pop();
            tim+=max(f,s);
            cout<<tim<<endl;
        }      
    }
	// your code goes here
	return 0;
}
