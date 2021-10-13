import java.util.Scanner;

public class lesson2_task4 {

    private static boolean isPrime(int x){
        for (int i =2; i < x; i++){
            if (x % i == 0);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)){
            System.out.println("მარტივია");
        }else {
            System.out.println("შედგენილია");
        }
    }
}
