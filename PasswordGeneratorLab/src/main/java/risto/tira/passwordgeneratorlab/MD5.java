package risto.tira.passwordgeneratorlab;

/**
 * Class that handles the MD5 algorithm.
 * @author rsutinen
 */
public class MD5 {
    private byte[] inputString;
    
    //variables initialized(32-bit words)
    private static int AINIT = 0x67452301;
    private static int BINIT = (int) 0xEFCDAB89L;
    private static int CINIT = (int) 0x98BADCFEL;
    private static int DINIT = 0x10325476;
    
    //blocks table
    private static int[] SHIFT = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};
    //operations table
    private static int[] TABLE = new int[64];
    
    static {
        for (int i = 0; i < 64; i++) {
            TABLE[i] = (int) (long) ((1L << 32) * Math.abs(Math.sin(i + 1)));
        }
    }
    
    //Constructor to read inputString as byte array
    public MD5(String inputString) {
        this.inputString = inputString.getBytes();
    }

    //MD5 hash function. Returns hash as String.
    public String hash() {
        //length of input and total amount of blocks
        int inputLength = inputString.length;
        int blocksCount = ((inputLength + 8) >>> 6) + 1;
        int total = blocksCount << 6;
        
        //insert padding for correct alignment(divisible by 512)
        byte[] paddingBytes = new byte[total - inputLength];
        paddingBytes[0] = (byte) 0x80;
        long bitsLength = (long) inputLength << 3;

        for (int i = 0; i < 8; i++) {
            paddingBytes[paddingBytes.length - 8 + i] = (byte) bitsLength;
            bitsLength >>>= 8;
        }
        //4 message digest passes
        int a = AINIT;
        int b = BINIT;
        int c = CINIT;
        int d = DINIT;

        int[] buffer = new int[16];

        for (int i = 0; i < blocksCount; i++) {
            int index = i << 6;
            for (int j = 0; j < 64; j++, index++) {
                buffer[j >>> 2] = ((int) ((index < inputLength) ? inputString[index]
                        : paddingBytes[index - inputLength]) << 24)
                        | (buffer[j >>> 2] >>> 8);
            }
            int aOrig = a;
            int bOrig = b;
            int cOrig = c;
            int dOrig = d;

            for (int j = 0; j < 64; j++) {
                int div16 = j >>> 4;
                int f = 0;
                int bufferIndex = j;

                switch (div16) {
                    case 0:
                        f = (b & c) | (~b & d);
                        break;

                    case 1:
                        f = (b & d) | (c & ~d);
                        bufferIndex = (bufferIndex * 5 + 1) & 0x0F;
                        break;

                    case 2:
                        f = b ^ c ^ d;
                        bufferIndex = (bufferIndex * 3 + 5) & 0x0F;
                        break;

                    case 3:
                        f = c ^ (b | ~d);
                        bufferIndex = (bufferIndex * 7) & 0x0F;
                        break;
                }
                int temp = b + Integer.rotateLeft(a + f + buffer[bufferIndex] + TABLE[j], SHIFT[(div16 << 2) | (j & 3)]);

                a = d;
                d = c;
                c = b;
                b = temp;
            }

            a += aOrig;
            b += bOrig;
            c += cOrig;
            d += dOrig;
        }

        byte[] md5 = new byte[16];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            int n = (i == 0) ? a : ((i == 1) ? b : ((i == 2) ? c : d));
            for (int j = 0; j < 4; j++) {
                md5[count++] = (byte) n;
                n >>>= 8;
            }
        }
        
        //Convert byte array to String
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < md5.length; i++) {
            sb.append(String.format("%02X", md5[i] & 0xFF));
        }
        return sb.toString();
    }
}
