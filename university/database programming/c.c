#include<stdio.h>
int main() {
  do {

  int inputt[5];
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
  if (inputt[1] == 1) {

    printf("this is the add order id, city, street, building number, name, restaurant_id\n");
  }
  if (inputt[1] == 2) {
    printf("this is the add order id, number, price, quantity)\n");

  }
  if (inputt[1] == 3) {
    printf("this is the add order id, city, street, building number, name, restaurant_id\n");

  }
  if (inputt[1] == 4) {
    printf("this is the add order id, first name, middle name, last name,  street, city, building number, email, restaurant_id\n");

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
