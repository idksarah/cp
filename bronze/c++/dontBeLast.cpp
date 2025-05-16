#include <cstdio>
#include <iostream>
using namespace std;

int main () {
    int cows[7] = {};
    int n = 0;
    freopen("notlast.in", "r", stdin);
    freopen("notlast.out", "w", stdout);
    scanf("%d", &n);
    
    for(int i = 0; i < n; i++){
        char cowName[100];
        int milked;
        scanf("%s %d", &cowName, &milked);
        if(cowName[0] == 'B'){
            cows[0] += milked;
        } else if (cowName[0] == 'E'){
            cows[1] += milked;
        } else if (cowName[0] == 'D'){
            cows[2] += milked;
        } else if (cowName[0] == 'G'){
            cows[3] += milked;
        } else if (cowName[0] == 'A'){
            cows[4] += milked;
        } else if (cowName[0] == 'M'){
            cows[5] += milked;
        } else {
            cows[6] += milked;
        }
    }
    int last = min(min(min(min(min(min(cows[0], cows[1]), cows[2]), cows[3]), cows[4]), cows[5]), cows[6]);
    int secondLast = INT32_MAX;
    int none = true;
    int tie = false;
    int secondLastCow;
    for(int i = 0; i < 7; i++){
        if (cows[i] > last && cows[i] < secondLast){
            secondLast = cows[i];
            secondLastCow = i;
            none = false;
        } else if (cows[i] == secondLast) {
            tie = true;
        }
    }
    if(tie || none){
        printf("%s", "Tie");
    } else {
        switch (secondLastCow) {
            case 0:
                printf("%s", "Bessie");
            break; 
            case 1:
                printf("%s", "Elsie");
            break; 
            case 2:
                printf("%s", "Daisy");
            break; 
            case 3:
                printf("%s", "Gertie");
            break; 
            case 4:
                printf("%s", "Annabelle");
            break; 
            case 5:
                printf("%s", "Maggie");
            break; 
            case 6:
                printf("%s", "Henrietta");
            break; 
        }
    }
}