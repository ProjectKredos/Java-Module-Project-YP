import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int countUser;
        countUser = countUser();
        Goods.addGoods(countUser);
    }

    public static int countUser() {
        int countUser;
        System.out.println("На скольких человек необходимо разделить счёт?");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                countUser = scanner.nextInt();
                if (countUser == 1) {
                    System.out.println("В этом случае нет смысла ничего считать и делить. Попробуйте еще раз.");
                } else if (countUser < 1) {
                    System.out.println("Это некорректное значение для подсчёта. Попробуйте еще раз.");
                } else {
                    return (countUser);
                }
            } else {
                System.out.println("Это не число");
            }
        }

    }

}
