clc;clear
a = magic(4);
b=a;
a(:,:) = 2* pi;
a
b = triu(b);
b = tril(b);
b(1,1) = 2*pi;
b(2,2) = 2*pi;
b(3,3) = 2*pi;
b(4,4) = 2*pi;
b