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
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else {
            System.out.println("Неопознаная операционная система.");
        }
        //Задание 3
        System.out.println("Задание 3.");

        int year = 2024;
        if (year > 1584) {
             if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Високосный год.");
                }
            else {
                System.out.println("Невисокосный год.");
            }
        }

        //Задание 4
        System.out.println("Задание 4.");

        int deliveryDistance = 20;
                if (deliveryDistance > 0 && deliveryDistance < 20) {
                    System.out.println("Потребуется день доставки.");
                }
                else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
                    System.out.println("Потребуется 2 дня доставки.");
                }

                else if (deliveryDistance > 60 && deliveryDistance < 100 ) {
                    System.out.println("Потребуется 3 дня доставки.");
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