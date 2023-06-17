package protocols;
import java.util.Random;

public class StopAndWaitProtocol {
    public static void main(String[] args) throws InterruptedException {
        int[] frames = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        long seconds = 5;
        Random rand = new Random();
        int count = 0;
        System.out.println("Sender\t\t\t\tReceiver");
        do {
            System.out.print("Sending Frame: " + frames[count]);
            System.out.print("\t\t");
            Thread.sleep(1000);
            if (rand.nextBoolean()) {
                System.out.println("---");
                System.out.println("Timeout");
                continue;
            }
            System.out.println("Received Frame: " + frames[count] + " ");
            if (rand.nextBoolean()) {
                System.out.print("Duplicate");
                System.out.println();
            }
            System.out.println("Acknowledgement: " + frames[count]);
            count++;
        } while (count != 10);
    }
}
