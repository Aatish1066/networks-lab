package p1;
public class graph_bus {
public graph_bus(){
    int nod= 10;

    int conn[][] = new int[nod][nod] ;

    //in bus topology the nodes are connected in series
    /*
     * connection matrix of bus
     * 3x3 with three node n1 n2 n3
     *    n1 n2 n3
     *n1 [0, 1, 0]
     *n2 [1, 0, 1]
     *n3 [0, 1, 0]
     */
    for(int i=0;i<nod;i++){
        for (int j=0;j<nod;j++){
            if(j==i){
                conn[i][j]=0;}
            else if(j==i+1){
                conn[i][j]=1;}
            else if(j==i-1){
                conn[i][j]=1;
            }

        }
    }
    System.out.println("bus topology connection graph");
    for(int i=0;i<nod;i++){
        for (int j=0;j<nod;j++){
            System.out.print(conn[i][j]+" ");
        }
        System.out.println();
    }
}

}
