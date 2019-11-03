import java.util.*;
public class Subsetsum{
  public static void creatematrix(int set[],int arr[][],int a,int b)
  {
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
        if(j==0)
        arr[i][j]=1;
        else if(i==0)
        {

          if(set[i]==j)
          arr[i][j]=1;
          else
          arr[i][j]=0;
        }
        else
        {
          //System.out.print(" "+set[i]+" "+j);
          if(j<set[i])
          arr[i][j]=arr[i-1][j];
          else if(j==set[i])
          arr[i][j]=1;
          else
          {
            //
            arr[i][j]=Math.max(arr[i-1][j-set[i]],arr[i-1][j]);
          }
        }


      }

    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter sum");
    int sum=sc.nextInt();
    System.out.println("Enter set size");
    int n=sc.nextInt();
    System.out.println("Enter set");
    int set[]=new int[n];
    for(int i=0;i<n;i++)
    set[i]=sc.nextInt();
    int arr[][]=new int[n][sum+1];
    creatematrix(set,arr,n,sum+1);
    int d=sum;
    for(int i=n-1;i>0;i--)
    {
      if(arr[i][d]==1&&arr[i-1][d]!=1)
      {
      System.out.print(set[i]+" ");
      d=d-set[i];
    }

    }



  }
}
