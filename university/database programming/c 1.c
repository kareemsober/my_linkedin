#include<stdio.h>
#include <stdlib.h>
int main() {
  int counter = 0;
  struct resturant {
    int id ;
    char city[100];
    char street[100];
    int building_number;
    char name[100];
    int restaurant_id;
  };

  struct resturant *array[100];
  do {

  int inputt[5];
  printf("%c\n", "please make th choice of 2");
  printf("1-Restaurant\n");
  printf("2-Branch\n");
  printf("3-Branch_phone\n");
  printf("4-Branch-customer\n");
  printf("5-Staff\n");
  printf("6-Staff_phone\n");
  printf("7-Customer\n");
  printf("8-Customer_phone\n");
  printf("9-Item\n");
  printf("10-Item_order\n");
  printf("11-Order_table\n");
  printf("12-quit\n");
  printf("enter your selsction\n");
  // printf("\n\n\n\n\n");
  scanf("%i\n", &inputt[0]);
  //the inputt will be reresanted latter on
  printf("1-insert\n");
  printf("2-update\n");
  printf("3-view\n");
  printf("4-delete\n");
  scanf("%d\n", &inputt[1]);
  printf("%d\n", inputt[1]);
  if (inputt[1] == 1) {
    printf("%d\n", counter);
    printf("this is the add order id, city, street, building number, name, restaurant_id\n");
    scanf("%d\n", &array[counter]->id);
    scanf("%d\n", &array[counter]->building_number);
    scanf("%d\n", &array[counter]->restaurant_id);
    scanf("%c\n", array[counter]->city);
    scanf("%c\n", array[counter]->street);
    scanf("%c\n", array[counter]->name);
    counter++;
  }
  else if (inputt[1] == 2) {
    int count= 0;
    printf("%c\n", "1imput the indext number");
    scanf("%d\n", &count);
    printf("this is the add order id, number, price, quantity)\n");
    scanf("%d\n", &array[count]->id);
    scanf("%d\n", &array[count]->building_number);
    scanf("%d\n", &array[count]->restaurant_id);
    scanf("%c\n", array[count]->city);
    scanf("%c\n", array[count]->street);
    scanf("%c\n", array[count]->name);
  }
  else if (inputt[1] == 3) {
    int count= 0;
    printf("%c\n", "2imput the indext number");
    scanf("%d\n", &count);
    printf("building number %d restaurant_id %d city %c street %c name %c \n", array[count]->building_number, array[count]->restaurant_id, *array[count]->city, *array[count]->street, *array[count]->name);
    // printf("this is the add order id, city, street, building number, name, restaurant_id\n");
  }
  else if (inputt[1] == 4) {
    int count= 0;
    printf("%c\n", "3imput the indext number");
    scanf("%d\n", &count);
    free (array[count]);
    // printf("this is the add order id, first name, middle name, last name,  street, city, building number, email, restaurant_id\n");
  }
  else{
    break;
}
} while(1);
  // printf("\n\n\n\n\n");
  // printf("\n\n\n\n\n");
  // printf("\n\n\n\n\n");
  // printf("\n\n\n\n\n");
  printf("\n\n\n\n\n");
  printf("select what to update or write all: id, first name, middle name, last name,  street, city, building number, email, restaurant_id\n");
  return 0;
}
