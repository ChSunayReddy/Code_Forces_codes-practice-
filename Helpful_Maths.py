n=str(input())
l=[]
for i in n:
    if i!="+":
        l.append(int(i))
s=""
l.sort()
for i in range(len(l)):
    if i!=len(l)-1:
        s+=str(l[i])+"+"
    else:
        s+=str(l[i])
print(s)