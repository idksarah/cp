#include <cstdio>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n = 0;
    long time = 0;
    freopen("cowqueue.in", "r", stdin);
    freopen("cowqueue.out", "w", stdout);
    scanf("%d", &n);
    vector<vector<long>> cows (n, vector<long>(2));
    for(int i = 0; i < n; i++){
        scanf("%ld %ld", &cows[i][0], &cows[i][1]);
    }
    sort(cows.begin(), cows.end(), [](const vector<long>& a, const vector<long>& b) {
        return a[0] < b[0];
    });
    for(int i = 0; i < n; i++){
        if (time <= cows[i][0]){
            if(i != 0 && (cows[i - 1][0] + cows[i - 1][1]) < cows[i][0]) {
                time = cows[i][0] + cows[i][1];
            } else {
                if (i == 0){
                    time += cows[i][0] + cows[i][1];
                } else {
                    time += cows[i][1];
                }
            }
        } else {
            time += cows[i][1];
        }
    }
    printf("%ld", time);
}