public class revArr {
    static int[] arr = { 1, 2, 3, 4, 5 };

    static void rev(int l, int h) {
        if (l > h) {
            return;
        }
        int tmp = arr[l];
        arr[l] = arr[h];
        arr[h] = tmp;
        rev(l + 1, h - 1);
    }

    public static void main(String[] args) {
        rev(0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}