import java.util.*;
import java.io.*;
import java.lang.*;
class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}

class DetectCycle
{
    static boolean cyclefound(ArrayList<ArrayList<Integer>> list,int v,int parent,boolean[] visited)
    {
        ArrayList<Integer> cs=list.get(v);
        visited[v]=true;
        for(Integer c:cs)
        {
            if(!visited[c])
            {
            if(cyclefound(list,c,v,visited))
            return true;
            }
            else if(c!=parent)
            return true;
        }
        return false;
        
    }
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int v)
    {
       
       boolean[] visited=new boolean[v];// add your code here
      for(int i=0;i<v;i++)
       if(!visited[i])
       if(cyclefound(list,i,-1,visited))
       return true;
       return false;
    }
}
