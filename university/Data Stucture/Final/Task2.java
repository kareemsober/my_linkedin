import java.io.*;
import java.util.*;
class Stack {
    static final int MAX = 500;
    int top;
    char array[] = new char[MAX];
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
 
    boolean push(char x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack is Full.");
            return false;
        }
        else {
            array[++top] = x;
            return true;
        }
    }
 
    char pop()
    {
        if (top < 0) {
            System.out.println("Stack is Empty.");
            return 0;
        }
        else {
            char x = array[top--];
            return x;
        }
    }
    
    char peek()
    {
        if (top < 0) {
            System.out.println("Stack is Empty.");
            return 0;
        }
        else {
            char x = array[top];
            return x;
        }
    }
}
public class Task2 {
    
    static int precedence(char ch) 
    { 
        if(ch == '+' || ch == '-')
            return 1;
        else if(ch == '*' || ch == '/')
            return 2;
        else if(ch == '^')
            return 3; 
        return -1; 
    } 
    
    static String RPN(String expression) 
    {
        String notation = "";
        Stack st = new Stack();
          
        for (int i = 0; i<expression.length(); i++) 
        { 
            char c = expression.charAt(i);
            if (Character.isLetter(c)) 
                notation += c;
            else if (c == '(') 
                st.push(c);
            else if (c == ')') 
            { 
                while (!st.isEmpty() && st.peek() != '(') 
                    notation += st.pop();  
                st.pop(); 
            } 
            else
            { 
                while (!st.isEmpty() && precedence(c)<= precedence(st.peek()))
                {
                    notation += st.pop(); 
                } 
                st.push(c); 
            } 
       
        }
        while (!st.isEmpty())
        { 
            notation += st.pop(); 
        } 
        return notation; 
    } 
    
    public static void main(String[] args) {
        System.out.println("This program converts mathematical expressions to RPN form (Reverse Polish Notation).");
        System.out.println("The number of expressions should not exceed 100 expressions.");
        System.out.println("The length of each expression must be less than or equal to 400.");
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of expressions to convert to RPN form.");
        int eno = in.nextInt();
        for(int i=0;i<eno;i++)
        {
            System.out.println("Please enter the expression number " + (i + 1) + ":");
            String exp = in.next();
            System.out.println("The expression number " + (i + 1) + " in reverse polish notation is:");
            System.out.println(RPN(exp));
        }
    }
}
