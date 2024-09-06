public class constant {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};


        arr[0]= arr[0] + 10; //T.C = O(1)

        int num = arr[arr.length -1]; //S.C - int 4 bytes = O(4)

        System.out.println(arr[0]); // T.C = O(1)
        System.out.println(num);


        // Constant Time Complexity  : O(1) + O(1) = O(2) ==> O(1)
        // Constant Space Complexity : O(4) ==> O(1)
    }
}