class RecursionDemo
{
static int Sumof(int n)
{
if(n==1)
return 1;
}
else
{
return n+Sumof(n-1);
}
public static void main(String[]args)
{
int number=10;
int result=Sumof(number);
System.out.println("Sumof first"+number+"Natural Number is"+result);
}
}