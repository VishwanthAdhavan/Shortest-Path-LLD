import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Dimension (n x n):");

        int s=sc.nextInt();
        char mat[][]=new char[s][s];

        for(int i=0;i<s;i++)
            for(int j=0;j<s;j++)
                mat[i][j]='0';

        System.out.println("Enter Adventurer Position (row x col):");
        int x1= sc.nextInt(),y1=sc.nextInt();
        mat[x1][y1]='A';

        System.out.println("Enter Destination Postion (row x col):");
        int x2=sc.nextInt(),y2=sc.nextInt();
        mat[x2][y2]='D';

        System.out.println("Matrix:");
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }
        Shortestpath x=new ShortestPath();

        int shortestpath=x.findShortestPath(x1,y1,x2,y2);

        System.out.println("The Shortest Path is "+shortestpath);
    }

    int findShortestPath(int x1,int y1,int x2,int y2){
        return Math.max(Math.abs(x2-x1),Math.abs(y2-y1));//With Consideration of Diagonal
        //return Math.abs(x2-x1)+Math.abs(y2-y1);//Without consideration of Diagonal
    }
}