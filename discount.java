import java.util.Scanner;
public class discount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String itemName = "";
        int minDiscount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(",");

            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discount = Integer.parseInt(parts[2]);

            int discountValue = (price * discount) / 100;

            if (discountValue < minDiscount) {
                minDiscount = discountValue;
                itemName = name;
            }
        }

        System.out.println(itemName);
        sc.close();
    }
} 
