#include <cstdio>
#include <vector>
#include <algorithm>
using namespace std;

int main () {
    // freopen("milkorder.in", "r", stdin);
    // freopen("milkorder.out", "w", stdout);
    int n, m, k;
    scanf("%d %d %d", &n, &m, &k);
    vector<int> hierarchy(m);
    vector<int> cows;
    vector<vector<int>> guaranteed (k, vector<int>(2));
    for(int i = 0; i < m; i++){
        scanf("%d", &hierarchy[i]);
    }
    for(int i = 0; i < k; i++){
        scanf("%d %d", &guaranteed[i][0], &guaranteed[i][1]);
    }
    sort(guaranteed.begin(), guaranteed.end(), [](const vector<int>& a, const vector<int> &b) {
        return a[1] < b[1];
    });
    cows.assign(hierarchy.begin(), hierarchy.end());
    for(int i = 0; i < guaranteed.size(); i++){
        int testIndex = cows[guaranteed[i][1]] - 1;
        if (testIndex != guaranteed[i][0]){
            cows.insert(cows.begin() + guaranteed[i][1] - 1, guaranteed[i][0]);
        }
    }
    // for(int i = 0; i < cows.size(); i++){
    //     printf("%d", cows[i]);
    // }
    for(int a = 0; a < m; a++){
        for(int b = 0; b < guaranteed.size(); b++){
            if(cows[a] != guaranteed[b][1]){
                if(find(hierarchy.begin(), hierarchy.end(), cows[a]) != hierarchy.end()) {
                    bool print = true;
                    for(int c = 0; c < guaranteed.size(); c++){
                        if(a + 1 == guaranteed[c][1] - 1){
                            print = false;
                        }
                    }
                    if(print){
                        printf("%d", a + 2);
                        break;
                    }
                }
            }
        }
    }

}