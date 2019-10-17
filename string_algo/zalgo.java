import java.util.*;
import java.io.*;
class zalgo
{
  void compare(int arr[],String st,String pattren)
  {
    for(int i=0;i<=pattren.length();i++)
    arr[i]=0;
    for(int i=pattren.length()+1;i<st.length();i++)
    {
      //System.out.println(st.charAt(i));
      int c=0;
      if(st.charAt(c)==st.charAt(i))
      {
        int j=i;
        c++;
        j++;
        while(st.charAt(c)==st.charAt(j))
        {
          j++;c++;
        }
      }
      arr[i]=c;
    }
    for(int i=0;i<st.length();i++)
    if(arr[i]==pattren.length())
    System.out.println(i-pattren.length());
  }
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  String st=sc.nextLine();
  String pattren=sc.nextLine();
  int arr[]=new int[pattren.length()+st.length()+1];
  String st1=pattren.concat("$");
  st1=st1.concat(st);
  zalgo a=new zalgo();
  a.compare(arr,st1,pattren);

  //System.out.println(st1);
}
}
