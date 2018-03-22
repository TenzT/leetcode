/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
/* Hint: 'I'-->1; 'V' -->5; 'X'-->10; 'L'-->50
 * 'C'-->100; 'D'-->'500'; 'M'-->'1000'
 * Scan each character from left to right,given a Temp variable,
 */

#include <stdio.h>
#include <unordered_map>    //c++11 is needed
using namespace std;

int RomantoInteger(string s){
    int result = 0;
    unordered_map<char, int> m{{'I', 1}, {'V', 5}, {'X', 10}, 
        {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};

    for(int i=0;i<s.size();i++) {
        int val = m[s[i]];
        if(i == s.size()-1 || m[s[i]]>=m[s[i+1]] ) {
            result += val;
        } else {
            result -= val;
        }
    }
    
    return result;
}

int main(int argc, char* argv[]){
    

    string s = "DCXXI";
    int result = RomantoInteger(s);
    printf("%d \n", result);
    //Expecting output:621
    return 0;
}