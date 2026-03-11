
    import java.util.Scanner;
public class a { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (a*a*a) + (3*a*a*b) + (3*a*b*b) + (b*b*b);

        System.out.println(result);
        sc.close();
    }

}

