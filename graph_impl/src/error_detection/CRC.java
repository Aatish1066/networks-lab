package error_detection;
import java.util.Arrays;

public class CRC {
    private final int[] generator;

    public CRC(int[] generator) {
        this.generator = generator;
    }

    public int[] calculateCRC(int[] data) {
        int[] dividend = Arrays.copyOf(data, data.length + generator.length - 1);

        for (int i = 0; i < data.length; i++) {
            if (dividend[i] == 1) {
                for (int j = 0; j < generator.length; j++) {
                    dividend[i + j] ^= generator[j];
                }
            }
        }

        return Arrays.copyOfRange(dividend, data.length, dividend.length);
    }
}


