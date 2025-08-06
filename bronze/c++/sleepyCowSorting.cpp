#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main() {
    freopen("sleepy.in", "r", stdin);
    freopen("sleepy.out", "w", stdout);
    int n;
    vector<int> nums;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        int input;
        scanf("%d", &input);
        nums.push_back(input);
    }
    int inOrder = 1;
    for(int i = n - 1; i > 0; i--){
        if (nums[i] > nums[i - 1]) {
            inOrder++;
        } else {
            break;
        }
    }
    cout << size(nums) - inOrder;   
}