class Else
{
int maths=40;
int science=50;
public void madhu()
{
    if(maths>science)
    {
        System.out.println(maths);
    }
    else if(maths<science)
    {
        System.out.println(science);
    } 
    else
    {
        System.out.println("both are equal");  
    }   
}
public static void main(String[]args)
{
Else m1=new Else();
m1.madhu();
}
}
