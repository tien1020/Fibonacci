import java.math.BigInteger;
public class Fibonacci
{
   public void fibonacci(int n)
   {  
   
      BigInteger a1 = new BigInteger("0");
      BigInteger a2 = new BigInteger("1");
      
      for(int i=1; i<n;++i)
      {                 
         BigInteger sum=a1.add(a2);
         a1=a2;
         a2=sum;
      }
         System.out.println(a2);

   }
}