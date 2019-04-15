# code_report Solution
# Video Link: https://youtu.be/SIRDTt89zKk
# Problem Link: https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/00000000000881da

def solve(s: str) -> str:
    return ''.join('E' if c == 'S' else 'S' for c in s)

t = int(input())

for i in range(t):
    n = int(input())
    s = input()
    print('Case #' + str(i + 1) + ':', solve(s))
