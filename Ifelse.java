class Ifelse
{
int tamil=40;
int english=50; 
int maths=50;
int science=35;
int ss=67;
int total=tamil+english+maths+science+ss;
public void madhu()
{
System.out.println(total);
    if(total>35)
    {
        System.out.println("your pass");
    }
    else
    {
        System.out.println("your fail");
    }   
    
}
public static void main(String[]args)
{
Ifelse m1=new Ifelse();
m1.madhu();
}
}
