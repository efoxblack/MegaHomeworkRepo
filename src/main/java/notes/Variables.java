package notes;

public class Variables {

    public static void main(String[] args) {
        /*
            Primitive Types
        Type    Bit Depth   Value Range
            boolean and char
        boolean (JVM-specific) true or false
        char    16 bits     0 to 65535
            numeric (all are signed)
        integer
        byte    8 bits      -128 to 127
        short   16 bits     -32768 to 32767
        int     32 bits     -2147483648 to 2147483647
        long    64 bits     -huge to huge
        floating point
        float   32 bits     varies
        double  64 bits     varies
        */
        // Primitive declarations with assignments:
//        int x;
//        x = 234;
//        byte b = 89;
//        boolean isFun = true;
//        double d = 3456.98;
//        char c = 'f';
//        int z = x;
//        boolean isPunkRock;
//        isPunkRock = false;
//        boolean powerOn;
//        powerOn = isFun;
//        long big = 3456789;
//        float f = 32.5f;

//        int nums[];
//        nums = new int[7];
//        nums[0] = 6;
//        nums[1] = 19;
//        nums[2] = 44;
//        nums[3] = 42;
//        nums[4] = 10;
//        nums[5] = 20;
//        nums[6] = 1;

        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0 ) {
                System.out.println(i);
            }
        }

    }
}
