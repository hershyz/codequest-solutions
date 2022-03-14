class Main {

    public static void main(String[] args) {
        System.out.println(q01(3));
        System.out.println(q01(0));
        System.out.println(q01(1));
        System.out.println(q01(2));
    }

    public static String q01(int n) {
        if (n % 2 == 0) {
            return "EVEN";
        }
        return "ODD";
    }
}