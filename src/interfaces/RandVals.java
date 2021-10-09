// Initializing interface fields with
// non-constant initializers.
package interfaces;

import java.util.Random;

public class RandVals {
    static Random RAND = new Random(47);
    static int RANDOM_INT = RAND.nextInt(10);
    static long RANDOM_LONG = RAND.nextLong() * 10;
    static float RANDOM_FLOAT = RAND.nextLong() * 10;
    static double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
