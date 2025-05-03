// 12:11 on 5/3/25

#include <cstdio>
#include <vector>
using namespace std;

int main () {
    long long n, target;
    scanf("%lld %lld", &n, &target);
    vector<long long> values;
    for(long long i = 0; i < n; i++){
        long long temp;
        scanf("%lld", &temp);
        values.push_back(temp);
    }
    bool answerable = false;
    for(long long i = 0; i < n; i++){
        for(long long j = 0; j < n; j++){
            if(i != j){
                if(values[i] + values[j] == target){
                    printf("%lld %lld", i + 1, j + 1);
                    answerable = true;
                    break;
                }
            }
        } if(answerable) break;
    }
    if(!answerable){
        printf("%s", "IMPOSSIBLE");
    }
}