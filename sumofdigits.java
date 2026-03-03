import java.util.scanner;
class sumofdigits
 {
  public static void main(String a[])
    {
     int sum=0;
     int i=1;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter any number: ");
     int n = sc.textint();
     do
     {
     sum=sum+i;
     i++;
     }
     while(i<=n);
     system.out.println("sum of digits" + sum);
    } 
  }