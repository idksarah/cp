#include <iostream>
#include <cstdio>
#include <vector>
#include <string>
using namespace std;

int main () {
    freopen("cowtip.in", "r", stdin);
    freopen("cowtip.out", "w", stdout);
    int n; cin >> n;
    vector<vector<int>> matrix (n, vector<int>(n, 0));
    for (int i = 0; i < n; i++) {
        string input; cin >> input;
        for (int j = 0; j < n; j++) {
            matrix[i][j] = input[j] - '0';
        }
    }
    int count = 0;
    for (int row = n - 1; row >= 0; row--) {
        for (int column = n - 1; column >= 0; column--) {
            if (matrix[row][column] == 1) {
                count++;
                for (int rowFlip = row; rowFlip >= 0; rowFlip--) {
                    for (int columnFlip = column; columnFlip >= 0; columnFlip--) {
                        matrix[rowFlip][columnFlip] = !matrix[rowFlip][columnFlip];
                    }
                }
            }
        }
    }
    cout << count;
}