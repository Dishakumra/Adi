import java.util.*;
import java.io.*;
class permutation
{
  public void perm(String str,int l,int r)
  {

    if (l == r)
          System.out.println(str);
      else
      {
          for (int i = l; i <= r; i++)
          {
              str = swap(str,l,i);
              perm(str, l+1, r);
              str = swap(str,l,i);
          }
      }
  }
  public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    String ar;
    permutation p=new permutation();
    p.perm(st,0,st.length()-1);
  }
}
