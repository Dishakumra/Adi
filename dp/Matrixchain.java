import java.util.*;
class Matrixchain{
  static int l=1;
  public static void printwithbracket(int ka[][],int i,int j)
  {

    if(i==j)
    {
      System.out.print("A"+l);
      l++;
      return;
    }
    System.out.print("(");

    printwithbracket(ka,i,ka[i][j]);
    printwithbracket(ka,ka[i][j]+1,j);
    System.out.print(")");
  }
  public static int cost(int arrays[][],int c[][],int total)
  {
    int d[]=new int[total+1];
for(int i=0;i<total;i++)
{
  d[i]=arrays[i+1][0];
}
d[total]=arrays[total][1];
    for(int i=1;i<=total;i++)
    {
      c[i][i]=0;

    }
    int ka[][]=new int[total+1][total+1];
    for(int l=0;l<total-1;l++)
    {
    for(int i=1;i<total-l;i++)
    {
     int j=i+1+l;
     int min=10000;
       for(int k=i;k<j;k++)
       {
         int ds=c[i][k]+c[k+1][j]+(d[i-1]*d[k]*d[j]);
         if(ds<min)
         {
           min=ds;
           ka[i][j]=k;

         }
       }
       c[i][j]=min;

    }
  }
  for(int i=1;i<=total;i++)
  {
    for(int j=1;j<=total;j++)
    {
      System.out.print(c[i][j]+" ");
    }
    System.out.println();
  }
  printwithbracket(ka,1,total);
  return c[1][total];
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of matriced");
    int total=sc.nextInt();
    int arrays[][]=new int[total+1][2];
    for(int h=1;h<=total;h++)
    {
    System.out.println("Enter the dimensions of a"+h);
    arrays[h][0]=sc.nextInt();
    arrays[h][1]=sc.nextInt();
    }
    int c[][]=new int[total+1][total+1];
    int op=cost(arrays,c,total);
    System.out.println("Minimum no of operation"+op);
  }
}
