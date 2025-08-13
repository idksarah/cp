#include <cstdio>
#include <vector>
#include <set>
#include <algorithm>
#include <iostream>
using namespace std;

int main () {
    // freopen("milkorder.in", "r", stdin);
    // freopen("milkorder.out", "w", stdout);
    int n, m, k;
    scanf("%d %d %d", &n, &m, &k);
    vector<int> nums(n), hierarchy(m);
    for(int i = 0; i < m; i++) scanf("%d", &hierarchy[i]);
    for(int i = 0, index, value; i < k; i++){
        scanf("%d %d", &index, &value);
        nums[index - 1] = value;
    }
    for(int i = 0; i < n; i++){
        if (nums[i] == 0){ // if blank

        }
    }
    
}