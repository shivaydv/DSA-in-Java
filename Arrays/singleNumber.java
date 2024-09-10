
public class singleNumber {
    public static int singleNum(int[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(singleNum(arr));
    }
}