#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;

int main() {
    int n = 0;
    freopen("triangles.in", "r", stdin);
    freopen("triangles.out", "w", stdout);
    cin >> n;
    vector<vector<int>> points(n, vector<int>(2));

    for(int i = 0; i < n; i++){
        cin >> points[i][0] >> points[i][1];
    }
    int maximum = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            for (int k = 0; k < n; k++){
                if (i != j && i != k && j != k){
                    if(((points[i][0] == points[j][0])) && (((points[i][1] == points[k][1])) || ((points[j][1] == points[k][1])))){
                        maximum = max(maximum, (abs(points[i][1]- points[j][1]) * abs(points[i][0] - points[k][0])));
                    } else if(((points[i][0] == points[k][0]) && ((((points[i][1] == points[j][1]))) || ((points[j][1] == points[k][1]))))){
                        maximum = max(maximum, (abs(points[i][1]- points[k][1]) * abs(points[i][0] - points[j][0])));

                    } else if(((points[j][0] == points[k][0]) && (((points[i][1] == points[k][1])) || ((points[j][1] == points[i][1]))))) {
                        maximum = max(maximum, (abs(points[j][1]- points[k][1]) * abs(points[i][0] - points[k][0])));

                    } else if(((points[i][1] == points[j][1])) && (((points[i][0] == points[k][0])) || ((points[j][0] == points[k][0])))) {
                        maximum = max(maximum, (abs(points[i][0]- points[j][0]) * abs(points[i][1] - points[k][1])));

                    } else if (((points[i][1] == points[k][1]) ) && (((points[i][0] == points[j][0])) || ((points[j][0] == points[k][0])))) {
                        maximum = max(maximum, (abs(points[i][0]- points[k][0]) * abs(points[i][1] - points[j][1])));

                    } else if (((points[j][1] == points[k][1])) && (((points[i][0] == points[k][0])) || ((points[j][0] == points[i][0])))) {
                        maximum = max(maximum, (abs(points[j][0]- points[k][0]) * abs(points[i][1] - points[k][1])));

                    }
                }
            }
        }
    }
    cout << maximum;
}