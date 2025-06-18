#include <iostream>
#include <map>
#include <algorithm>
using namespace std;

map <int, int> cows;

int main () {
    // freopen("herding.in", "r", stdin);
    // freopen("herding.out", "w", stdout);
    int c[3];
    scanf("%d %d %d", &c[0], &c[1], &c[2]);
    sort(c, c+3);
    
    if (abs(cows[0] - cows[1]) == 1 && (abs(cows[1] - cows[2] == 1))){
        printf("%n", 0);
        printf("%n", 0);   
    } else {
        printf("%n", getMin());
        printf("%n", getMax());
    }
    
}

int getMin() {
    int gap = min(abs(cows[0] - cows[1]), abs(cows[1] - cows[2]));
    while (gap != 0){

    }
}

int getMax() {

}