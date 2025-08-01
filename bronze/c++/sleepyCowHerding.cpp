#include <iostream>
#include <map>
#include <algorithm>
#include <iterator>
using namespace std;

int c[3];
int d[3];

int getMin() {
    int count = 0;
    int gap1 = c[1] - c[0];
    int gap2 = c[2] - c[1];
    while (gap1 > 1 || gap2 > 1){
        int endpoint = c[1];
        if (gap1 < gap2){
            int middle = c[1] - 1;
            c[2] = endpoint;
            c[1] = middle;
        } else {
            int middle = c[1] + 1;
            c[0] = endpoint;
            c[1] = middle;
        }
        gap1 = c[1] - c[0];
        gap2 = c[2] - c[1];
        count++;
    }
    return count;
}

int getMax() {
    int count = 0;
    int gap1 = d[1] - d[0];
    int gap2 = d[2] - d[1];
    while (gap1 > 1 || gap2 > 1){ 
        int endpoint = d[1];
        if (gap1 < gap2){
            int middle = d[2] - 1;
            d[0] = endpoint;
            d[1] = middle;
        } else {
            int middle = d[0] + 1;
            d[2] = endpoint;
            d[1] = middle;
        }
        gap1 = d[1] - d[0];
        gap2 = d[2] - d[1];
        count++;
    }
    return count;
}

int main () {
    freopen("herding.in", "r", stdin);
    freopen("herding.out", "w", stdout);
    scanf("%d %d %d", &c[0], &c[1], &c[2]);
    sort(c, c+3);
    copy(begin(c), end(c), begin(d));
    
    printf("%d\n", getMin());
    printf("%d", getMax());
    
}
