package algorithms;

import java.io.*;
import java.util.*;
public class leaky_bucket {
    public static void main(String[] args) {
        int no_of_quries,storage,output_packet_size;
        int input_pkt_size,bucket_size ,size_left;
        storage=0;
        no_of_quries=4;
        bucket_size=10;
        input_pkt_size=4;
        output_packet_size=1;
        for (int i = 0; i < no_of_quries; i++) {
            size_left=bucket_size-storage;
            if(input_pkt_size<=(size_left)){
                storage+=input_pkt_size;
            }
            else{
                System.out.println("packet loss ="+input_pkt_size);
            }
            System.out.println("buffer size ="+storage+"out of bucket size="+bucket_size);
            storage-=output_packet_size;
        }
    }
}
