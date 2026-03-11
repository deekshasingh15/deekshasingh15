public class pythagoreantriplets {
    public static void main(String[] args) {

        int limit = 20;

        for (int a = 1; a < limit; a++) {
            for (int b = 1; b < limit; b++) {
                for (int c = 1; c < limit; c++) {

                    if (a * a + b * b == c * c && c <= limit) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
