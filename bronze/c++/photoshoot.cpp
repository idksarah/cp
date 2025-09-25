#include <vector>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main () {
    int n; cin >> n;
    string s; cin >> s;
    vector<char> chars(s.begin(), s.end());
    int count = 0;
    int moves = 0;
    for (int i = n - 1; i >= 0; i -= 2) {
        if (chars[i] != 'G' && chars[0] == 'G') {
            // cout << i << ":    ";
            reverse(chars.begin(), chars.begin() + i + 1);
            count ++;
            // for (char c : chars) {
            //     cout << c;
            // }
            // cout << "\n";
        }
    }
    cout << count;
}