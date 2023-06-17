package Topologies;

public class graph_ring {
    public graph_ring(){
        int nod= 10;
        int conn[][] = new int[nod][nod] ;
        //in bus topology the nodes are connected in
        /*
         * connection matrix of ring
         * 3x3 with three node n1 n2 n3
         *    n1 n2 n3
         *n1 [1, 1, 0]
         *n2 [1, 0, 1]
         *n3 [0, 1, 1]
         */
        for(int i=0;i<nod;i++){
            for (int j=0;j<nod;j++){
                if((i==0&&j==nod-1)||(j==0&&i==nod-1)){
                    conn[i][j]=1;}
                else if(j==i+1){
                    conn[i][j]=1;}
                else if(j==i-1){
                    conn[i][j]=1;
                }
                else  {
                    conn[i][j]=0;
                }
            }
        }
        System.out.println("ring topology connection graph");
        for(int i=0;i<nod;i++){
            for (int j=0;j<nod;j++){
                System.out.print(conn[i][j]+" ");
            }
            System.out.println();
        }
    }
}
