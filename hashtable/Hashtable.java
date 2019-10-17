import java.util.*;

class HashTable{
	int capacity;
	LinkedList<Integer> l[]=new LinkedList[100];
	
	public HashTable(int c){
		this.capacity=c;
	}
	
	public int key(int data){
		return data%capacity;
	}
	
	public void insert(int data){
		int index=key(data);
		if(l[index]==null)
			l[index]=new LinkedList<Integer>();
		l[index].add(data);
	}
	
	public void display(){
		for(int i=0;i<capacity;i++){
			
			if(l[i]!=null){
			System.out.println(i+"->"+l[i]);
			}
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		HashTable h=new HashTable(10);
		int num=sc.nextInt();
		while(num!=-1){
			h.insert(num);
			num=sc.nextInt();
		}
		h.display();
	}
}