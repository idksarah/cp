#include <cstdio>
#include <iostream>
#include <sstream>
#include <vector>
#include <map>
#include <cstring>
#include <string>
#include <algorithm>
#include <cmath>
using namespace std;

vector<string> animals;
map<string, vector<string>> cows; // distance, animal, relativeCow, relativeCowAnimal

int getDistance(string cow1, string cow2, string relation, string cow1Animal);

int main() {
    int n;
    scanf("%d", &n);
    cin.ignore();
    animals = {"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};
    cows.insert({"Bessie", vector<string> {to_string(0), "Ox", "none", "none"}});
    for(int i = 0; i < n; i++){
        string line;
        getline(cin, line);
        istringstream iss(line);
        string word;
        vector<string> b;
        while(iss >> word && b.size() < 8){
            b.push_back(word);
        }
        string cow1, cow2, relation, animal;
        cow1 = b[0];
        cow2 = b[7];
        relation = b[3];
        animal = b[4];
        int distance = getDistance(cow1, cow2, relation, animal);
        cows.insert({cow1, vector<string> {to_string(distance), animal, cow2, cows[cow2][1]}});
    }
    for (const auto& pair : cows) {
    const string& cowName = pair.first;
    const vector<string>& data = pair.second;
}

    vector<string> currCow = cows["Elsie"];
    string relativeCow = currCow[3];
    int distance = 0;
    bool gogo = true;
    while(gogo){
        distance += stoi(currCow[0]);
        relativeCow = currCow[2];
        if (relativeCow == "Bessie"){
            gogo = false;
        } else {
            currCow = cows[relativeCow];
        }
    }
    cout << abs(distance);
}

int getDistance(string cow1, string cow2, string relation, string cow1Animal){
    int distance = 0;
    int index1 = find(animals.begin(), animals.end(), cow1Animal) - animals.begin();
    int index2 = find(animals.begin(), animals.end(), cows[cow2][1]) - animals.begin();
    if (relation == "previous"){
        if (index1 == index2){
            distance = 12;
        } else {
            while (index1 != index2) {
                distance--;
                index2 = (index2 < 1) ? 11 : index2 - 1;
            }
        } 
    } else if (relation == "next"){
        if (index1 == index2){
            distance = 12;
        } else {
            while (index1 != index2) {
                distance ++;
                index2 = (index2 > 10) ? 0 : index2 + 1;
            }
        }
    }
    return distance;
}