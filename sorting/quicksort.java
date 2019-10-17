import java.io.*;
import java.util.*;
class quicksort
{
;

  void quicksorting(int arr[],int l,int h)
  {
    if(l<h)
    {
    int p=partition(arr,l,h);
    quicksorting(arr,l,p-1);
    quicksorting(arr,p+1,h);
  }
  }
  int partition(int arr[],int l,int h)
  {
    int pivot = arr[h];
    int i = (l-1); // index of smaller element
    for (int j=l; j<h; j++)
    {
        // If current element is smaller than the pivot
        if (arr[j] < pivot)
        {
            i++;

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    int temp = arr[i+1];
    arr[i+1] = arr[h];
    arr[h] = temp;

    return i+1;
  

  }
  void swap(int arr[],int i,int j)
  {
    int temp;
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int len=sc.nextInt();
    int arr[]=new int[len];
    for(int i=0;i<len;i++)
    arr[i]=sc.nextInt();
    quicksort q=new quicksort();
    q.quicksorting(arr,0,len-1);
    for(int i=0;i<len;i++)
    System.out.println(arr[i]+" ");

  }
}
