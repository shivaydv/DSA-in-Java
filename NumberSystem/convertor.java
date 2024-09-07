
public class convertor {

    static void toBinary(int decimal) {

        String result = "";

        while (decimal > 0) {

            int lastbit = decimal & 1;
            result = lastbit + result;
            decimal = decimal >> 1;
        }

        System.out.println(result);
    }

    static void toDecimal(int binary){
        int result =0;
        int index =0;

        while(binary>0){
            int lastdigit = binary%10;
            if(lastdigit == 1){
                result = result + (int) Math.pow(2,index);
            }
            index++;
            binary = binary/10;
        }

        System.out.println(result);
    }

    public static void main(String args[]) {
        toBinary(12);
        toDecimal(1100);
    }

}
