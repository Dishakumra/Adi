import java.util.*;
public class Dfs{
  int v=0;
  boolean matrix[][];
  int visited[];
  public Dfs(int g)
  {
    v=g;
    matrix=new boolean[v][v];
    visited=new int[v];
  }
  public void addEdge(int a,int b)
  {
    matrix[a][b]=true;
    matrix[b][a]=true;
  }
  public void removeEdge(int a,int b)
  {
    matrix[a][b]=false;
    matrix[b][a]=true;
  }
  public void dfs(int x)
  { Stack<Integer> q=new Stack<Integer>();
    visited[x]=1;
    q.push(x);
    while(q.size()!=0)
    {
      int g=q.pop();
      System.out.print(g+" ");
      for(int i=0;i<v;i++)
      {
        if(matrix[x][i]&&visited[i]==0&&i!=x)
        {
          q.push(i);
          visited[i]=1;
        }
      }
    }

  }
  public static void main(String args[])
  {
    Dfs g=new Dfs(4);
       g.addEdge(0, 1);
       g.addEdge(0, 2);
       g.addEdge(1, 2);
       g.addEdge(2, 0);
       g.addEdge(2, 3);
       for(int i=0;i<4;i++)
       {
         g.visited[i]=0;
       }
       g.dfs(2);

  }
}
