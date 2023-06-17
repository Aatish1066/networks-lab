package Topologies;

public class graph_star {
    public graph_star(){
        int nod= 10;
        int centre=2;
        int conn[][] = new int[nod][nod] ;

        //in bus topology the nodes are connected in
        /*
         * connection matrix of ring
         * 4x4 with four node n1 n2 n3 n4
         *    n1 n2 n3
         *n1 [0, 1, 0, 0]
         *n2 [1, 0, 1, 1]
         *n3 [0, 1, 0, 0]
         *n4 [0, 1, 0, 0]
         */
        for(int i=0;i<nod;i++){
            for (int j=0;j<nod;j++){
                if(j==i){
                    conn[i][j]=0;}
                else if (j==centre) {
                    conn[i][j]=1;}
                else if (i==centre) {
                    conn[i][j]=1;

                } else{
                    conn[i][j]=0;

            }

            }
        }
        System.out.println("star topology connection graph");
        for(int i=0;i<nod;i++){
            for (int j=0;j<nod;j++){
                System.out.print(conn[i][j]+" ");
            }
            System.out.println();
        }
    }
}
