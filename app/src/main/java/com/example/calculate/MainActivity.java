package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0=(Button)findViewById(R.id.button0);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button button5=(Button)findViewById(R.id.button5);
        Button button6=(Button)findViewById(R.id.button6);
        Button button7=(Button)findViewById(R.id.button7);
        Button button8=(Button)findViewById(R.id.button8);
        Button button9=(Button)findViewById(R.id.button9);
        Button buttonadd=(Button)findViewById(R.id.buttonadd);
        Button buttonsub=(Button)findViewById(R.id.buttonsub);
        Button buttonmul=(Button)findViewById(R.id.buttonmul);
        Button buttondiv=(Button)findViewById(R.id.buttondiv);
        Button buttondot=(Button)findViewById(R.id.buttondot);
        Button buttoneql=(Button)findViewById(R.id.buttoneql);
        Button buttonsqu=(Button)findViewById(R.id.buttonsqu);
        Button buttoncle=(Button)findViewById(R.id.buttoncle);
        Button buttondel=(Button)findViewById(R.id.buttondel);
        final TextView textView = findViewById(R.id.text);
        final boolean pointnum;
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText()!="0")
                    textView.setText(textView.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="1";
                textView.append(msg);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="2";
                textView.append(msg);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="3";
                textView.append(msg);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="4";
                textView.append(msg);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="5";
                textView.append(msg);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="6";
                textView.append(msg);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="7";
                textView.append(msg);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="8";
                textView.append(msg);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                msg="9";
                textView.append(msg);
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView.getText().toString();
                String s;
                String s2;
                if(text.length()>0) {
                    s2 = text.substring(0, text.length() - 1);
                    s = text.substring(text.length() - 1, text.length());
                }
                else {
                    s2 = "";
                    s = "";
                }
                if(text.length()==0)
                {
                    textView.setText("");
                }
                else {
                    if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
                        textView.setText(s2 + "+");
                    else
                        textView.append("+");
                }
               // pointnum=0;
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView.getText().toString();
                String s;
                String s2;
                if(text.length()>0) {
                    s2 = text.substring(0, text.length() - 1);
                    s = text.substring(text.length() - 1, text.length());
                }
                else {
                    s2 = "";
                    s = "";
                }
                if(text.length()==0)
                {
                    textView.setText("");
                }
                else {
                    if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
                        textView.setText(s2 + "-");
                    else
                        textView.append("-");
                }
               // pointnum=0;
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView.getText().toString();
                String s;
                String s2;
                if(text.length()>0) {
                    s2 = text.substring(0, text.length() - 1);
                    s = text.substring(text.length() - 1, text.length());
                }
                else {
                    s2 = "";
                    s = "";
                }
                if(text.length()==0)
                {
                    textView.setText("");
                }
                else {
                    if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
                        textView.setText(s2 + "*");
                    else
                        textView.append("*");
                }
               // pointnum=0;
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView.getText().toString();
                String s;
                String s2;
                if(text.length()>0) {
                    s2 = text.substring(0, text.length() - 1);
                    s = text.substring(text.length() - 1, text.length());
                }
                else {
                    s2 = "";
                    s = "";
                }
                if(text.length()==0)
                {
                    textView.setText("");
                }
                else {
                    if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
                        textView.setText(s2 + "/");
                    else
                        textView.append("/");
                }
               // pointnum=0;
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=textView.getText().toString();
                String s=text.substring(0,text.length());
                boolean pointnum=false;
                if(text.length()==0)
                {
                    textView.setText("");
                }
                else {
                    for (int i = 0; i < s.length(); i++) {
                        char ch = s.charAt(i);
                        if (ch == '.') {
                            pointnum = true;
                        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                            pointnum = false;
                        }
                    }
                    if (pointnum == false)
                        textView.setText(textView.getText() + ".");
                    // pointnum==1;
                    //}
                }
            }
        });
        buttonsqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=textView.getText().toString();
                calculate c=new calculate(str);
                if(c.isNumeric(str)==true)
                {
                    textView.setText(String.valueOf(sqrt(Double.parseDouble(str))));
                }
                else {
                    Toast.makeText(MainActivity.this,"错误，无法计算",Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttoncle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(null);
            }
        });
        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                if(!textView.getText().toString().isEmpty())
                {
                    text = textView.getText().toString();
                    text=text.substring(0,text.length()-1);
                    textView.setText(text);
                }
            }
        });
        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=textView.getText().toString();
                calculate c=new calculate(str);
                StringBuffer postfix=c.singleEval(str);
                textView.setText(c.toValue(postfix));
            }
        });
    }
}
