class Main {
    
    public static void main(String[] args) {
        System.out.println(q06("code"));
        System.out.println(q06("quest"));
        System.out.println(q06("dot"));
        System.out.println(q06("problem"));
    }

    public static int q06(String str) {
        String alphabet = " abcdefhijklmnopqrstuvwxyz";
        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            String curr = String.valueOf(str.charAt(i));
            for (int j = 1; j < alphabet.length(); j++) {
                if (curr.equals(String.valueOf(alphabet.charAt(j)))) {
                    total += j;
                    break;
                }
            }
        }
        return total;
    }
}
