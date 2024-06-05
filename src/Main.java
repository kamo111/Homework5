public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1.");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Неопознаная операционная система.");
        }
        //Задание 2
        System.out.println("Задание 2.");

        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
            else
                System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1) {

            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
            else
                System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Неопознаная операционная система.");
        }
        //Задание 3
        System.out.println("Задание 3.");

        int year = 2021;
        boolean leapYear = false;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        leapYear = true;
                }
            else {
                leapYear = false;
            }
        }
        if (!leapYear) {
            System.out.println("Невисокосный год.");
        }
        else{
                System.out.println("Bисокосный год.");
            }
        //Задание 4
        System.out.println("Задание 4.");

        int deliveryDistance = 95;
        int day = 0;
                if (deliveryDistance == 20) {
                    day =  1;
                    System.out.println("Потребуется дней: " + day);
                }
                else if (deliveryDistance > 20 && deliveryDistance < 60 ) {
                    day = 2;
                    System.out.println("Потребуется дней: " + day);
                }

                else if (deliveryDistance > 60 && deliveryDistance < 100 ) {
                    day = 3;
                    System.out.println("Потребуется дней: " + day);
                }
                else
                System.out.println("Доставки нет.");
        //Задание 5
        System.out.println("Задание 5.");

        int monthNumber = 12;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень.");
                    break;
                default:

            }
        }
        else
            System.out.println("Номер месяца больше 12");

    }
}