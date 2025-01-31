n=int(input())
s=str(n)
f=s.count("4")
S=s.count("7")
t=f+S
if t==4 or t==7:
    print("YES")
else:
    print("NO")