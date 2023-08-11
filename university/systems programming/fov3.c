#include <stdio.h>

#include <stdlib.h>

#include <sys/file.h>

#include <string.h>

#include <fcntl.h>

#include <errno.h>

#include <sys/types.h>

#include <unistd.h>

int main() {
  system("ls");
        int input[100];
        printf("%s\n", "i only made 1 and 3 and they are not 100% complete but/n i would love to hear your thought about it so i can countinue or redo things ");
        do {
                printf("1-process testing\n");
                printf("2-memory testing\n");
                printf("3-input/output testing\n");
                printf("4-quit\n");
                printf("%s\n", "make a choice");
                scanf("%d\n", & input[0]);
                if (input[0] == 1) {
                        pid_t process;
                        process = fork();
                        printf("%s\n", " a process has been created ");
                        printf("this the process id %d\n", (int) getpid());

                } else if (input[0] == 2) {
                        /* code */
                } else if (input[0] == 3) {
                        char file[500];
                        printf("%s\n", "open a file");
                        printf("%s\n", "create a file ");
                        printf("%s\n", "search ");

                        scanf("%i\n", & input[1]);
                        if (input[1] == 1) {
                                system("ls");
                                printf("%s\n", "input file name");
                                scanf("%s\n", file);
                                int filr_o = open(file, O_RDWR, 7);
                                printf("%c\n", filr_o);
                        } else if (input[1] == 2) {
                                char cfile[500];
                                printf("%s\n", "write the file name to be created ");
                                scanf("%s\n", cfile);
                                int output_fd = open(cfile, O_RDWR | O_CREAT, 0644);
                                printf("%s\n", "is there any thing you would like to add?? /n if us then write 1 if not write 2");
                        } else if (input[1] == 3) {
                                system("ls -l");
                                printf("%s\n", "thats the files in the current folder");
                                printf("%s\n", "enter what you want to search for in the curretn folder");
                                char innn[200];
                                scanf("%c\n", innn);
                                char innnn[400] = "grep -r ";
                                strncat(innnn, "\"", 200);
                                strncat(innnn, innn, 200);
                                strncat(innnn, "\"", 200);
                                system(innnn);

                        }


                        // if (input[3] == 1) {
                        //         char cfile[500];
                        //         printf("%s\n", "write the file name to be created ");
                        //         scanf("%s\n", cfile);
                        //         int output_fd = open(cfile, O_RDWR | O_CREAT, 0644);
                        //         char in [2000];
                        //         scanf("%c\n", in );
                        //         ssize_t writee = write(output_fd, in , 2000);
                        // } else if (input[3] == 2) {
                        //         break;
                        // }

                } else if (input[0] == 4) {
                        exit(1);

                } else {
                        printf("%s\n", "make a choice acrording to the list");
                }

        } while (1);
        return 0;
}
