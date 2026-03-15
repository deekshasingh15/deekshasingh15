import java.util.*;

public class MinimumDiscount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String itemName = "";
        double minDiscount = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] parts = input.split(",");

            String name = parts[0];
            double price = Double.parseDouble(parts[1]);
            int discount = Integer.parseInt(parts[2]);

            double discountAmount = price * discount / 100;

            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                itemName = name;
            }
        }

        System.out.println(itemName);
    }
}
