public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // сумма на счету
        int addend = 1200; // пополнение счета

        int bonus = 0;
        if (addend > 1000) { // бонус дается за сумму выше 1000
            bonus = addend / 100; // бонус дается за каждые 100 руб
        }
        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итого:" + finalBalance);
        System.out.println("Бонус руб.: " + bonus);
    }
}