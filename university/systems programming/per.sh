#!/bin/bash
echo enter 1 to lock
echo enter 0 to unlock

read var

if [ $var -eq 1 ]
then
  chmod 000 employees.txt
  chmod 000 phones.txt
  chmod 000 customer.txt

else

  chmod 777 employees.txt
  chmod 777 phones.txt
  chmod 777 customer.txt
fi
