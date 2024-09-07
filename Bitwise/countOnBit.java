// count the total number of 1's in a binary of an integer.

public class countOnBit {

    public static void main(String[] args) {

        int num = 11;
        int count =0;

        while(num>0){
            int lastbit = num&1;
            if(lastbit ==1){
                count++;
            }
            num = num>>1;
        }

        System.out.println("Total number of 1's = "+count);

    }
}
