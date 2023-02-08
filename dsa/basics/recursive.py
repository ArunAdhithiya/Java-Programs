#Normal approach with recursion with O(max(m,n)) times the complexity
def gcd(m,n):
  (a,b)=(max(m,n),min(m,n))
  if a%b==0:
    return b
  else:
    gcd(a,a-b)
    
    
#Euclids algorithm with O(log(min(m,n))) (better than above approach)

def gcd(m,n):
  (a,b)=(max(m,n),min(m,n))
  if a%b==0:
    return b
  else:
    gcd(a,a%b)
    
    
 #Basic Approach = O(min(m,n))

def gcd(m,n):
  for i in range(1,min(m,n)+1):
    if(m%i ==0 and n%i==0):
      d=i
   
  return i

x=int(input())
y=int(input())
gcd(x,y)
   
