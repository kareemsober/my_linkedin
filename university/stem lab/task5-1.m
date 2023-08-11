clc;clear
%task 5-a
number=0;
count = 0;
list=[2021001 ,2021002 ,2021003 ,2021004 ,2021005 ,2021006 ,2021007 ,2021008 ,2021009;40, 50 ,67 ,64 ,66 ,90 ,34 ,37 ,79;30 ,36 ,77 ,55 ,65 ,66 ,74 ,72 ,95;77 ,55 ,15 ,55 ,45 ,90 ,88 ,95 ,85 ];
list1 = list;
list(2,3)
%used for loop to go through the list and if to pick the ones that are required then
% reapted the by comping and pesting the for

for i =1:length(list)
  if list(2,i)>= number
    number = list(2,i);
    count = i;
    end
endfor
printf("\nthe highest student in math is ")
list(1,count)
printf("\nand his score is ")

list(2,count)
for i =1:length(list)
  if list(3,i)>= number
    number = list(3,i);
    count = i;
    end
endfor
printf("\nthe highest student in math is ")
list(1,count)
printf("\nand his score is ")

list(3,count)

for i =1:length(list)
  if list(4,i)>= number
    number = list(4,i);
    count = i;
    end
endfor
printf("\nthe highest student in math is ")
list(1,count)
printf("\nand his score is ")
list(4,count)

%task 5 - b   the same as i did before but changed the logic and the elements 

for i =1:length(list)
  for k = 2:4
    if list(k,i)<=50
      list(k,i)=list(k,i) +5;
      endif
    
  endfor
endfor

list
%task 5 -c  
printf("the students who have even scores are\n")
for z = 1:length(list)
  if mod(list1(3,z),2) == 0
    list(1,z)
    endif
  
endfor
%task 5-d
for q =1:length(list1)
  if list1(4,q)>=50
    printf("\nstudent %d  pass  %d \n", list1(1,q), list1(4,q))
  
  elseif list1(4,q)<=50
    printf("\nstudent %d  fail  %d \n", list1(1,q), list1(4,q))
    end
    
endfor