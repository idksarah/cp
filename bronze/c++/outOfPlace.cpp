#include <vector>
#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main () {
    freopen("outofplace.in", "r", stdin);
    freopen("outofplace.out", "w", stdout);
    int n; cin >> n;
    vector<int> nums(n);
    for (int i = 0; i < n; i++) { cin >> nums[i]; }
    int count = -1;
    vector<int> sorted = nums;
    sort(sorted.begin(), sorted.end());
    for (int i = 0; i < n; i++) {
        if (sorted[i] != nums[i]) {
            count++;
        }
    }
    cout << count;
}