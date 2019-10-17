import java.util.*;
import java.io.*;
class nqueen
{

  public static void printBoard(int board[][],int size){
  System.out.println();
  for(int i=0;i<size;i++){
  for(int j=0;j<size;j++){
  System.out.print(" " + board[i][j] + " ");

  }
  System.out.println();
  }
  System.out.println();
  }

  public static boolean validMove(int board[][],int row,int col,int size){
  for(int i=0;i<col;i++){
  if(board[row][i]==1)
  return false;
  }

  for(int i=row,j=col;i>=0 && j>=0;i--,j--){
  if(board[i][j]==1)
  return false;
  }

  for (int i=row, j=col; j>=0 && i<size; i++, j--)
  if (board[i][j]==1)
              return false;
  return true;

  }

  public static boolean solvenq(int board[][],int col,int size)
  {
    if(col>=size)
    {
      printBoard(board,size);
      return true;
    }
    boolean res=false;
    for(int i=0;i<size;i++){
    if(validMove(board,i,col,size)){
    board[i][col]=1;
    res=solvenq(board,col+1,size) || res;
    board[i][col]=0;
    }
    }
    return res;
  }
  public static void setqueens(int size)
  {
    int board[][]=new int[size][size];
    if(solvenq(board,0,size)==false){
    System.out.println("Solution doesn't exist");
    }
  }
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     setqueens(size);
  }
}
