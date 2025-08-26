#include <vector>
#include <iostream>
using namespace std;

int main () {
    int n; cin >> n;
    vector<int> nums(n);
    for (int i = 0; i < n; i++) { cin >> nums[i]; }
    int count = 0; int even = 0; int odd = 0;
    for (int i = 0; i < n; i++) {
        if (nums[i] % 2 == 0) even++;
        else odd++;
    }
    bool evenGroup = true;
    for (int i = 0; i < n; i++) {
        if (odd == 0 && even == 0) break;
        if (evenGroup) {
            if (even > 0) { even--; count++; }
            else if (odd > 1) { odd-=2; count++;}
            else { count--; break; }
        } else {
            if (odd > 0) { odd--; count++; }
            else break;
        }
        evenGroup = !evenGroup;
    }
    cout << count;
}