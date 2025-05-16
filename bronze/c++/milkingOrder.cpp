#include <cstdio>
#include <vector>
#include <set>
#include <algorithm>
using namespace std;

int main () {
    // freopen("milkorder.in", "r", stdin);
    // freopen("milkorder.out", "w", stdout);
    int n, m, k;
    scanf("%d %d %d", &n, &m, &k);
    vector<int> hierarchy(m);
    vector<vector<int>> guaranteed (k, vector<int>(2));
    set<int> guaranteedIndexes;
    for(int i = 0; i < m; i++){
        scanf("%d", &hierarchy[i]);
    }
    for(int i = 0; i < k; i++){
        scanf("%d %d", &guaranteed[i][0], &guaranteed[i][1]);
        guaranteedIndexes.insert(guaranteed[i][1]);
    }
    sort(guaranteed.begin(), guaranteed.end(), [](const vector<int>& a, const vector<int> &b) {
        return a[1] < b[1];
    });
    for(int i = 0; i < n; i++){
        if(guaranteedIndexes.find(i) != guaranteedIndexes.end()){
            int guaranteedLeft, guaranteedRight;
            for(int j = 0; j < k; j++){
                if(guaranteed[j][0] < i){
                    guaranteedLeft++;
                } else {
                    guaranteedRight++;
                }
            }
            int hierarchyLeft, hierarchyRight;
        }   
    }
}