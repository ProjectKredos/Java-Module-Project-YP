import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int countUser;
        Scanner scanner = new Scanner(System.in);
        System.out.println("На скольких человек необходимо разделить счёт?");
        while (true) {
            countUser = scanner.nextInt();
            if (countUser==1) {
                System.out.println("В этом случае нет смысла ничего считать и делить. Попробуйте еще раз.");
            } else if (countUser<1) {
                System.out.println("Это некорректное значение для подсчёта. Попробуйте еще раз.");
            } else {
                break;
            }
        }
        goods.addGoods(countUser);

    }
}
