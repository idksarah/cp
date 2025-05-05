#include <cstdio>
#include <vector>
using namespace std;

int main () {
    // freopen("milkorder.in", "r", stdin);
    // freopen("milkorder.out", "w", stdout);
    int n, m, k;
    scanf("%d %d %d", &n, &m, &k);
    vector<int> hierarchy (n);
    vector<vector<int>> guaranteed (k, vector<int>(2));
    for(int i = 0; i < m; i++){
        scanf("%d", &hierarchy[i]);
    }
    for(int i = 0; i < k; i++){
        scanf("%d %d", &guaranteed[i][0], &guaranteed[i][1]);
    }
    

}