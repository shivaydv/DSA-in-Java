public class logarithmic {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5,6,7,8,9,10};

        arr[0]= arr[0] + 10; //T.C = O(1)

        for (int i = 1; i <= arr.length; i=i*2) {
            System.out.println(arr[i-1]); //T.C = O(log n)
        }

        System.out.println(arr[0]); //T.C = O(1)

        //other examples - binary search

        //  Time Complexity  : O(1) + O(log n) + O(1) = O(2+log n) ==> O(log n)
        //  Space Complexity : O(1)
    }
}
