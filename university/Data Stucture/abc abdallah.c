#include<stdio.h>
#include<foc_fa21.h>
void print_map(){
int a[200][400]
for(int i = 0 ; i <=400;i++){
  for(int x = 0 ; x>= 200; x++){
    if(x>){}
}

}
showArray(200,400,a)
}
   int print_menu()
   {
    int choice;

  printf("Welcome to Queen Alia International Airport\n");
  printf("1. Passenger\n");
  printf("2. Employee\n");
  printf("3. Quit\n");
  printf("Select choice>: ");
  scanf("%d",&choice);
    return choice;
   }
int main()
{
  print_map
 int choice,choiceE;
     char sentence[1000];
     FILE *amtxt;
     FILE *eurtxt;
char pass[100];

 do
 {
     choice=print_menu();
  switch (choice)
  {
    case  1: printf("Passenger Menu\n");
    printf("1. America \n2. Europe\n3. Africa \n4. Back\n");
int choice2,visaN,schengen;
char name[100];
scanf("%d",&choice2);
switch(choice2){


    case 1:printf("please enter your First name:\n");
            amtxt = fopen("America.txt", "w");
                    fgets(name, sizeof(name), stdin);

    scanf("%s",&name);
    fprintf(amtxt, "%s", name);
    printf("please enter your Visa Number:\n");
    scanf("%d",&visaN);


    if (visaN>12299 && visaN<12400){
                if (visaN>12349 && visaN<12381){
                                printf("Please move to counter number Four\n");
                                        fgets(sentence, sizeof(sentence), stdin);
            sprintf(sentence, "%d", visaN);
    fprintf(amtxt, "%s", sentence);

} else printf("Sorry! your visa needs to be validated please check that with the USA Embassy\n");
    fclose(amtxt);
            break;
    }
    printf("Invalid Visa Number\n");
            fclose(amtxt);

    break;

    case 2:printf("Please enter your Schengen number:\n");
                eurtxt = fopen("Europe.txt", "w");
    scanf("%d",&schengen);
            fgets(sentence, sizeof(sentence), stdin);
            sprintf(sentence, "%d", schengen);

    fprintf(eurtxt, "%s", sentence);
        fclose(eurtxt);
    if(schengen<9){
        printf("Invalid Schengen Number\n");
        break;
    }else if(schengen>9 && schengen <100){
        printf("Germany, Window 10\n");
        break;
    }else if(schengen>99 && schengen <1000){
        printf("Italy, Window 11\n");
        break;
    }else if(schengen>999 && schengen <10000){
        printf("Spain, Window 12\n");
        break;
    }else if(schengen>9999){
        printf("Greece, Window 13\n");
        break;
    }
        break;
    case 3:printf("Africa Menu\n");
        break;
    case 4:printf("Going Back\n");
        break;
        default:printf("Invalid input");
        break;
}
           break;
    case  2: printf("Enter Passowrd:");
        scanf("%s",&pass);
        if( strcmp(pass,"admin") == 0){
            printf("\n1. get statistics\n2. check name\n3. back\n select a choice\n");
                    scanf("%d",&choiceE);

        }else {printf("Wrong password, going back\n");
        break;}

           break;
    case  3: printf("Goodbye\n");
    exit(0);
           break;
    default: printf("Invalid input!\n");
           break;
  }
 } while (choice != 3);
 return 0;
}
