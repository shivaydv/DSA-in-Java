
class bitwiseComplementInteger {

    public int bitwiseComplement(int n) {
        int mask = 0;
        int num = n;

        if (n == 0) {
            return 1;
        }
        while (n != 0) {
            mask = mask << 1 | 1;
            n = n >> 1;
        }
        return (~num) & mask;
    }

    public static void main(String[] args) {
        bitwiseComplementInteger obj = new bitwiseComplementInteger();
        System.out.println(obj.bitwiseComplement(7));
    }

}
