#include <bits/stdc++.h>
using namespace std;

void addEdge(vector<vector<int>>&graph,int v1,int v2){
    graph[v1].push_back(v2);
    graph[v2].push_back(v1);
}

int noOfPaths(vector<vector<int>>&graph,vector<bool>isv,int src,int des){
    queue<int> q;
    q.push(src);
    int counter=0;
    
    while(q.size()>0){
        int rem = q.front();
        q.pop();
        
        isv[rem]=true;
        
        if(rem==des){
            return counter;
        }
        counter++;
        
        for(int i:graph[rem]){
            if(!isv[i])
            {
                q.push(i);
            }
        }
    }
}

int main() {
    int T;
    cin>>T;
    while(T--){
        int N;
        int M;
        cin>>N>>M;
        vector<vector<int>> graph(N);
        while(M--){
            int X;
            int Y;
            cin>>X>>Y;
            addEdge(graph,X,Y);
        }
        vector<bool> isv(N + 1,false);
        cout<<noOfPaths(graph,isv,1,N)<<endl;
    }
    
}


