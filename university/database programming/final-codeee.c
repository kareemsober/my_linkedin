#include <stdio.h>

#include <stdlib.h>

#include <pthread.h>

FILE * fp;
struct employee {
  int id;
  char fname[50];
  char lname[50];
  char pos[50];
  char gender[50];
  int salary;
  int year;
  int month;
  int day;
  char address[500];
}* empp[100];
struct phones {
  int id;
  char name[50];
  char brand[50];
  char color[50];
  int price;
  int count;
}* phoo[100];
struct customer {
  int id;
  char name[50];
  char gender[50];
  double phone_number;
  int year;
  int month;
  int day;
  char email[200];
}* custt[100];
struct thread_args
 {
    struct employee *employees;
    struct phones *phonenumbers;
    struct customer *customers;
};
void *backup(void *targs) {
  // int pthread_detach(pthread_t thread);
  printf("%s\n", "thread started");
  // printf("%i\n", ((struct thread_args *) targs)->employees->id);
  struct employee *emps = ((struct thread_args *) targs)-> employees;
  struct phones *phos = ((struct thread_args *) targs)-> phonenumbers;
  struct customer *custs = ((struct thread_args *) targs)-> customers;
  for (int i = 0; i < 100; i++) {
    // printf("%i\n", emps[i].id);
    if (emps[i].id != 0)
    {
    fp = fopen("employee.txt", "a");
    fprintf(fp, " %d %s %s %s %d %s %d-%d-%d %s \n", emps[i].id, emps[i].fname, emps[i].lname, emps[i].pos, emps[i].salary, emps[i].gender, emps[i].year, emps[i].month, emps[i].day, emps[i].address);
    fclose(fp);
    } else if (phos[i].id !=0)
    { 
    fp = fopen("phones.txt", "a");
    fprintf(fp, "%d %s %s %s %d %d \n", phos[i].id, phos[i].brand, phos[i].color, phos[i].name, phos[i].price, phos[i].count);
    fclose(fp);
    }else if (custs[i].id !=0)
    { 
    fp = fopen("customer.txt", "a");
    fprintf(fp, "%d %s %lf %d-%d-%d %s \n", custs[i].id, custs[i].name, custs[i].phone_number, custs[i].year, custs[i].month, custs[i].day, custs[i].email);
    fclose(fp);
    }
  }
}

void add(int choice, int x) {
  int id[10];
  if (choice == 1) {
    //employees
    empp[x] = (struct employee * ) malloc(sizeof(struct employee));
    printf("%s\n", "please enter the following for the emp ");
    printf("%s\n", "ID");
    scanf(" %i", & id[0]);
    empp[x] -> id = id[0];
    printf(" %s\n", "first name");
    scanf(" %s", & empp[x] -> fname);
    printf(" %s\n", "last name");
    scanf(" %s", & empp[x] -> lname);
    printf(" %s\n", "posotion");
    scanf(" %s", & empp[x] -> pos);
    printf(" %s\n", "salary");
    scanf(" %d", & id[1]);
    empp[x] -> salary = id[1];
    printf(" %s\n", "gender");
    scanf(" %s", & empp[x] -> gender);
    printf(" %s\n", "date of birth");
    printf(" %s\n", "year");
    scanf(" %d", & id[2]);
    empp[x] -> year = id[2];
    printf(" %s\n", "month");
    scanf(" %d", & id[3]);
    empp[x] -> month = id[3];
    printf(" %s\n", "day");
    scanf(" %d", & id[4]);
    empp[x] -> day = id[4];
    printf(" %s\n", "address");
    scanf(" %s", & empp[x] -> address);
  } else if (choice == 2) {
    //phones
    phoo[x] = (struct phones * ) malloc(sizeof(struct phones));
    printf("%s\n", "please enter the following for the phones");
    printf("%s\n", "ID");
    scanf(" %d", & id[0]);
    phoo[x] -> id = id[0];
    printf("%s\n", "brand");
    scanf(" %s", & phoo[x] -> brand);
    printf("%s", "color");
    scanf(" %s", & phoo[x] -> color);
    printf("%s\n", "name");
    scanf(" %s", & phoo[x] -> name);
    printf("%s", "price");
    scanf(" %d", & id[1]);
    phoo[x] -> price = id[1];
    printf("%s\n", "count");
    scanf(" %d", & id[2]);
    phoo[x] -> count = id[2];
    printf("%s\n", "Add is Done");
  } else if (choice == 3) {
    //customer
    custt[x] = (struct customer * ) malloc(sizeof(struct customer));
    printf("%s\n", "please enter the following for the customer");
    printf("%s\n", "ID");
    scanf(" %d", & id[0]);
    custt[x] -> id = id[0];
    printf("%s\n", "name");
    scanf(" %s", & custt[x] -> name);
    printf("%s\n", "phone number");
    double phoneee;
    scanf(" %lf", & phoneee);
    custt[x] -> phone_number = phoneee;
    printf("%s\n", "date of birth");
    printf("%s\n", "year");
    scanf(" %d", & id[2]);
    custt[x] -> year = id[2];
    printf(" %s\n", "month");
    scanf(" %d", & id[3]);
    custt[x] -> month = id[3];
    printf(" %s\n", "day");
    scanf(" %d", & id[4]);
    custt[x] -> day = id[4];
    printf("%s\n", "email");
    scanf(" %s", & custt[x] -> email);
    printf("%s\n", "Add is Done");
  } else {
    printf("%s\n", "out of range adder");
  }
}

int main() {
  int check;
  int input[30];
  // printf("%d", empp[1]->id);
  while (1) {
    // printf("this is input %d\n", input[0]);
    //main menu
    printf("%s\n", "1- Add.\n");
    printf("%s\n", "2- Delete.\n");
    printf("%s\n", "3- Update.\n");
    printf("%s\n", "4- search.\n");
    printf("%s\n", "5- view.\n");
    printf("%s\n", "6- backup and exit.\n");
          // printf("%d ko %d", &empp[0] -> id, &empp[0] -> id);
    printf("%s\n", "7-quit");
    scanf(" %d", & input[0]);
    if (input[0] == 1) {
      //adder
      printf("%s\n", "enter your choice ");
      printf("%s\n", "employee");
      printf("%s\n", "products");
      printf("%s\n", "customer");
      scanf(" %d", & input[1]);
      for (int i = 0; i < 100; i++) {
        if (&empp[i]->id == 0 && input[1] == 1) {
          add(1, i);
          printf("wowow %d \n", &empp[i] -> id);
          break;
        } else if (phoo[i] == NULL && input[1] == 2) {
          add(2, i);
          printf("wowow %d \n", &phoo[i] -> id);
          break;
        } else if (custt[i] == NULL && input[1] == 3) {
          add(3, i);
          printf("wowow %d \n", &custt[i] -> id);
          break;

}
 // else if (input[1] != 1 && input[1] != 2 && input[1] != 3) {
 //        printf("%d\n\n", input[1];
 //          printf("%s\n", "out of range");
 //          break;
 //        }
      }
    } else if (input[0] == 2) {
      //Delete
      printf("%s\n", "enter your choice ");
      printf("%s\n", "employee");
      printf("%s\n", "products");
      printf("%s\n", "customer");
      scanf(" %d", & input[1]);
      printf("%s\n", "enter the id that you want to remove");
      int search1;
      scanf(" %d", & search1);
      for (int i = 0; i < 100; i++) {
        if (empp[i] -> id == search1 && input[1] == 1) {
          empp[i] -> id = 0;
          // printf("hety in the empp is del\n");
          break;
        } else if (phoo[i] -> id == search1 && input[1] == 2) {
          // free(phoo[i]);
          phoo[i] -> id=0;
          break;
        } else if (custt[i] -> id == search1 && input[1] == 3) {
          // free(custt[i]);
          custt[i] -> id=0;
          break;
        }
      }
    } else if (input[0] == 3) {
      int search1;

      int iddd[10];
      //Update
      printf("%s\n", "enter your choice ");
      printf("%s\n", "employee");
      printf("%s\n", "products");
      printf("%s\n", "customer");
      scanf(" %d", & input[1]);
      printf("enter the table id");
      scanf(" %d", &search1);
      for (int i = 0; i < 100; i++) {
        if (empp[i] -> id == search1 && input[1] == 1) {
          printf("1- id\n2-fname \n3-lname \n4-pos \n5-gender \n6-salary \n7-year \n8-month \n9-day \n");
          scanf(" %d", &input[5]);
          printf("%s\n", "enter the  change");
          switch (input[5]) {
          case 1:
            scanf(" %i", & iddd[0]);
            empp[i] -> id =iddd[0];
            break;
          case 2:
            scanf(" %s", & empp[i] -> fname);
            break;
          case 3:
            scanf(" %s", & empp[i] -> lname);
            break;
          case 4:
            scanf(" %s", & empp[i] -> pos);
            break;
            scanf(" %d", & iddd[1]);
            empp[i] -> salary = iddd[1];
          case 5:
            scanf(" %s", & empp[i] -> gender);
            break;
          case 6:
            scanf(" %d", & iddd[2]);
            empp[i] -> year = iddd[2];
            break;
          case 7:
            scanf(" %d", & iddd[3]);
            empp[i] -> month = iddd[3];
            break;
          case 8:
            scanf(" %d", & iddd[4]);
            empp[i] -> day = iddd[4];
            break;
          case 9:
            scanf(" %s", & empp[i] -> address);
            break;
          default:
            printf("%s\n", "out of range");
          }
          break;
        } else if (phoo[i] -> id == search1 && input[1] == 2) {
          printf("1- id\n2-name \n3-brand \n4-color \n5-price \n6-count \n");
          scanf(" %d", &input[5]);
          printf("%s\n", "enter the  change");
          switch (input[5]) {
          case 1:
            scanf(" %i", & iddd[0]);
            phoo[i] -> id = iddd[0];
            break;
          case 2:
            scanf(" %s", & phoo[i] -> brand);
            break;
          case 3:
            scanf(" %s", & phoo[i] -> color);
            break;
          case 4:
            scanf(" %s", & phoo[i] -> name);
            break;
          case 5:
            scanf(" %d", & iddd[1]);
            phoo[i] -> price = iddd[1];
            break;
          case 6:
            scanf(" %d", & iddd[2]);
            phoo[i] -> count = iddd[2];
            break;
          default:
            printf("%s\n", "out of range");
          }
          break;
        } else if (custt[i] -> id == search1 && input[1] == 3) {
          printf("1- id\n2-fname \n3-phone_number \n4-year \n5-month \n6-day \n7-year \n8-email\n");
          scanf(" %d", &input[5]);
          printf("%s\n", "enter the  change");
          double phoneeee;
          switch (input[5]) {
          case 1:
            scanf(" %i", & iddd[0]);
            custt[i] -> id = iddd[0];
            break;
          case 2:
            scanf(" %s", & custt[i] -> name);
            break;
          case 3:
            scanf(" %lf", & phoneeee);
            custt[i] -> phone_number = phoneeee;
            break;
          case 4:
            scanf(" %d", & iddd[2]);
            custt[i] -> year = iddd[2];
            break;
          case 5:
            scanf(" %d\n", & iddd[3]);
            custt[i] -> month = iddd[3];
            break;
          case 6:
            scanf(" %d", & iddd[4]);
            custt[i] -> day = iddd[4];
            break;
          case 7:
            scanf(" %s", custt[i] -> year);
            break;
          default:
            printf("%s\n", "out of range");
          }
          break;
        }
      }
    } else if (input[0] == 4) {
      printf("%s\n", "enter your choice ");
      printf("%s\n", "employee");
      printf("%s\n", "products");
      printf("%s\n", "customer");
      scanf(" %d", & input[1]);
      // int o1 = delete();
      printf("%s\n", "enter the id that you want to remove");
      int search1;
      scanf(" %d", & search1);
      for (int i = 0; i < 100; i++) {
        if (empp[i] -> id == search1 && input[1] == 1) {
          printf(" %d %s %s %s %d %s %d-%d-%d %s \n", empp[i] -> id, empp[i] -> fname, empp[i] -> lname, empp[i] -> pos, empp[i] -> salary, empp[i] -> gender, empp[i] -> year, empp[i] -> month, empp[i] -> day, empp[i] -> address);
          break;
        
        } else if (phoo[i] -> id == search1 && input[1] == 2) {
          printf("%d %s %s %s %d %d \n", phoo[i] -> id, phoo[i] -> brand, phoo[i] -> color, phoo[i] -> name, phoo[i] -> price, phoo[i] -> count);
          break;
        } else if (custt[i] -> id == search1 && input[1] == 3) {
          printf("%d %s %lf %d-%d-%d %s \n", custt[i] -> id, custt[i] -> name, custt[i] -> phone_number, custt[i] -> year, custt[i] -> month, custt[i] -> day, custt[i] -> email);
          break;
        }
      }
    } else if (input[0] == 5) {
      printf("%s\n", "enter your choice ");
      printf("%s\n", "employee");
      printf("%s\n", "products");
      printf("%s\n", "customer");
      scanf(" %d", & input[1]);
      for (int i = 0; i < 100; i++) {
        if (input[1] == 1 && empp[i] != NULL) {
          printf(" %d %s %s %s %d %s %d-%d-%d %s \n", empp[i] -> id, empp[i] -> fname, empp[i] -> lname, empp[i] -> pos, empp[i] -> salary, empp[i] -> gender, empp[i] -> year, empp[i] -> month, empp[i] -> day, empp[i] -> address);
        } else if (input[1] == 2 && phoo[i] != NULL) {
          printf("%d %s %s %s %d %d \n", phoo[i] -> id, phoo[i] -> brand, phoo[i] -> color, phoo[i] -> name, phoo[i] -> price, phoo[i] -> count);
        } else if (input[1] == 3 && custt[i] != NULL) {
          printf("%d %s %lf %d-%d-%d %s \n", custt[i] -> id, custt[i] -> name, custt[i] -> phone_number, custt[i] -> year, custt[i] -> month, custt[i] -> day, custt[i] -> email);
        }
      }
    } else if (input[0] == 6) {

      pthread_t inc_x_thread;
      struct thread_args targs;
      targs.employees = *empp;
      targs.phonenumbers = *phoo;
      targs.customers = *custt;
      pthread_create(&inc_x_thread, NULL, &backup, (void *) &targs);
      // pthread_join(inc_x_thread, NULL);
      pthread_exit(NULL);
      exit(1);
    } else if (input[0] == 7) {
      //quit
      printf("%s\n", "quit");
      exit(1);
    } else {
      printf("%s\n", "out of range ");
    }
  }
}
