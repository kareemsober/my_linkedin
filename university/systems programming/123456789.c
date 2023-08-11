#include <stdio.h>

#include <stdlib.h>

#include <sys/file.h>

#include <string.h>

#include <fcntl.h>

#include <errno.h>

#include <sys/types.h>
main()
{
  int i = 247593;
  char str[10];

  sprintf(str, "%d", i);
  printf("%s\n", str);
  // Now str contains the integer as characters
}
// int main(){
//   // system("./replace.sh Sales.txt");
//   char inputsearch[300];
//   printf("%s\n", "write what you would like to search for ");
//   scanf("%s\n", inputsearch);
//   char x[500]="grep -a -n '";
//   char z[500]="emp\\|h";
//   char y[500]="' final.c";
//   strcat(x, z);
//   strcat(x, y);
//   printf("1 %s 2 %s 3 %s\n", x, inputsearch, y);
//   // char z [1000]= x  y;
//   printf("%s\n", x);
// system(x);
// // system("cat final.c");
// return 0;
//
// }
// sed -i '4d' ./file
