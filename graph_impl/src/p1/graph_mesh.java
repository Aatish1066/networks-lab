package p1;

public class graph_mesh {
    public graph_mesh(){

        int nod= 10;

        int conn[][] = new int[nod][nod] ;

        //in  topology the nodes are connected in
        /*
         * connection matrix of mesh
         * 3x3 with three node n1 n2 n3
         *    n1 n2 n3
         *n1 [0, 1, 1]
         *n2 [1, 0, 1]
         *n3 [1, 1, 0]
         */
        for(int i=0;i<nod;i++){
            for (int j=0;j<nod;j++){
                if(i==j){
                    conn[i][j]=0;}

                else  {
                    conn[i][j]=1;
                }

            }
        }
        System.out.println("mesh topology connection graph");
        for(int i=0;i<nod;i++){
            for (int j=0;j<nod;j++){
                System.out.print(conn[i][j]+" ");
            }
            System.out.println();
        }
    }
}
