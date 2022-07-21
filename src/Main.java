public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2");
        int account = 100;
        System.out.println("У Вас на счету:" + account + "руб.");
        int depositAmount = 1100;
        System.out.println("Пополнение счета на:" + depositAmount + "руб.");
        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        }  else {
            bonus = 0;
        }
        int balans = account + depositAmount + bonus;
        System.out.println("Начислено:" + bonus + "бонусных руб.");
        System.out.println("Ваш счет с учетом бонусов:" + balans + "руб.");
    }
}
