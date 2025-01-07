import java.util.*;
class Divide{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int a=0,b=0;
try{
a=sc.nextInt();
b=sc.nextInt();
double c=a/b;
System.out.println("Divide Is = "+c);
}
catch(InputMismatchException px){
System.out.println("Please Enter Right Input...");
System.exit(0);
}
catch(ArithmeticException ex){
System.out.println("Denominator Should Not be...");
}

int sum=a+b;
System.out.println("Sum Is = "+sum);

}
}