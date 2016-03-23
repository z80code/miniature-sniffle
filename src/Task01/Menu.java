package Task01;

import java.util.Scanner;

/**
 * Created by Scorpion on 23.03.2016.
 */
/*
 * Вывод сообщений меню в консоль
 */
class Menu {

    private int choose() {
        int rezult = -1;
        try {
            System.out.print(" Выберите действие (0 - Выход) -> ");
            Scanner scan = new Scanner(System.in);
            rezult = scan.nextInt();
        } catch (Exception e) {
            System.out.println(" Это целочисленное значение!");
        }
        return rezult;
    }

    public int mainMenu(int baseSize) {
        int mode0;
        System.out.format("В базе записей - %d\n", baseSize);
        System.out.print("\n 1. Добавить запись.\n 2. Вывести записи.\n 3. Поиск по атрибуту.\n 4. Удаление по атрибуту.\n 5. Сортировать по атрибуту.\n 6. Править атрибут записи.\n");
        do {
            mode0 = choose();
            if (mode0 < 0 && mode0 > 6) {
                System.out.format(" %d - Нет такого действия!\n", mode0);
            }
        } while (mode0 < 0 && mode0 > 6);
        return mode0;
    }

    public int findMenu() {
        int mode0;
        System.out.print("\n Поиск по атрибуту.\n");
        System.out.print("\n 1. Номеру ID.\n 2. Имени.\n 3. Фамилии.\n 4. Номеру телефона.\n 5. Типу телефона.\n 6. Отношению к Вам.\n");
        do {
            mode0 = choose();
            if (mode0 < 0 && mode0 > 6) {
                System.out.format(" Нет такого действия!\n");
            }
        } while (mode0 < 0 && mode0 > 6);
        return mode0;
    }

    public int sortMenu() {
        int mode0;
        System.out.print("\n Сортировка по атрибуту.\n");
        System.out.print("\n 1. Номеру ID.\n 2. Имени.\n 3. Фамилии.\n 4. Номеру телефона.\n 5. Типу телефона.\n 6. Отношению к Вам.\n");
        do {
            mode0 = choose();
            if (mode0 < 0 && mode0 > 6) {
                System.out.format(" Нет такого действия!\n");
            }
        } while (mode0 < 0 && mode0 > 6);
        return mode0;
    }

    public int changeMenu() {
        int mode0;
        System.out.print("\n Изменить атрибут.\n");
        System.out.print("\n 1. Номер ID.\n 2. Имя.\n 3. Фамилию.\n 4. Номер телефона.\n 5. Тип телефона.\n 6. Отношениe к Вам.\n");
        do {
            mode0 = choose();
            if (mode0 < 0 && mode0 > 6) {
                System.out.format(" Нет такого действия!\n");
            }
        } while (mode0 < 0 && mode0 > 6);
        return mode0;
    }

    public int selectMenu() {
        int mode0;
        System.out.print("\n Выберите запись указав ID.\n");
        do {
            mode0 = choose();
            if (mode0 < 0 && mode0 > 6) {
                System.out.format(" Нет такого действия!\n");
            }
        } while (mode0 < 0 && mode0 > 6);
        return mode0;
    }
}