class Main {

    public static void main(String[] args) {
        System.out.println(even(3));
        System.out.println(even(0));
        System.out.println(even(1));
        System.out.println(even(2));
    }

    public static String even(int n) {
        if (n % 2 == 0) {
            return "EVEN";
        }
        return "ODD";
    }
}