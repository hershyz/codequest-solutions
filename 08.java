class Main {
 
    public static void main(String[] args) {
        
        int[][] arr = new int[][]{
            {2, 2},
            {3, -2}
        };

        System.out.println(q08(arr));
    }

    public static int q08(int[][] arr) {
        
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int n = arr[i][j];
                if (n < 0) {
                    n *= -1;
                }
                sum += n;
            }
        }

        return sum;
    }
}