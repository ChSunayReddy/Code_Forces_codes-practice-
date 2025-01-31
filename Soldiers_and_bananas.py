c,tm,b=map(int,input().split())
sum=0
for  i in range(1,b+1):
    sum+=i*c
tc=sum-tm
if tc<=0 :
    print(0)
else:
    print(tc)