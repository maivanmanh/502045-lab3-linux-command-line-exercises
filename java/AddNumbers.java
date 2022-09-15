import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //System.out.print("Nhập số thứ nhất: ");
            int a = scanner.nextInt();

            //System.out.print("Nhập số thứ hai: ");
            int b = scanner.nextInt();

            //System.out.println("\nTổng hai số vừa nhập: " + (a + b));
            System.out.print(a + b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}