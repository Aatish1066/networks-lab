package exp;

public class exp2 {
    //shortest path to destination
    public exp2(int source,int dest,int nodes){
      int[][] graph = inputfunc.input(nodes);
      int pathlength = 0;
      if(graph[source][dest]!=0){
          System.out.println("the shortest path is "+graph[source][dest]);
      }
      else{
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j <i ; j++) {
                if(graph[j][dest]!=0){
                    pathlength=pathlength+graph[source][j]+graph[j][dest];
                    System.out.println(""+pathlength);
                }

            }
        }

        }
      inputfunc.show(graph,nodes);





    }

}
