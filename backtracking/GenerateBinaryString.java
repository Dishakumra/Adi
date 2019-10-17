import java.util.*;

class Binarystring{
	
	public static void generateBString(String str,int n){
		if(str.length()==n)
			System.out.println(str);
		else {
			generateBString(str+"0",n);
			generateBString(str+"1",n);
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=new String();
		generateBString(str,n);
	}
}