import java.util.*;
public class Adjmatrix{
  int v=0;
  boolean matrix[][];
  public Adjmatrix(int g)
  {
    v=g;
    matrix=new boolean[v][v];
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
  public static void main(String args[])
  {
    Adjmatrix g=new Adjmatrix(4);
       g.addEdge(0, 1);
       g.addEdge(0, 2);
       g.addEdge(1, 2);
       g.addEdge(2, 0);
       g.addEdge(2, 3);
       for(int i=0;i<4;i++)
       {
         for(int j=0;j<4;j++)
         {
           if(g.matrix[i][j])
           System.out.print("1 ");
           else
           System.out.print("0 ");
         }
         System.out.println("");
       }
  }
}
