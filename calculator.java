import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="calculator" width=400 height=400>
</applet>*/
public class calculator extends Applet implements ActionListener
{
TextField tf;
Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,equ,clr;
String str;
String msg="";
int a,b,res;
public void init()
{
setLayout(null);
tf=new TextField();
b0=new Button("0");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
add=new Button("+");
sub=new Button("-");
mul=new Button("*");
div=new Button("/");
equ=new Button("=");
clr=new Button("c");
add(tf);
add(b0);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(add);
add(sub);
add(mul);
add(div);
add(equ);
add(clr);
tf.setBounds(50,50,200,30);
b0.setBounds(50,100,40,40);
b1.setBounds(100,100,40,40);
b2.setBounds(150,100,40,40);
b3.setBounds(50,150,40,40);
b4.setBounds(100,150,40,40);
b5.setBounds(150,150,40,40);
b6.setBounds(50,200,40,40);
b7.setBounds(100,200,40,40);
b8.setBounds(150,200,40,40);
b9.setBounds(50,250,40,40);
add.setBounds(50,300,30,30);
sub.setBounds(90,300,30,30);
mul.setBounds(130,300,30,30);
div.setBounds(170,300,30,30);
equ.setBounds(100,250,40,40);
clr.setBounds(150,250,40,40);
tf.addActionListener(this);
b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
equ.addActionListener(this);
clr.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
{
String s1=tf.getText();
a=Integer.parseInt(s1);
str=s;
msg="";
tf.setText(msg);
}
else if(s.equals("="))
{
String s2=tf.getText();
b=Integer.parseInt(s2);
int res=0;
if(str=="+")
{
res=a+b;
}
else if(str=="-")
{
res=a-b;
}
else if(str=="*")
{
res=a*b;
}
else if(str=="/")
{
res=a/b;
}
String s3=String.valueOf(res);
tf.setText(s3);
msg="";
}
else if(s=="c")
{
msg="";
tf.setText(msg);
}
else{
msg=msg+s;
tf.setText(msg);
}
}
}

