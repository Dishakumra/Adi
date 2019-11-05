import java.util.*;
public class Bfs{
  int v=0;
  boolean matrix[][];
  int visited[];
  public Bfs(int g)
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
  public void bfs(int x)
  { Queue<Integer> q=new LinkedList<Integer>();
    visited[x]=1;
    q.add(x);
    while(q.size()!=0)
    {
      int g=q.poll();
      System.out.print(g+" ");
      for(int i=0;i<v;i++)
      {
        if(matrix[x][i]&&visited[i]==0&&i!=x)
        {
          q.add(i);
          visited[i]=1;
        }
      }
    }

  }
  public static void main(String args[])
  {
    Bfs g=new Bfs(4);
       g.addEdge(0, 1);
       g.addEdge(0, 2);
       g.addEdge(1, 2);
       g.addEdge(2, 0);
       g.addEdge(2, 3);
       for(int i=0;i<4;i++)
       {
         g.visited[i]=0;
       }
       g.bfs(2);

  }
}
