package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.getInstance();
        ArrayList arrayList = new ArrayList<>();
        logger.log("Привет!");
        logger.log("Введите размер списка: ");
        String inputListSize = scanner.nextLine();
        int listSize = Integer.parseInt(inputListSize);
        logger.log("Введите верхнюю границу для значений: ");
        String inputMaxValue = scanner.nextLine();
        int maxValue = Integer.parseInt(inputMaxValue);
        for (int i = 0; i < listSize; i++) {
            arrayList.add(random.nextInt(maxValue));
        }

        logger.log(" Введите порог для фильтра: ");
        Filter filter = new Filter(Integer.parseInt(scanner.next()));
        logger.log(filter.filterOut(arrayList).toString());
        scanner.close();
    }
}