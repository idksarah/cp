#include <cstdio>
#include <vector>
#include <set>
#include <algorithm>
using namespace std;

int main () {
    long long N = 0;
    scanf("%ld", &N);
    vector<long long> maxs;
    for(long long i = 0; i < N; i++){
        long long temp;
        scanf("%ld", &temp);
        maxs.push_back(temp);
    }
    sort(maxs.begin(), maxs.end());
    set<pair<long long, long long>> revenue;
    for(long long i = 0; i < N; i++){
        if(revenue.empty()){
            revenue.insert({maxs[i] * (N - i), maxs[i]});
        } else {
            if(maxs[i] * (N - i) != revenue.rbegin()->first){
                revenue.insert({maxs[i] * (N - i), maxs[i]});
            }
        }
    }
    auto it = revenue.rbegin();
    printf("%ld %ld", it->first, it->second);
}