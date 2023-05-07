package exp;

import java.util.Scanner;


public class inputfunc {

    public static int show(int[][] graph,int nodes) {
        if(graph!=null){
        for (int i = 0; i < nodes; i++){

            System.out.println("");
            for (int j = 0; j < nodes; j++) {
                System.out.print(graph[i][j]+" ");
            }}}
        System.out.println("");
        return 0;
    }

    public static int[][] input(int nodes){
        Scanner myObj =   new Scanner(System.in);


            int[][] graph=new int[nodes][nodes];
            for (int i=0;i<nodes;i++)
                for (int j=0;j<i;j++){
                    System.out.println("enter weight between "+(i+1)+"and"+(j+1));
                   graph[j][i]=graph[i][j]=myObj.nextInt();
                }


        return graph;
    }


}
