#include <cstdio>
#include <vector>
#include <set>
#include <algorithm>
#include <iostream>
using namespace std;

int main () {
    // freopen("milkorder.in", "r", stdin);
    // freopen("milkorder.out", "w", stdout);
    int n, m, k;
    scanf("%d %d %d", &n, &m, &k);
    vector<int> nums(n), rawHierarchy(m), preDefined(k), newHierarchy;
    for(int i = 0; i < m; i++) scanf("%d", &rawHierarchy[i]);
    for(int i = 0, cow, index, preDefinedIndex = 0; i < k; i++){
        scanf("%d %d", &cow, &index);
        nums[index - 1] = cow;
        preDefined[preDefinedIndex] = cow;
        preDefinedIndex++;
    }
    newHierarchy = rawHierarchy;
    for (int i = 0; i < size(preDefined); i++) {
        auto it = find(newHierarchy.begin(), newHierarchy.end(), preDefined[i]);
        if (it != newHierarchy.end()) {
            newHierarchy.erase(remove(newHierarchy.begin(), newHierarchy.end(), preDefined[i]), newHierarchy.end());
        }
    }
    for(int i = 0; i < n; i++){ 
        if (nums[i] == 0) {
            vector<int> numsCopy = nums;
            numsCopy[i] = 1;
            bool goodShit = true;
            for (int j = 0, hierarchyIndex = 0; j < size(nums) && hierarchyIndex < size(newHierarchy); j++) {
                if (numsCopy[j] == 0) {
                    numsCopy[j] = newHierarchy[hierarchyIndex];
                    hierarchyIndex++;
                }
            }
            for(int i = 0; i < size(numsCopy); i++){
                cout << numsCopy[i];
            }
            for (int j = 0; j < size(rawHierarchy) - 1; j++) { 
                int indexA = distance(numsCopy.begin(), find(numsCopy.begin(), numsCopy.end(), rawHierarchy[j]));
                cout << "a" << indexA << "\n";
                int indexB = distance(numsCopy.begin(), find(numsCopy.begin(), numsCopy.end(), rawHierarchy[j + 1]));
                cout << "b " << indexB << "\n";
                if (indexA > indexB) {
                    goodShit = false;
                    continue;
                }
            }
            cout << "\n";
            if (goodShit) {
                cout << i + 1;
                return 0;
            }
        }
    }
}