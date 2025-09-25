#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

int main() {
    // int n; cin >> n;
    // vector<int> a(n), counts(n + 1), sln(n + 1);
    // for (int i = 0; i < n; i++) {
    //     cin >> a[i];
    // }
    // for (int i = 0; i<n; i++) {
    //     counts[a[i]]++;
    // }
    // for (int i = 0; i <= n; i++) {
    //     if (i == 0) {
    //         sln[i] == counts[i];
    //     } else {
            
    //     }
    //     // for (int current = i - 1; current <= i; current++){
    //     //     if (current == i && counts[current] != 0) {
    //     //         sln[current] = max(counts[current], sln[i]);
    //     //     } else if (current != i && counts[current] == 0) {
    //     //         sln[i] ++;
    //     //     }
    //     // }
    // }
    // for (int i = 0; i <= n; i++) {
    //     cout << sln[i] << "\n";
    // }
    //
    
    int n; cin >> n;
    vector<int> a(n), counts(n + 1), sln(n + 1);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i<n; i++) {
        counts[a[i]]++;
    }
    for (int i = 0; i <= n; i++) {
        for (int current = 0; current <= i; current++){
            if (current == i && counts[current] != 0) {
                sln[current] = max(counts[current], sln[i]);
            } else if (current != i && counts[current] == 0) {
                sln[i] ++;
            }
        }
    }
    for (int i = 0; i <= n; i++) {
        cout << sln[i] << "\n";
    }

}