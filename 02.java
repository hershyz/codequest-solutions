class Main {

    public static void main(String[] args) {
        System.out.println(q02(new int[]{1, 2, 3, 4}));
        System.out.println(q02(new int[]{30, 15, 20, 10}));
        System.out.println(q02(new int[]{55, 10, 45, 60, 15, 45, 25, 30}));
    }

    public static int q02(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return arr[max];
    }
}