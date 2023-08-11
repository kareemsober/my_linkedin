#include <stdio.h>

#include <stdlib.h>

#include <sys/file.h>

#include <string.h>

#include <fcntl.h>

#include <errno.h>

#include <sys/types.h>

#include <unistd.h>

#include <pthread.h>

#include <unistd.h>

#include <stdio.h>

#include <sys/socket.h>

#include <stdlib.h>

#include <netinet/in.h>

#include <string.h>

#define PORT 8080
int fd;
pid_t spid;
int add(int choice) {
  int inputadd[99];
  char inputaddstr[500][500];
  char towrite[500] = "";
  malloc(sizeof(towrite));
  char textt[20];
  if (choice == 1) {
    fd = open("employees.txt", O_WRONLY | O_CREAT, 0644);
    //employees
    printf("%s\n", textt);
    printf("%s\n", "please enter the following for the emp ");
    printf("%s\n", "ID");
    scanf(" %d", & inputadd[0]);
    sprintf(textt, "%d", inputadd[0]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "first name");
    scanf(" %s", inputaddstr[0]);
    strcat(inputaddstr[0], " ");
    strcat(towrite, inputaddstr[0]);
    printf(" %s\n", "last name");
    scanf(" %s", inputaddstr[1]);
    strcat(inputaddstr[1], " ");
    strcat(towrite, inputaddstr[1]);
    printf(" %s\n", "posotion");
    scanf(" %s", inputaddstr[2]);
    strcat(inputaddstr[2], " ");
    strcat(towrite, inputaddstr[2]);
    printf(" %s\n", "salary");
    scanf(" %d", & inputadd[1]);
    sprintf(textt, "%d", inputadd[1]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "gender");
    scanf(" %s", inputaddstr[3]);
    strcat(inputaddstr[3], " ");
    strcat(towrite, inputaddstr[3]);
    printf(" %s\n", "date of birth");
    printf(" %s\n", "year");
    scanf(" %d", & inputadd[2]);
    sprintf(textt, "%d", inputadd[2]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "month");
    scanf(" %d", & inputadd[3]);
    sprintf(textt, "%d", inputadd[3]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "day");
    scanf(" %d", & inputadd[4]);
    sprintf(textt, "%d", inputadd[4]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "address");
    scanf(" %s", inputaddstr[4]);
    strcat(inputaddstr[4], "\n");
    strcat(towrite, inputaddstr[4]);
    write(fd, towrite, strlen(towrite));

          close(fd);
  } else if (choice == 2) {
    fd = open("phones.txt", O_WRONLY | O_CREAT, 0644);
    //phones
    printf("%s\n", "please enter the following for the phones");
    printf("%s\n", "ID");
    scanf(" %d", & inputadd[0]);
    sprintf(textt, "%d", inputadd[0]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf("%s\n", "brand");
    scanf(" %s", inputaddstr[0]);
    strcat(inputaddstr[0], " ");
    strcat(towrite, inputaddstr[0]);
    printf("%s\n", "color");
    scanf(" %s", inputaddstr[1]);
    strcat(inputaddstr[1], " ");
    strcat(towrite, inputaddstr[1]);
    printf("%s\n", "name");
    scanf(" %s", inputaddstr[2]);
    strcat(inputaddstr[2], " ");
    strcat(towrite, inputaddstr[2]);
    printf("%s\n", "price");
    scanf(" %d", & inputadd[1]);
    sprintf(textt, "%d", inputadd[1]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf("%s\n", "count");
    scanf(" %d", & inputadd[2]);
    sprintf(textt, "%d", inputadd[2]);
    strcat(textt, "\n");
    strcat(towrite, textt);
    write(fd, towrite, strlen(towrite));

    close(fd);


  } else if (choice == 3) {
    fd = open("customer.txt", O_WRONLY | O_CREAT, 0644);
    //customer
    printf("%s\n", "please enter the following for the customer");
    printf("%s\n", "ID");
    scanf(" %d", & inputadd[0]);
    sprintf(textt, "%d", inputadd[0]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf("%s\n", "name");
    scanf(" %s", inputaddstr[0]);
    scanf(" %s", inputaddstr[0]);
    strcat(inputaddstr[0], " ");
    strcat(towrite, inputaddstr[0]);
    printf("%s\n", "phone number");
    scanf(" %s", inputaddstr[1]);
    strcat(inputaddstr[1], " ");
    strcat(towrite, inputaddstr[1]);
    printf("%s\n", "name");
    scanf(" %s", inputaddstr[2]);
    strcat(inputaddstr[2], " ");
    strcat(towrite, inputaddstr[2]);
    printf("%s\n", "");
    scanf(" %d", & inputadd[1]);
    sprintf(textt, "%d", inputadd[1]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf("%s\n", "date of birth");
    printf("%s\n", "year");
    scanf(" %d", & inputadd[2]);
    sprintf(textt, "%d", inputadd[2]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "month");
    scanf(" %d", & inputadd[3]);
    sprintf(textt, "%d", inputadd[3]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "day");
    scanf(" %d", & inputadd[4]);
    sprintf(textt, "%d", inputadd[4]);
    strcat(textt, " ");
    strcat(towrite, textt);
    printf(" %s\n", "address");
    scanf(" %s", inputaddstr[4]);
    strcat(inputaddstr[4], "\n");
    strcat(towrite, inputaddstr[4]);
    write(fd, towrite, strlen(towrite));
    close(fd);
  } else {
    printf("%s\n", "out of range");
  }
}
void delete(int choice) {
  char x[50] = "sed -i '";
  char y[4][30] = {
    "",
    "d' employees.txt",
    "d' phones.txt",
    "d' customer.txt"
  };
  char a[30];
  char str[10];
  int inputt;
  int number;
  printf("%s\n", "search and find the line number that you would like to delete");
  search(choice);
  printf("%s\n", "input the line number to delete");
  scanf(" %d", & inputt);
  sprintf(str, "%d", inputt);
  strcat(x, str);
  strcat(x, y[choice]);
  system(x);
}
int update(int choice) {
  char x[50] = "./replace.sh ";
  char y[4][30] = {
    "",
    "employees.txt",
    "phones.txt",
    "customer.txt"
  };
  strcat(x, y[choice]);
  system(x);
}
void search(int choice) {
  char inputsearch[300];
  int counterr;
  char x[50] = "grep -a -n '";
  char fasel[3] = "\\|";
  char y[4][30] = {
    "",
    "' employees.txt",
    "' phones.txt",
    "' customer.txt"
  };

  printf("%s\n", "how many things would you like to search for ");
  scanf(" %d", & counterr);

  for (int i = 0; i < counterr; i++) {
    printf("%s\n", "thing to search for ??");
    scanf(" %s", inputsearch);
    strcat(x, inputsearch);
    printf("asd%s\n", x);
    if (i == counterr - 1) {
      break;
    }
    strcat(x, fasel);
  }
  printf("zzz%s\n", x);
  printf("%s %d\n", y[choice], choice);
  strcat(x, y[choice]);
  printf("%s\n", x);
  system(x);
  printf("xxxx%s\n", x);
}
void view(int choice) {
  char x[50] = "cat ";
  char y[4][30] = {
    "",
    "employees.txt",
    "phones.txt",
    "customer.txt"
  };
  strcat(x, y[choice]);
  system(x);
}
int menu() {
  int input;
  printf("%s\n", "enter your choice ");
  printf("%s\n", "employee");
  printf("%s\n", "products");
  printf("%s\n", "customer");
  scanf(" %d", & input);
  return input;
}
void startserver() {
  if (fork() == 0) {
    char args;

    execl("./test.sh", "./test.sh", args, NULL);
    perror("execl");
  } else {
    wait(spid);
  }
}
void * backup() {
  printf("entered\n");
  struct sockaddr_in address;
  int sock = 0, valread;
  struct sockaddr_in serv_addr;
  char * backupstart = "start back up";
  char buffer[1024] = {
    0
  };
  if ((sock = socket(AF_INET, SOCK_STREAM, 0)) < 0) {
    printf("\n Socket creation error \n");
    return -1;
  }
  memset( & serv_addr, '0', sizeof(serv_addr));
  serv_addr.sin_family = AF_INET;
  serv_addr.sin_port = htons(PORT);
  if (inet_pton(AF_INET, "127.0.0.1", & serv_addr.sin_addr) <= 0) {
    printf("\nInvalid address/ Address not supported \n");
    return -1;
  }
  if (connect(sock, (struct sockaddr * ) & serv_addr, sizeof(serv_addr)) < 0) {
    printf("\nConnection Failed \n");
    return -1;
  }
  send(sock, backupstart, strlen(backupstart), 0);
  printf("backup start\n");
  valread = read(sock, buffer, 1024);
  printf("%s\n", buffer);
  pthread_exit(NULL);
}
int main() {
  int check;
  int input[99];
  while (1) {
    // input[0] = 0;
    printf("this is input %d\n", input[0]);
    //main menu
    printf("%s\n", "1- Add.\n");
    printf("%s\n", "2- Delete.\n");
    printf("%s\n", "3- Update.\n");
    printf("%s\n", "4- search.\n");
    printf("%s\n", "5- view.\n");
    printf("%s\n", "6- start server.\n");
    printf("%s\n", "7- backup.\n");
    printf("%s\n", "8- lock files.\n");
    printf("%s\n", "9- quit.\n");
    scanf(" %d", & input[0]);
    if (input[0] == 1) {
      //adder
      input[1] = menu();
      add(input[1]);
    } else if (input[0] == 2) {
      //Delete
      input[1] = menu();
      delete(input[1]);
    } else if (input[0] == 3) {
      //Update
      input[1] = menu();
      update(input[1]);
    } else if (input[0] == 4) {
      //search
      input[1] = menu();
      search(input[1]);
    } else if (input[0] == 5) {
      //view
      input[1] = menu();
      view(input[1]);
    } else if (input[0] == 6) {
      //start server
      startserver();
    } else if (input[0] == 7) {
      //backup
      pthread_t inc_x_thread;
      pthread_create( & inc_x_thread, NULL, & backup, NULL);
    } else if (input[0] == 8) {
      //lock
      system("./per.sh");
    } else if (input[0] == 9) {
      //quit
      printf("%s\n", "quit");
      exit(1);

    } else {

      printf("%s\n", "out of range ");

    }
    // check = 1;
  }
}
