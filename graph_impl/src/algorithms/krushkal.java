package algorithms;

public class krushkal {
    public int[][] graph;
    public int[][] list=new int[30][4];
    public krushkal(int nodes) {

       this.graph=inputfunc.input(nodes);


    }


    public int[][] listing(int [][] graph, int nodes){
       int inc=0;

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < i; j++) {
                if(graph[i][j]!=0) {
                    this.list[inc][0] = i+1;
                    this.list[inc][1] = j+1;
                    this.list[inc][2] = graph[i][j];
                    inc++;

                }
            }

        }



        for (int i = 0; i < inc; i++) {

            System.out.print(list[i][0] + "->");
            System.out.print(list[i][1] + "=");

            System.out.print(list[i][2] + "|\n");

        }
        return list;
    }}




