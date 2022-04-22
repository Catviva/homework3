public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

            // Exercise 1

       int clientOs = 0;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else
            if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }




          // Exercise 2


    int os = 1;
    int clientDeviceYear = 2013;

        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else
            if (os == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else
            if (os == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }


            // Exercise 3


    int year = 2034;

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");

            }else
                System.out.println(year + " год не является високосным");

    //Exercise 4

    int deliveryDistance = 95;
    int deliveryTime = 1;

    if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: " + deliveryTime);

    }else
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1) );

        } else
            if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + (deliveryTime +1+1));

    //Exercise 5

    int monthNumber = 12;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println(monthNumber + " принадлежит к сезону зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println(monthNumber + " принаадлежит к сезону весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(monthNumber + " принадлежит к сезону лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println(monthNumber + "принаадлежит к сезону осень");
            break;
        default:
            System.out.println("Такого месяца не существует");


    }
    }

    }}





