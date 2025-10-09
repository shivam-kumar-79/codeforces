#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    int ans=INT_MIN;
    int arr[n];
    for(int i=0;i<n;i++) {
        int x;
        cin >> arr[i];}
        for(int i=n-1;i>=0;i--){
        int y=sqrt(arr[i]);
        
        if(arr[i]<0||y*y!=arr[i]) {
            ans =max(ans, arr[i]);
        }
}


    cout << ans <<endl;
    return 0;
}