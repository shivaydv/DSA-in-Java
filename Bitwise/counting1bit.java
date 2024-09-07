// WAP to count the number of 1 bits in an integer.

public class counting1bit {

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

        System.out.println("Number of 1 bits in the given number is: "+count);

    }
}
