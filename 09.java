class Main {
    
    public static void main(String[] args) {
        q09(101.23);
    }

    public static void q09(double val) {
        
        while (val > 0) {
            // bills
            if (val >= 100) {
                val -= 100;
                System.out.println("$100");
            }
            else if(val >= 50) {
                val -= 50;
                System.out.println("$50");
            }
            else if (val >= 20) {
                val -= 20;
                System.out.println("$20");
            }
            else if (val >= 10) {
                val -= 10;
                System.out.println("$10");
            }
            else if (val >= 5) {
                val -= 5;
                System.out.println("$5");
            }
            else if (val >= 2) {
                val -= 2;
                System.out.println("$2");
            }
            else if (val >= 1) {
                val -= 1;
                System.out.println("$1");
            }

            // coins
            else if (val >= 0.25) {
                val -= 0.25;
                System.out.println("$0.25");
            }
            else if (val >= 0.1) {
                val -= 0.1;
                System.out.println("$0.1");
            }
            else if (val >= 0.05) {
                val -= 0.05;
                System.out.println("$0.05");
            }
            else if (val >= 0.01) {
                val -= 0.01;
                System.out.println("$0.01");
            }
        }
    }
}
