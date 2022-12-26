import java.util.Scanner;

public class goods {

    static String goodsName;
    static double goodsPrice;
    static String goodsList;
    static double goodsPriceSum;


    public static void addGoods(int countUsers) {
        Scanner scanner = new Scanner(System.in);
        goodsList = "Добавленные товары:";
        System.out.println("Введите название товара.");
        while (true) {
            goodsName = scanner.next();
            if (goodsName.equalsIgnoreCase("Завершить") ) {break;}
            System.out.println("Введите цену товара");
            goodsPrice = scanner.nextDouble();
            System.out.println("Товар " + goodsName + " за " + goodsPrice + " " + rubToText(goodsPrice) + " успешно добавлен. Добавьте еще или завершите." );
            goodsList = goodsList + "\n" + goodsName + " " + goodsPrice;
            goodsPriceSum = goodsPriceSum + goodsPrice;
            }
        System.out.println(goodsList + "\n" + "На общую сумму: " + String.format("%.2f", goodsPriceSum) + " " + rubToText(goodsPriceSum));
        System.out.println("С каждого из " + countUsers + " по " + String.format("%.2f",goodsPriceSum/countUsers) + " " + rubToText(goodsPriceSum/countUsers));
        //String.format("%.2f", double);
    }

    public static String rubToText(double sumRub){
        if (sumRub<2) { return("рубль");
        } else if (sumRub>5) { return("рублей");
        } else { return("рубля");  }

    }

}
