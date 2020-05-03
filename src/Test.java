import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Caculate caculate = new Caculate();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        caculate.caculateNumber(a, b);
    }
}
