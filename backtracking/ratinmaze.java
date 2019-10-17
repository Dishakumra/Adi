import java.util.*;
import java.io.*;
class ratinmaze
{
  int findpath(int arr[][],int k,int l,int len)
  {
    if(arr[k][l]!=0)
    {
          if(k==len-1&&l==len-1)
            {
               System.out.print(k);
                System.out.print(l+"\n");
                 return 1;
           }
    if(k+1<len)
    {
    int g=findpath(arr,k+1,l,len);
    if(g==1)
    {
    System.out.print(k);
    System.out.print(l+"\n");
    return 1;
    }
    else return 0;
  }
    else
    {
      if(l+1<len)
      {
       int f=findpath(arr,k,l+1,len);
      if(f==1)
      {
      System.out.print(k);
      System.out.print(l+"\n");

      return 1;
       }
       else return 0;
     }
     else return 0;
    }


  }

    else
    return 0;
  }
  public static void main(String args[])
  {

    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int arr[][]=new int[l][l];
    for(int i=0;i<l;i++)
    for(int j=0;j<l;j++)
    arr[i][j]=sc.nextInt();
    ratinmaze rat=new ratinmaze();
    int g=rat.findpath(arr,0,0,l);
    if(g==0)
    System.out.println("no path exist");
  }
}
