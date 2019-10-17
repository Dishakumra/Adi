import java.util.*;
class heapsort
{
  public static void swap(int arr[],int i,int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
  public static void heapsorting(int arr[],int n)
  {
    for (int i=n-1; i>=0; i--)
      {

          swap(arr,0,i);

            // call max heapify on the reduced heap
          heapify(arr, 0, i);
          for(int j=0;j<n;j++)
          System.out.print(arr[j]+" ");
          System.out.println("**");
      }
  }
  public static void heapify(int A[],int i,int size){
    int max=i;
    int l=(2*i)+1,r=(2*i)+2;
    if(l<size && A[l]>A[max])
    max=l;

    if(r<size && A[r]>A[max])
    max=r;

    if(max!=i){
        swap(A,max,i);
        heapify(A,max,size);
    }
}
  public static void buildheap()
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=(n/2);i>=0;i--)
    heapify(arr,i,n);
    for(int i=0;i<n;i++)
    System.out.print(arr[i]+" ");
    System.out.println("build");
    heapsorting(arr,n);
    //for(int i=0;i<n;i++)
    //System.out.println(arr[i]);
  }
  public static void main(String args[])
  {
     buildheap();
  }
}
