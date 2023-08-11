clc;clear
syms a b c d
eqns = [a+(2*b)-(5*c)+(7*d) == 10,-2*a+-2*c+3*d+1 == 20, -3*d+12*c+17==0,4*b+a*4-b+1.5*a==16];
[e,f] = equationsToMatrix(eqns)
vars = symvar(eqns)
g = inv(e)
diag(g)
clear
syms a b c d
eqns = [(11*a)+(6*b)-(24*c)+(38*d) == 34,-2*a+-2*c+3*d+1 == 20, -3*d+12*c+17==0,4*b+a*4-b+1.5*a==16];
[e,f] = equationsToMatrix(eqns)
vars = symvar(eqns)
g = inv(e)
diag(g)
