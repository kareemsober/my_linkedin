clc;clear
%here are the equations
t=linspace (0, 2.5, 50);
P1=(20.*t);
P2=((3*t.^2)+(25*t)-(2));
P3=((t.^2)-(1)-(25));
%plotting theme
plot (t, P1);
hold on
grid on
plot (t, P2)
plot (t, P3)
%labeling theme
xlabel('Time');
ylabel('Position');
legend ('Train 1','Train 2', 'Train 3') 
title('Position vs Time')   