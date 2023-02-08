#Normal approach with recursion with max(m,n) times the complexity
def gcd(m,n):
  (a,b)=(max(m,n),min(m,n))
  if a%b==0:
    return b
  else:
    gcd(a,a-b)
