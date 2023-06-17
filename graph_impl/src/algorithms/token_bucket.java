package algorithms;

public class token_bucket {
    public static void main(String[] args) {
        int token_count=2;
        int bucket_size=10;
        int no_packets=40;
        int packet_size=5;

        bucket_size=bucket_size-token_count;
        for (int i = 0; i < no_packets; i++) {
            if(bucket_size>packet_size){
            if(token_count>0){
                token_count--;
                System.out.println("packet"+(i+1)+"transmitted");
            }
            else{
                System.out.println("packet lost");
            }
        }
        else{
            System.out.println("the size of bucket is too small");
            }

        }
        bucket_size=token_count+bucket_size;


    }
}
