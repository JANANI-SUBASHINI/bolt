# bolt
import java.io.*;
import java.util.*;
public class Prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    int s1,s2,flag=0;
    int count=0;
    System.out.println("Enter the range");
    s1=sc.nextInt();
    s2=sc.nextInt();
    System.out.println("The prime numbers of given range");
    for(int i=s1; i<=s2; i++)
    {
      for(int j=2; j<i;j++)
      {
        
        if(i%j==0)
        {
          flag=0;        
          
          break;
        }
        else
        {
          
          flag=1;
        }
        
      }
      
      if(flag==1)
      {
        
        count++;
        
      }
    }
    System.out.println(count);
  }
}
