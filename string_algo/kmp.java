import java.util.*;
import java.io.*;
class kmp
{
  void pi_arr(int arr[],String pattren)
  {
    int c=0;
    for(int i=0;i<pattren.length();i++)
    {
      if(i==0)
      {
        arr[0]=0;
      }
      else if(pattren.charAt(i)==pattren.charAt(c))
      {
        c++;
        arr[i]=c;
      }
      else
      {
        c=0;
        if(pattren.charAt(i)==pattren.charAt(c))

          c++;
          arr[i]=c;

      //  arr[i]=0;
      }

    }
  }
  int compare(int arr[],String pattren,String st)
  {
    int j=-1;
    for(int i=0;i<st.length()+1;i++)
    {
      if(j==pattren.length()-1)
      {
        return i-pattren.length();
      }
      else if(st.charAt(i)==pattren.charAt(j+1))
      {
        //i++;
        j++;
      }
      else
      {
        if(j!=-1)
        j=arr[j]-1;


      //  i++;
      }
    }
    return -1;
  }
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  String st=sc.nextLine();
  String pattren=sc.nextLine();
  int arr[]=new int[pattren.length()];
  kmp k=new kmp();
  k.pi_arr(arr,pattren);
  // for(int i=0;i<arr.length;i++)
  // System.out.println(arr[i]);
  int ind=k.compare(arr,pattren,st);
  System.out.println(ind);
}
}
