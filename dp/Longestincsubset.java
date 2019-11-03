import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class Longestincsubset{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enyer size");
    int n=sc.nextInt();
    System.out.println("Enter array");
    int arr[]=new int[n];
    Integer t[]=new Integer[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    t[i]=1;
  }
  for(int i=1;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(arr[j]<arr[i])
      t[i]=Math.max(t[i],t[j]+1);
    }
  }
  int max = Collections.max(Arrays.asList(t));
  System.out.println(max);


  }
}
