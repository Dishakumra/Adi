import java.util.*;
public class Longestcommanseq{
  public static void creatematrix(String s1,String s2,int arr[][],int a,int b)
  {
    System.out.println(a);
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
        if(i==0||j==0)
        arr[i][j]=0;
        else if(s1.charAt(i-1)==s2.charAt(j-1))
        arr[i][j]=1+arr[i-1][j-1];
        else
        arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
      System.out.print(arr[i][j]);
      }
      System.out.println("");
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first string");
    String s1=sc.nextLine();
    System.out.println("Enter second string");
    String s2=sc.nextLine();
    int arr[][]=new int[s1.length()+1][s2.length()+1];
    creatematrix(s1,s2,arr,s1.length()+1,s2.length()+1);

  }
}
