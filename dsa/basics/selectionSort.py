#O(n^2) complexity with O(n^2) in each step
def SelectionSort(l):
   for i in range(len(l)):
       mi=i
       for j in range(i+1,len(l)):
           if(l[mi]>l[j]):
               mi=j

       (l[i],l[mi])=(l[mi],l[i])

   return l

print(SelectionSort([23,4,3,1,2,35,434,332]))
