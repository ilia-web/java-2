import java.util.Scanner;

public class lesson2_task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int res = 1;

        for (int i = 0; i < b; i++){
            res = res * a;
        }
        System.out.println(res);
    }
}
