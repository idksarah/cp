#include <vector>
#include <iostream>
#include <cstdio>
using namespace std;

int main () {
    freopen("breedflip.in", "r", stdin);
    freopen("breedflip.out", "w", stdout);
    int n;
    scanf("%d", &n);
    char A[n], B[n];
    scanf("%s", A);
    scanf("%s", B);
    int count = 0;
    for (int i = 0; i < n; i++) {
        if (A[i] != B[i]) {
            if (i == 0 || ((A[i - 1] == B[i - 1]) && i != 0)) {
                count++;
            }
        }
    }
    printf("%d", count);
}