package error_detection;

import java.util.Scanner;

public class Checksum {
    public static String onesComplement(String data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return sb.toString();
    }

    public static String calculateChecksum(String data, int blockSize) {
        int n = data.length();
        if (n % blockSize != 0) {
            int padSize = blockSize - (n % blockSize);
            for (int i = 0; i < padSize; i++) {
                data = '0' + data;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < blockSize; i++) {
            result.append(data.charAt(i));
        }
        for (int i = blockSize; i < n; i += blockSize) {
            String nextBlock = data.substring(i, i + blockSize);
            StringBuilder additions = new StringBuilder();
            int sum = 0, carry = 0;
            for (int k = blockSize - 1; k >= 0; k--) {
                sum += (nextBlock.charAt(k) - '0') + (result.charAt(k) - '0');
                carry = sum / 2;
                if (sum == 0) {
                    additions.insert(0, '0');
                    sum = carry;
                } else if (sum == 1) {
                    additions.insert(0, '1');
                    sum = carry;
                } else if (sum == 2) {
                    additions.insert(0, '0');
                    sum = carry;
                } else {
                    additions.insert(0, '1');
                    sum = carry;
                }
            }
            StringBuilder finalResult = new StringBuilder();
            if (carry == 1) {
                for (int l = additions.length() - 1; l >= 0; l--) {
                    if (carry == 0) {
                        finalResult.insert(0, additions.charAt(l));
                    } else if (((additions.charAt(l) - '0') + carry) % 2 == 0) {
                        finalResult.insert(0, '0');
                        carry = 1;
                    } else {
                        finalResult.insert(0, '1');
                        carry = 0;
                    }
                }
                result = finalResult;
            } else {
                result = additions;
            }
        }
        System.out.println(onesComplement(result.toString()));
        return onesComplement(result.toString());
    }

    public static boolean check(String sentMessage, String receivedMessage, int blockSize) {
        String senderChecksum = calculateChecksum(sentMessage, blockSize);
        String receiverChecksum = calculateChecksum(receivedMessage + senderChecksum, blockSize);
        return receiverChecksum.chars().filter(c -> c == '0').count() == blockSize;
    }

}
