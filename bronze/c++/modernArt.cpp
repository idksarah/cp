#include <vector>
#include <cstdio>
#include <iostream>
#include <set>
using namespace std;

int main () {
    freopen("art.in", "r", stdin);
    freopen("art.out", "w", stdout);

    int n; cin >> n;
    vector<vector<int>> canvas(n, vector<int>(n, 0));
    set<int> present, good;
    vector<vector<vector<int>>> rect(9, vector(4, vector<int>(2, -1)));
    for (int i = 0; i < n; i++) {
        string row;
        cin >> row;
        for (int j = 0; j < n; j++){
            int num = row[j] - '0';
            canvas[j][i] = num - 1;
            
            if (num == 0) continue;

            present.insert(num - 1);
            good.insert(num - 1);

            if (rect[num - 1][0][0] == -1) {
                rect[num - 1][0] = vector<int>{j, i};
                rect[num - 1][1] = vector<int>{j, i};
                rect[num - 1][2] = vector<int>{j, i};
                rect[num - 1][3] = vector<int>{j, i};
            } else {
                if ((j <= rect[num - 1][0][0] && i < rect[num - 1][0][1])
                || (j < rect[num - 1][0][0] && i <= rect[num - 1][0][1])) {
                    rect[num - 1][0] = vector<int>{j, i};
                } else if ((j >= rect[num - 1][1][0] && i < rect[num - 1][1][1])
                || (j > rect[num - 1][1][0] && i <= rect[num - 1][1][1])) {
                    rect[num - 1][1] = vector<int>{j, i};
                } else if ((j <= rect[num - 1][2][0] && i > rect[num - 1][2][1])
                || (j < rect[num - 1][2][0] && i >= rect[num - 1][2][1])) {
                    rect[num - 1][2] = vector<int>{j, i};
                } else if ((j >= rect[num - 1][3][0] && i > rect[num - 1][3][1])
                || (j > rect[num - 1][3][0] && i >= rect[num - 1][3][1])) {
                    rect[num - 1][3] = vector<int>{j, i};
                }
            }
        }
    }
    for (int color: present) {
        int minX = 0, maxX = 0, minY = 0, maxY = 0;
        minX = min(rect[color][0][0], rect[color][2][0]);
        maxX = max(rect[color][1][0], rect[color][3][0]);
        minY = min(rect[color][0][1], rect[color][1][1]);
        maxY = max(rect[color][2][1], rect[color][3][1]);
        for (int y = minY; y <= maxY; y++) {
            for (int x = minX; x <= maxX; x++) {
                if (canvas[x][y] != color) {
                    good.erase(canvas[x][y]);
                }
            }
        }
    }
    cout << good.size();
}
