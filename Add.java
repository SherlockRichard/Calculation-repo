import javax.swing.*;
import java.awt.*;
public class Add{
 public static void AddNumbers(){
 int a=3;
 int b=4;
 int c=0;
  c=a+b;
 System.out.println("The answer is =" + c);
}
public static void Minus(){
 int a=5;
 int b=2;
 int c=0;
 c=a-b;
System.out.println("The answer is" + c);
}
public static void Multiple(){
 int a=5;
 int b=2;
 int c=0;
 c=a*b;
System.out.println("The answer is" + c);
}


public static void main(String[]args){
 String s;
 int n;
s = JOptionPane.showInputDialog("Please Choice"+"\n1.Plus"+"\n2.Minus"+"\n3.Multiple");
n = Integer.parseInt(s);
if(n==1){
 AddNumbers();
}
else if(n==2){
 Minus();
}
else if(n==3){
Multiple();
}
else{
 System.out.println("Please try again");

}
 
}
}