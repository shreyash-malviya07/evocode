import java.util.Scanner;
class Calc{
    public static void main(String[] args){
      Scanner in=new Scanner (System.in);
      double a=in.nextDouble();
      char ch=in.next().charAt(0);
      double b=in.nextDouble();
        System.out.println(result(a,ch,b));
    }
    public static double result(double a1,char ch1,double b1){
         double res=0.0;
         if(ch1=='+')
         res=a1+b1;
         else if(ch1=='-')
         res=a1-b1;
         else if(ch1=='*')
         res=a1*b1;
         else if(ch1=='/')
         res=a1/b1;
         else 
         System.out.println("Invalid");
         
         return res;
    }
}