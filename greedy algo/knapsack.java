import java.util.*;
class knapsack
{
  public static void swap(float arr[],int i,int j)
  {
    float temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

  }
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  float w[]=new float[size];
  float p[]=new float[size];
  float pw[]=new float [size];
  for(int i=0;i<size;i++)
  w[i]=sc.nextFloat();
  for(int i=0;i<size;i++)
  p[i]=sc.nextFloat();
  float capacity=sc.nextFloat();

  for(int i=0;i<size;i++)
  pw[i]=p[i]/w[i];
   for(int j=0;j<size;j++)
   {
  for(int i=0;i<size-1;i++)
  {
    if(pw[i]<pw[i+1])
    {
      swap(pw,i,i+1);
      swap(p,i,i+1);
      swap(w,i,i+1);
    }
  }
}
  float currentp=0;
  for(int i=0;i<size;i++)
  {
  if(capacity==0)
  break;
  else if(capacity>=w[i])
  {
    currentp+=pw[i]*w[i];
    //  System.out.println(pw[i]);
    capacity-=w[i];
  }
  else
  {
    currentp+=pw[i]*capacity;
    //System.out.println(pw[i]);

    capacity=0;
  }
}
System.out.println(currentp);
}
}
