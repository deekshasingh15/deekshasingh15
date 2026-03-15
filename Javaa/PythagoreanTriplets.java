public class PythagoreanTriplets {

    public static void generate(int limit) {

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {

                int cSquare = a * a + b * b;
                int c = (int) Math.sqrt(cSquare);

                if (c * c == cSquare && c <= limit) {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }

    public static void main(String[] args) {
        generate(20);
    }
}