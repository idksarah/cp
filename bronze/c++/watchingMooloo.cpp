#include <vector>
#include <iostream>
using namespace std;

int main () {
    long long moonies, n, k;
    cin >> n >> k;
    vector<long long> days(n);
    for (long long i = 0; i < n; i++) {
        cin >> days[i];
    }
    moonies = k + 1;
    for(int i = 0; i < n - 1; i++) {
        if ((days[i + 1] - days[i]) > k) {
            moonies += k + 1;
        } else {
            moonies += (days[i + 1] - days[i]);
        }
    }
    cout << moonies;
}