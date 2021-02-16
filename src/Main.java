import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scr = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int listSize = scr.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scr.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> source = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            source.add(rnd.nextInt(maxValue));
        }
        System.out.print("Вот случайный список: " + source + "\n");

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scr.nextInt();

        logger.log(" Запускаем фильтрацию");

        Filter filter = new Filter(treshold);
        List<Integer> resultList = filter.filterOut(source);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список:");
        System.out.println(resultList);
        logger.log("Завершаем программу");
    }
}
