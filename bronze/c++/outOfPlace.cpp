#include <vector>
#include <iostream>
#include <cstdio>
using namespace std;

int main () {
    // freopen("outofplace.in", "r", stdin);
    // freopen("outofplace.out", "w", stdout);
    int n; cin >> n;
    vector<int> nums(n);
    for (int i = 0; i < n; i++) { cin >> nums[i]; }
    int count = 0; int bessie = 0;
    // for (int i = 0; i < n; i++) {
    //     if (i < n && nums[i] > nums[i + 1]) { bessie = i;}
    //     else if (i > 0 && nums[i] < nums[i - 1]) {
    //         bessie = i;
    //     } else if (i < n && i > 0 && (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) || (nums[i] < nums[i - 1] && nums[i] < nums[i + 1])) {
    //         bessie = i;
    //     }
    // }
    for (int i = n - 1; i > 0; i--) {
        // for(int i = 0; i < n; i++){
        //     cout << nums[i] << " ";
        // }
        if (nums[i] < nums[i - 1]) {
            count++;
            int below = nums[i - 1];
            int above = nums[i];
            int downBoy = 0;
            while (nums[i - 1] == nums[i - 2 - downBoy]) {
                downBoy++;
            }
            nums[i - 1 - downBoy] = above;
            nums[i] = below;
        }
    }
    cout << count;
}