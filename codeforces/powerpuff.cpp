#include <bits/stdc++.h>
using namespace std;

int main(int argc, char** argv)
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    long q[n];
    long t[n];
    for(int i=0;i<n;i++){
        long ele;
        cin>>ele;
        q[i]=ele;
    }
    for(int i=0;i<n;i++){
        long ele;
        cin>>ele;
        t[i]=ele;
    }
    long c=0;
    bool f=true;
    while(f){
        for(int i=0;i<n;i++){
            if(t[i]-q[i]<0){
                f=!f;
                c-=i;
                break;
            }else{
                t[i]-=q[i];
                c++;
            }
        }
    }
    cout<<c/n<<endl;
    return 0;
}