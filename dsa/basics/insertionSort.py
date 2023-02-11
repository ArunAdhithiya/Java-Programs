#O(n^2) complexity with O(n) 

def insertSort(l):
    for i in range(len(l)):
        j=i
        while(j>0 and l[j]<l[j-1]): # this takes O(n)
            (l[j],l[j-1])=(l[j-1],l[j])
            j-=1

    return l

print(insertSort([22,33,12,11,2,3,453,342]))

