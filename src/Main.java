public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {System.out.println("Установите версию приложения для Android по ссылке");}
    }

    public static void task2 () {
        byte clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task3 () {
    int year = 2021;
    if (year % 4 == 0 )
        if (year % 100 == 0)
            if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }   else {
                System.out.println(year + " год не является високосным");
            }
        else {
            System.out.println(year + " год является високосным");
        }
    else {
            System.out.println(year + " год не является високосным");
         }
    }

    public static void task4 () {
    int deliveryDistance = 105;
    byte deliveryTime;
    if (deliveryDistance > 100)
    {System.out.println("Свыше 100 км доставки нет");}
        else if (deliveryDistance > 60) {
        System.out.println("Потребуется дней: 3");
    }
            else if (deliveryDistance > 20)
        {
            System.out.println("Потребуется дней: 2");
        }
    else {System.out.println("Потребуется дней: 1");}
    }

    public static void task5 () {
    byte monthNumber = 7;

    switch (monthNumber) {
        case 1:
        case 2:
        case 12:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Такого месяца не существует");
    }


    }
}