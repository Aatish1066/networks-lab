import java.util.*;

import static error_detection.Checksum.check;

public class Main {
    public static void main(String[] args) {
//        inputfunc graph=new inputfunc();
//        int[][] g1= graph.input(3);
//        inputfunc.show(g1,3);
//        prism p= new prism();
//        prism.primMST(g1);
//        dijkstra d=new dijkstra(g1,2);
//        int[] data = {1, 0, 1, 1, 0, 0, 1}; // the data to be transmitted
//        int[] generator = {1, 0, 1}; // the generator polynomial
//        CRC crc = new CRC(generator);
//        int[] crcResult = crc.calculateCRC(data);
//        System.out.println(Arrays.toString(crcResult)); // prints [1, 0, 0]
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        HammingCode h = new HammingCode(str);
//        sc.close();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sent message: ");
        String sentMessage = scanner.nextLine();
        System.out.print("Received message: ");
        String receivedMessage = scanner.nextLine();
        int blockSize = 8;
        if (check(sentMessage, receivedMessage, blockSize)) {
            System.out.println("No error");
        } else {
            System.out.println("Error");
        }
        scanner.close();


    }
}
//    public static void main(String[] args) {
//        int[][] graph = new int[][]{
//                {0, 2, 0, 6, 0},
//                {2, 0, 3, 8, 5},
//                {0, 3, 0, 0, 7},
//                {6, 8, 0, 0, 9},
//                {0, 5, 7, 9, 0}
//        };
//
//        dijkstra(graph, 0);
//
//}
//    public static void main(String[] args) {
//
//        ll_bus b1= new ll_bus();
//        b1.addNode(1,"first node");
//        b1.addNode(2,"second node");
//        b1.comm("first node","second node","the connection is established");
//    }
//   graph_bus g1=new graph_bus();
//   graph_ring r1=new graph_ring();
//   graph_star s1=new graph_star();
//   graph_mesh m1=new graph_mesh();
//  exp2 e1=new exp2(1,3,3);

   /*     Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();

        int e=sc.nextInt();
        int aj[][]=new int[v][v];
        for(int i=0;i<e;i++) {


            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int w=sc.nextInt();
            aj[v1][v2]=w;
            aj[v2][v1]=w;

        }
        dijkstra obj=new dijkstra();
        obj.dij(aj);

*/
    /*int nodes=4;
     krushkal k1=new krushkal(nodes);
     //inputfunc.show(k1.graph,nodes);
    k1.listing(k1.graph, nodes);*/