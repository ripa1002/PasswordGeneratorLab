package risto.tira.passwordgeneratorlab;

/**
 * Class that handles the SHA1 algorithm.
 * @author rsutinen
 */
public class SHA1 {
    private final byte[] inputString;
    
    //variables initialized
    private static final int AINIT = 1732584193;
    
    private static final int BINIT = -271733879;
    
    private static final int CINIT = -1732584194;
    
    private static final int DINIT = 271733878;
    
    private static final int EINIT = -1009589776;

    //Constructor to read inputString as byte array
    public SHA1(String inputString) {
        this.inputString = inputString.getBytes();
    }
    
    //SHA1 hash function. Returns hash as String.
    public String hash() {
        //Convert string to blocks and insert padding
        int[] blocks = new int[(((inputString.length + 8) >> 6) + 1) * 16];
        int i;

        for (i = 0; i < inputString.length; i++) {
            blocks[i >> 2] |= inputString[i] << (24 - (i % 4) * 8);
        }

        blocks[i >> 2] |= 0x80 << (24 - (i % 4) * 8);
        blocks[blocks.length - 1] = inputString.length * 8;

        //Calculate hash from the blocks
        int[] words = new int[80];

        int a = AINIT;
        int b = BINIT;
        int c = CINIT;
        int d = DINIT;
        int e = EINIT;

        for (i = 0; i < blocks.length; i += 16) {
            int startA = a;
            int startB = b;
            int startC = c;
            int startD = d;
            int startE = e;

            for (int j = 0; j < 80; j++) {
                words[j] = (j < 16) ? blocks[i + j]
                        : ((words[j - 3] ^ words[j - 8] ^ words[j - 14] ^ words[j - 16]) << 1) | ((words[j - 3] ^ words[j - 8] ^ words[j - 14] ^ words[j - 16]) >>> (32 - 1));

                int t = ((a << 5) | (a >>> (32 - 5))) + e + words[j]
                        + ((j < 20) ? 1518500249 + ((b & c) | ((~b) & d))
                                : (j < 40) ? 1859775393 + (b ^ c ^ d)
                                        : (j < 60) ? -1894007588 + ((b & c) | (b & d) | (c & d))
                                                : -899497514 + (b ^ c ^ d));
                e = d;
                d = c;
                c = (b << 30) | (b >>> (32 - 30));
                b = a;
                a = t;
            }

            a = a + startA;
            b = b + startB;
            c = c + startC;
            d = d + startD;
            e = e + startE;
        }

        //Convert to byte array
        byte[] byteArray = new byte[20];
        byteArray[0 + 0] = (byte) ((a >> 24) & 0xff);
        byteArray[0 + 1] = (byte) ((a >> 16) & 0xff);
        byteArray[0 + 2] = (byte) ((a >> 8) & 0xff);
        byteArray[0 + 3] = (byte) ((a) & 0xff);
        
        byteArray[4 + 0] = (byte) ((b >> 24) & 0xff);
        byteArray[4 + 1] = (byte) ((b >> 16) & 0xff);
        byteArray[4 + 2] = (byte) ((b >> 8) & 0xff);
        byteArray[4 + 3] = (byte) ((b) & 0xff);
        
        byteArray[8 + 0] = (byte) ((c >> 24) & 0xff);
        byteArray[8 + 1] = (byte) ((c >> 16) & 0xff);
        byteArray[8 + 2] = (byte) ((c >> 8) & 0xff);
        byteArray[8 + 3] = (byte) ((c) & 0xff);
        
        byteArray[12 + 0] = (byte) ((d >> 24) & 0xff);
        byteArray[12 + 1] = (byte) ((d >> 16) & 0xff);
        byteArray[12 + 2] = (byte) ((d >> 8) & 0xff);
        byteArray[12 + 3] = (byte) ((d) & 0xff);
        
        byteArray[16 + 0] = (byte) ((e >> 24) & 0xff);
        byteArray[16 + 1] = (byte) ((e >> 16) & 0xff);
        byteArray[16 + 2] = (byte) ((e >> 8) & 0xff);
        byteArray[16 + 3] = (byte) ((e) & 0xff);
        
        //Convert byte array to String
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < byteArray.length; j++) {
            sb.append(String.format("%02X", byteArray[j] & 0xFF));
        }
        return sb.toString();
    }
}
