public class reverseInt {

    static int reverse(int num){
        int result = 0;
            while(num!=0){
                int lastdigit = num%10;

                //check if number is within the range of integer after multiplying by 10
                if( result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10){
                    return 0;

                }
                result = result*10 + lastdigit;
                num = num/10;
            }
            return result;
        }

      public static void main(String[] args) {
           int ans = reverse(-321);
           System.out.println(ans);
      }

}
