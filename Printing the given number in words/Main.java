#include<stdio.h>
int main()
{
  int input1 ;
  scanf("%d %d",&input1);
  switch(input1)
  {
    case 1:
  printf("one");
  break ;
  case 2:
  printf("two");
  break ;
  case 3: printf("Three");
  break;
  case 4: printf("four");
  break ;
  case 5: printf("five");
  break;
  default: printf("Invalid");
  }
  //Type your code here
  return 0;
}