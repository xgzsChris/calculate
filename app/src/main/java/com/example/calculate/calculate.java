package com.example.calculate;

import android.util.Log;

import java.util.Stack;
import java.util.regex.Pattern;

public class calculate {
    private String expression,operator;
    private double num1,num2;
    public calculate(String expression)
    {
        this.expression=expression;
    }
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
    public static StringBuffer singleEval(String str)
    {
        Stack<String> stack=new Stack<String>();
        StringBuffer postfix=new StringBuffer(str.length()*2);
        int i=0;
        while(i<str.length())
        {
            char ch=str.charAt(i);
            switch(ch)
            {
                case'+': case'-':
                    while(!stack.isEmpty()&&!stack.peek().equals("("))
                        postfix.append(stack.pop());
                    stack.push(ch+" ");
                    i++;
                    break;
                case'*': case'/':
                    while (!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/")))
                        postfix.append(stack.pop());
                    stack.push(ch+" ");
                    i++;
                    break;
                default:
                    while(i<str.length()&&ch>= '0'&&ch<='9'||ch=='.')
                    {
                        postfix.append(ch);
                        i++;
                        if(i<str.length())
                            ch=str.charAt(i);
                    }
                    postfix.append(" ");
            }
        }
        while(!stack.isEmpty())
            postfix.append(stack.pop());
        Log.i("after",String.valueOf(postfix));
        return  postfix;
    }
    public static String toValue(StringBuffer postfix)
    {
        Stack<Double> stack =new Stack<Double>();
        double value=0;
        for(int i=0;i<postfix.length();i++)
        {
            char ch=postfix.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                String s="";
                value=0;
                while(ch!=' ')
                {
                    s=s+ch;
                    //value=value*10+ch-'0';
                    ch=postfix.charAt(++i);
                }
                value = Double.parseDouble(s);
                Log.i("num",String.valueOf(value));
                stack.push(value);
            }
            else if(ch!=' ')
            {
                double y= stack.pop(),x=stack.pop();
                switch(ch)
                {
                    case'+':value=x+y;break;
                    case'-':value=x-y;break;
                    case'*':value=x*y;break;
                    case'/':value=x/y;break;
                }
                stack.push(value);
            }
        }
        return String.valueOf(stack.pop());
    }
}