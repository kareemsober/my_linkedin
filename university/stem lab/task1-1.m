clc;clear
d=2;
L=3.8;
%task1-a
td(1)=atand(d/L);
td(2)=atand(2*d/L);
tr(1)=atan(d/L);
tr(2)=atan(2*d/L);
fprintf('\ntheta1=%0.2f degree theta2=%0.2f degree',td(1),td(2))
fprintf('\ntheta1=%0.2f rad theta2=%0.2f rad',tr(1),tr(2))
for i=1:2
if td(i)>40 && td(i) <50
td=td(i);
tr=tr(i);
endif
endfor
fprintf('\nThe optimum angle is=%0.2f degree %0.2f rad',td,tr)
%task1-b
fprintf('\n1b')
tdsin=sind(td)
tdcos=cosd(td)
tdsec=secd(td)
tdcosec=cscd(td)
%task 1-c
fprintf('\n1c')
trsin=sin(tr)
trcos=cos(tr)
trsec=sec(tr)
trcosec=csc(tr)
%task1-d
fprintf('\n1d')
T=[tdsin tdcos tdsec tdcosec;trsin trcos trsec trcosec]'
%%1e
fprintf('\nDeterminat of matrix')
%this for a
A3=magic(4)
%this is for b
A2=A3*0+2*pi
%this is for c
for i=1:4
  for j=1:4
    if i~=j
      A2(i,j)=0;
      endif
  endfor

endfor
A1=A2