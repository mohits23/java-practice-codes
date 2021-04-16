package mathe;
import  mathe.Cube;

// This Class returns 1 if no. is armstrong, otherwise returns 0.
public class Armstrong
{
int n;

public Armstrong(int x){
n = x;
}

public int arm()
{
Cube c = new Cube();
int m, re, sum=0,flag;
m = n;

do
{
re = n%10;
sum = c.cub(re) + sum;
n = n/10;
}
while(n != 0 );

if( sum == m )
flag = 1;
else
flag = 0;

return(flag);
}
}