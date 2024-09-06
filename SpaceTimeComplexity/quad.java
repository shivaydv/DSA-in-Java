public class quad {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5,6,7,8,9,10};

        arr[0]= arr[0] + 10; //T.C = O(1)

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]); //T.C = O(n^2)
            }
        }

        System.out.println(arr[0]); //T.C = O(1)

        //other examples - bubble sort

        //  Time Complexity  : O(1) + O(n^2) + O(1) = O(n^2)
        //  Space Complexity : O(1)
    }
}
