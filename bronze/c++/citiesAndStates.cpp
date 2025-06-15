#include <cstdio>
#include <iostream>
#include <vector>
#include <map>
#include <numeric>
using namespace std;

int main() {
    freopen("citystate.in", "r", stdin);
    freopen("citystate.out", "w", stdout);
    int n, count = 0;
    scanf("%d", &n);
    map<string, int> cityStates;
    for(int i = 0; i < n; i++){
        char c_city[11];
        char c_state[3];
        scanf("%s %s", &c_city, &c_state);
        string city = c_city;
        string state = c_state;
        if (city.substr(0,2) != state) {
            cityStates[city.substr(0,2) + state] += 1;
        }        
    }
    int sum = 0;
    for(const auto& pair : cityStates){
        // printf("%d", pair.second);
        string otherKey = pair.first.substr(2,3) + pair.first.substr(0,2);
        if (cityStates.count(otherKey)) {
            sum += cityStates.at(otherKey) * cityStates.at(pair.first);
        }
    }
    printf("%d", sum / 2);
}