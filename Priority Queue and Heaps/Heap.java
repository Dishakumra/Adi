import java.util.*;
class Heap
{
    static int n;
    public static void heapify(int arr[],int i,int n)
    {
        int l=2*i;
        int r=2*i+1;
        int max=i;
        if(l<=n && arr[l]>arr[i])
            max=l;
        if(r<=n && arr[r]>arr[max])
            max=r;
		
        if(max!=i)
        {
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
            heapify(arr,max,n);
        }
    }
    public static void insertheapify(int arr[],int i)
    {
        if(i/2==0)
            return;
        if(arr[i/2]<arr[i])
        {
            int temp=arr[i/2];
            arr[i/2]=arr[i];
            arr[i]=temp;
            insertheapify(arr,i/2);
        }
    }
    public static void delete(int arr[])
    {
        arr[1]=arr[n];
        n--;
        heapify(arr,1,n);
    }
    public static void insert(int arr[],int c)
    {
        arr[++n]=c;
        insertheapify(arr,n);
    }
    public static void heapsort(int arr[],int n)
    {
        for(int i=n;i>1;i--)
        {
            int temp=arr[i];
            arr[i]=arr[1];
            arr[1]=temp;
            heapify(arr,1,i-1);
        }
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int ar[]=new int[100];
        for(int i=1;i<=n;i++)
            ar[i]=sc.nextInt();
        for(int i=n/2;i>=1;i--)
            heapify(ar,i,n);
        System.out.println("After Heapify");
        for(int i=1;i<=n;i++)
            System.out.println(ar[i]);
        System.out.println();
        delete(ar);
        System.out.println("After Deleting max element");
        for(int i=1;i<=n;i++)
        System.out.println(ar[i]);
        System.out.println();
        System.out.println("Enter a element for insertion");
		int c=sc.nextInt();
        insert(ar,c);
        heapsort(ar,n);
        System.out.println("After Insertion");
        for(int i=1;i<=n;i++)
            System.out.println(ar[i]);
    }
}