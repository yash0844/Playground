#include <stdio.h>
int main() {
  int n, fd, ld ,sum;
  scanf("%d",&n);
  ld = n % 10 ;
  while(n >= 10)
  {
    n /= 10 ;
  }
  fd = n;
  sum = ld + fd ;
  printf("%d",sum);
  
	//Type your code
	return 0;
}