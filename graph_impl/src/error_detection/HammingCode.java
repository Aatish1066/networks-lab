package error_detection;



public class HammingCode {
    private String data;
    private int m, r;
    private char[] msg;

    public HammingCode(String data) {
        this.data = data;
        StringBuilder sb = new StringBuilder(data);
        sb.reverse();
        this.data = sb.toString();
        m = data.length();
        int power = 1;
        while (power < (m + r + 1)) {
            r++;
            power *= 2;
        }
        msg = new char[m + r + 1];
        int curr = 0;
        for (int i = 1; i <= m + r; i++) {
            if ((i & (i - 1)) == 0) {
                msg[i] = 'n';
            } else {
                msg[i] = data.charAt(curr++);
            }
        }
        setRedundantBits();
    }

    public void showmsg() {
        System.out.print("The data packet to be sent is: ");
        for (int i = m + r; i >= 1; i--) {
            System.out.print(msg[i] + " ");
        }
        System.out.println();
    }

    private void setRedundantBits() {
        int bit = 0;
        for (int i = 1; i <= m + r; i *= 2) {
            int count = 0;
            for (int j = i + 1; j <= m + r; j++) {
                if ((j & (1 << bit)) != 0) {
                    if (msg[j] == '1') count++;
                }
            }
            if ((count & 1) == 1) {
                msg[i] = '1';
            } else {
                msg[i] = '0';
            }
            bit++;
        }
        showmsg();
    }
}