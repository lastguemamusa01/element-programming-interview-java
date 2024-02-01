package primitiveTypesPractices;

public class bitManipulation {

    public static short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            // System.out.println("numBits " + numBits);
            x = x >>> 1;
            // System.out.println("x " + x);
        }
        return numBits;
    }

    // 1 is -> odd - impar, 0 is even - par 
    public static short parity(long x) {
        short result = 0;
        while(x != 0) {
            result ^= (x &1);
            x = x >>> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        short result = countBits(5);
        System.out.println("result " + result); // 5 is  101 -> result 2

        short parity = parity(5);
        System.out.println("parity of x " + parity); // parity is 0 -> 5 is 101 is even
    }

    
}
