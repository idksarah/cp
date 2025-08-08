#include <vector>
#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main () {
    freopen("taming.in", "r", stdin);
    freopen("taming.out", "w", stdout);
    int min = 0, max = 0;
    int n;
    scanf("%d", &n);

    vector<int> nums(n);
    vector<int> copy;
    for(int i = 0; i < n; i++){
        scanf("%d", &nums[i]);
    }

    nums[0] = 0;
    copy = nums;
    
    for(int i = n - 1; i > - 1; i--){
        if (copy[i] > 0){
            if (copy[i - 1] == -1){
                copy[i - 1] = copy[i] - 1;
            } else if ((copy[i] - 1) != copy[i - 1]) {
                printf("%d", -1); 
                return 0;
            }
        }
    }
    min = count(copy.begin(), copy.end(), 0);

    copy = nums;
    for(int i = n - 1; i > - 1; i--){
        if (copy[i] > 0){
            if (copy[i - 1] == -1){
                copy[i - 1] = copy[i] - 1;
            } else if ((copy[i] - 1) != copy[i - 1]) {
                printf("%d", -1); 
                return 0;
            }
        } else {
            copy[i] = 0;
        }
    }
    max = count(copy.begin(), copy.end(), 0);
    
    printf("%d %d", min, max);
}