// code_report Solution
// Video Link: https://youtu.be/SIRDTt89zKk
// Problem Link: https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/00000000000881da

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

void solve(string& s) {
   transform(s.begin(), s.end(), s.begin(),
      [](auto c) { return c == 'E' ? 'S' : 'E'; });
}

int main() {
   int t; cin >> t;
   for (int x = 1; x <= t; ++x) {
      int n; string s;
      cin >> n >> s;
      solve(s);
      cout << "Case #" << x << ": " << s << endl;
   }
   return 0;
}
