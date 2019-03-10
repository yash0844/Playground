#include<stdio.h>
int main()
{
  int number , sum ;
 
  scanf("%d",&number);
  sum = (number / 100 ) + (number % 10 ) ;
  printf("%d ",sum);
 
  //Type your code here
  return 0;
}