import java.util.*;


public class Adjlist{
  public static class Graph{
    int v;
    LinkedList<Integer> listmatrix[];
    Graph(int v){
    this.v=v;
    listmatrix=new LinkedList[v];
    for(int i=0;i<v;i++)
    {
      listmatrix[i]=new LinkedList<>();
    }
    }
  }
  public static void addEdge(Graph graph,int src,int dest)
{
graph.listmatrix[src].add(dest);

graph.listmatrix[dest].add(src);
}
static void printGraph(Graph graph,int n)
{
for(int v=0;v<n;v++)
{
System.out.println("adjacent list of vertex"+v);
System.out.println("head");
for(Integer pCrawl:graph.listmatrix[v])
{
System.out.print("-> "+pCrawl);
}
System.out.println("\n");
}
}
  public static void main(String []args)
  {
    int v=5;
    Graph graph=new Graph(v);
    addEdge(graph,0,1);
    addEdge(graph,0,4);
    addEdge(graph,1,2);
    addEdge(graph,1,3);
    addEdge(graph,1,4);
    addEdge(graph,2,3);
    addEdge(graph,3,4);
    printGraph(graph,v);
  }
}
