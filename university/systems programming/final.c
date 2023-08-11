#include <stdio.h>

#include <stdlib.h>

#include <sys/file.h>

#include <string.h>

#include <fcntl.h>

#include <errno.h>

#include <sys/types.h>

#include <unistd.h>
char logger(char a[5000]){}
int add (int choice){
  int inputadd[99];
  char inputaddstr[500][500];
  if (choice == 1) {
    //employees
    printf("%s\n", "please enter the following for the emp ");
    printf("%s\n", "ID");
    scanf("%d\n", &inputadd[0]);
    printf("%s\n", "first name");
    scanf("%s\n", inputaddstr[0]);
    printf("%s\n", "last name");
    scanf("%s\n", inputaddstr[1]);
    printf("%s\n", "posotion");
    scanf("%s\n", inputaddstr[2]);
    printf("%s\n", "salary");
    scanf("%d\n", &inputadd[1]);
    printf("%s\n", "gender");
    scanf("%s\n", inputaddstr[3]);
    printf("%s\n", "date of birth");
    printf("%s\n", "year");
    scanf("%d\n", &inputadd[2]);
    printf("%s\n", "month");
    scanf("%d\n", &inputadd[3]);
    printf("%s\n", "day");
    scanf("%d\n", &inputadd[4]);
    printf("%s\n", "address");
    scanf("%d\n", &inputadd[5]);
  }
  else if (choice == 2) {
    //phones
    printf("%s\n", "please enter the following for the phones");
    printf("%s\n", "ID");
    scanf("%d\n", &inputadd[0]);
    printf("%s\n", "brand");
    scanf("%s\n", inputaddstr[0]);
    printf("%s\n", "color");
    scanf("%s\n", inputaddstr[1]);
    printf("%s\n", "name");
    scanf("%s\n", inputaddstr[2]);
    printf("%s\n", "price");
    scanf("%d\n", &inputadd[1]);
    printf("%s\n", "count");
    scanf("%d\n", &inputadd[2]);

    printf("%s\n", "Add is Done");
  }
  else if (choice == 3) {
    //customer
    printf("%s\n", "please enter the following for the customer");
    printf("%s\n", "ID");
    scanf("%d\n", &inputadd[0]);
    printf("%s\n", "name");
    scanf("%s\n", inputaddstr[0]);
    printf("%s\n", "phone number");
    scanf("%s\n", inputaddstr[1]);
    printf("%s\n", "name");
    scanf("%s\n", inputaddstr[2]);
    printf("%s\n", "");
    scanf("%d\n", &inputadd[1]);
    printf("%s\n", "date of birth");
    printf("%s\n", "year");
    scanf("%d\n", &inputadd[2]);
    printf("%s\n", "month");
    scanf("%d\n", &inputadd[3]);
    printf("%s\n", "day");
    scanf("%d\n", &inputadd[4]);
    printf("%s\n", "address");
    scanf("%d\n", &inputadd[5]);
    printf("%s\n", "email");
    scanf("%s\n", inputaddstr[3]);

    printf("%s\n", "Add is Done");
  }
  else {
    printf("%s\n", "out of range");
  }
}
int delete(){
  char str[10];
  char x[500]="sed -i '";
  char y[500]="d' Sales.txt";
  int inputt;
  int number;
  printf("%s\n", "search and find the line number that you would like to delete");
  search();
  printf("%s\n", "input the line number to delete");
  scanf("%d\n", &inputt);
  sprintf(str, "%d", inputt);
  strcat(x, str);
  strcat(x, y);
  system(x);
}
int update(int choice){
  system("./replace.sh Sales.txt");
}
void search(){
  char inputsearch[300];
  int counterr;
  char x[500]="grep -a -n '";
  char fasel[3] = "\\|";
  char y[500] = "' final.c";
  // char collect[1000];
  printf("%s\n", "how many things would you like to search for ");
  scanf("%d\n", &counterr);

  for (int i = 0;  i< counterr; i++) {
    printf("%s\n", "thing to search for ??");
    scanf("%s\n", inputsearch);
    strcat(x, inputsearch);
    if (i == counterr-1-1) {
      break;
    }
    strcat(x, fasel);
    }
  strcat(x, y);
  printf("%s\n", x);
  system(x);
  // scanf("%s\n", inputsearch);
  // strcat(x, inputsearch);
  // strcat(x, y);
}
int main() {
  int check;
  int input[99];
  do {
    //main menu
     printf("%s\n", "1- Add.\n");
     printf("%s\n", "2- Delete.\n");
     printf("%s\n", "3- Update.\n");
     printf("%s\n", "4- search.\n");
     printf("%s\n", "5-quit");
     // input[0] = NULL;
     // check = 0;

     scanf("%d\n", &input[0]);
     // check = 1;

     switch (input[0]) {
       case 1:
       //adder
       printf("%s\n", "enter your choice ");
       printf("%s\n", "employee");
       printf("%s\n", "products");
       printf("%s\n", "customer");
       scanf("%d\n", &input[1]);
       int o = add(input[1]);
               break;
       case 2:
       //Delete
       printf("%s\n", "enter your choice ");
       printf("%s\n", "employee");
       printf("%s\n", "products");
       printf("%s\n", "customer");
       scanf("%d\n", &input[1]);
       int o1 = delete();
               break;
       case 3:
       //Update
       printf("%s\n", "enter your choice ");
       printf("%s\n", "employee");
       printf("%s\n", "products");
       printf("%s\n", "customer");
       scanf("%d\n", &input[1]);
       int o2 =update(input[1]);
               break;
       case 4:
       //search
       search();
       // input[0]=0;7
       // check = 0;
               break;
       case 5:
       //quit
       printf("%s\n", "quit");
       exit(1);
               break;
      default:
      printf("%s\n", "out of range ");
     }
// check = 1;
  } while(check);
}
