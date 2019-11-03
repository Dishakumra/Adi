import java.util.*;
public class Editdist{
  public static void creatematrix(String s1,String s2,int arr[][],int a,int b)
  {
    for(int i=0;i<a;i++)
    {
      for(int j=0;j<b;j++)
      {
        if(i==0)
 arr[i][j]=j;
 else if(j==0)
 arr[i][j]=i;
        else if(s1.charAt(i-1)==s2.charAt(j-1))
        {
          
        arr[i][j]=arr[i-1][j-1];
      }
        else
        {
          arr[i][j]=Math.min(arr[i-1][j],Math.min(arr[i][j-1],arr[i-1][j-1]))+1;


        }

      }

    }
    System.out.println(arr[a-1][b-1]);
  }
  public static void printActualEdits(int T[][], char[] str1, char[] str2) {
    int i = T.length - 1;
    int j = T[0].length - 1;
    while(true) {
        if (i == 0 || j == 0) {
            break;
        }
        if (str1[i-1] == str2[j-1]) {
            i = i-1;
            j = j-1;
        } else if (T[i][j] == T[i-1][j-1] + 1){
            System.out.println("Edit " + str2[j-1] + " in string2 to " + str1[i-1] + " in string1");
            i = i-1;
            j = j-1;
        } else if (T[i][j] == T[i-1][j] + 1) {
            System.out.println("Delete in string1 " + str1[i-1]);
            i = i-1;
        } else if (T[i][j] == T[i][j-1] + 1){
            System.out.println("Delete in string2 " + str2[j-1]);
            j = j -1;
        } else {
            throw new IllegalArgumentException("Some wrong with given data");
        }

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
    printActualEdits(arr,s1.toCharArray(),s2.toCharArray());
  }
}
