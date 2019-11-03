import java.util.*;
public class Knapsack{
  public static void creatematrix(int p[],int w[],int arr[][],int n,int c)
  {
    for(int j=0;j<n;j++)
    {
      for(int k=0;k<c;k++)
      {

        if(j==0||k==0)
   arr[j][k]=0;
   else if(w[j-1]<=k)
   arr[j][k]=Math.max(arr[j-1][k],arr[j-1][k-w[j-1]]+p[j-1]);

   else
   arr[j][k]=arr[j-1][k];
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size");
    int n=sc.nextInt();
    System.out.println("Enter profit array");
    int p[]=new int[n];
    for(int i=0;i<n;i++)
    p[i]=sc.nextInt();
    System.out.println("Enter weight array");
    int w[]=new int[n];
    for(int i=0;i<n;i++)
    w[i]=sc.nextInt();
    System.out.println("Enter capacity of bag ");
    int capacity=sc.nextInt();
    int arr[][]=new int[n+1][capacity+1];
    creatematrix(p,w,arr,n+1, capacity+1);
    int max=arr[n][capacity];
    System.out.println("Selected items");
    for(int i=n-1;i>0;i--)
    {

      // for(int j=0;j<capacity+1;j++)
      // {
      //   if(max<arr[i][j])
      //   max=arr[i][j];
      // }
      // System.out.println(max+"**");
       int v=1;
      for(int j=capacity;j>=0;j--)
      {
        if(max==arr[i][j])
        {
          v=0;

          break;
        }

      }
      if(v==1)
      {
      System.out.println(i+1);
      max=max-p[i-1];
    }
    }


  }
}
