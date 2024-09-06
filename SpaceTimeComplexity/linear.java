public class linear {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        arr[0]= arr[0] + 10; //T.C = O(1)

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 10; //T.C = O(n)
        }

        System.out.println(arr[0]); //T.C = O(1)



        //  Time Complexity  : O(1) + O(n) + O(1) = O(2+n) ==> O(n)
        //  Space Complexity : O(1)

        int[] newarr = new int[arr.length]; //S.C - O(n)

    }
}
