import java.util.Scanner;

public class Goods {
    static String goodsName;
    static double goodsPrice;
    static double goodsPriceSum;

    public static void addGoods(int countUsers) {
        StringBuilder goodsList = new StringBuilder();
        goodsList.append("Добавленные товары:");
        System.out.println("Введите название товара.");
        Scanner goodsScanner = new Scanner(System.in);
        while (true) {
            goodsName = goodsScanner.nextLine();
            if (goodsName.trim().equalsIgnoreCase("Завершить")) {
                break;
            }
            System.out.println("Введите цену товара");
            while (true) {
                Scanner priceScanner = new Scanner(System.in);
                if (priceScanner.hasNextDouble()) {
                    goodsPrice = priceScanner.nextDouble();
                    if (goodsPrice < 0) {
                        goodsPrice = Math.abs(goodsPrice);
                        System.out.println("Цена преорбразована в положительное значение " + goodsPrice);
                    }
                    break;
                } else {
                    System.out.println("Цена может быть только числом ХХ,ХХ");
                }
            }
            System.out.println("Товар " + goodsName + " за " + goodsPrice + " " + rubToText(goodsPrice) + " успешно добавлен. Добавьте еще или завершите.");
            goodsList.append("\n").append(goodsName).append(" ").append(goodsPrice);
            goodsPriceSum = goodsPriceSum + goodsPrice;
        }
        System.out.println(goodsList + "\n" + "На общую сумму: " + String.format("%.2f", goodsPriceSum) + " " + rubToText(goodsPriceSum));
        System.out.println("С каждого из " + countUsers + " по " + String.format("%.2f", goodsPriceSum / countUsers) + " " + rubToText(goodsPriceSum / countUsers));
    }

    public static String rubToText(double sumRub) {
        int intRub = ((int) sumRub);
        String Rubs = "рублей";
        if (intRub % 10 == 1) {
            Rubs = "рубль";
        }
        if ((intRub % 10 >= 2) && (intRub % 10 <= 4)) {
            Rubs = "рубля";
        }
        if ((intRub % 100 >= 11) && (intRub % 100 <= 20)) {
            Rubs = "рублей";
        }
        return (Rubs);
    }

}
