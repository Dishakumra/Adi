import java.util.*;
public class Cuttingrod{
  public static void creatematrix(int arr[][],int piece[],int cost[],int n,int len)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<len;j++)
      {
        if(j==0)
        arr[i][j]=0;
        else if(i==0)
        {
          arr[i][j]=cost[i]*j;
        }
        else
        {
          if(j>=piece[i])
          {
            arr[i][j]=Math.max(arr[i-1][j],arr[i][j-piece[i]]+cost[i]);
          }
          else
          arr[i][j]=arr[i-1][j];
        }
        System.out.print(arr[i][j]+" ");
      }
      System.out.println("");
    }
  }
  public static void print(int arr[][],int piece[],int len,int n)
  {
    int i=n-1;
    int j=len-1;
    while(true)
    {
      if(i==0||j==0)
      {
        System.out.println(piece[i]);
      break;
    }
      else if(arr[i][j]==arr[i-1][j])
      {
        i=i-1;
        j=j;
      }
      else {
        System.out.println(piece[i]);

        if(j-piece[i]>=0)
        j=j-piece[i];
        else
        j=0;
      }
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter len of rod");
    int len=sc.nextInt();
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    System.out.println("lenght of pieces");
    int piece[]=new int[n];
    int cost[]=new int[n];
    for(int i=0;i<n;i++)
    piece[i]=sc.nextInt();
    System.out.println("Enter cost");
    for(int i=0;i<n;i++)
    cost[i]=sc.nextInt();
    int arr[][]=new int[n][len+1];
    creatematrix(arr,piece,cost,n,len+1);
    print(arr,piece,len+1,n);
  }
}
