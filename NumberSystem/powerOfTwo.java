
public class powerOfTwo {

    static boolean isPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }
        while (num != 0) {
            int lastbit = num & 1;

            num = num >> 1;

            if (lastbit == 1 && num != 0) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(isPowerOfTwo(num));

    }

}
