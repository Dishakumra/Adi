
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
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
}

class DetectCycle
{
    static boolean cyclefound(ArrayList<ArrayList<Integer>> list,int i,boolean[] visited,boolean[] recstack)
    {
        if(recstack[i])
        return true;
        if(visited[i])
        return false;
        visited[i]=true;
        recstack[i]=true;
        ArrayList<Integer> childern=list.get(i);
        for(Integer c:childern){
            if(cyclefound(list,c,visited,recstack))
            return true;
        }
        recstack[i]=false;
        return false;
        
    }
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int v)
    {
        boolean[] visited=new boolean[v];
        boolean[] recstack=new boolean[v];
        for(int i=0;i<v;i++)
        if(cyclefound(list,i,visited,recstack))
        return true;
        return false;
        
        // add your code here
    }
}
