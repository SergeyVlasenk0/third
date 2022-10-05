public class Main {
    public static void main(String[] args) {

        int initialAmount = 500;

        int addAmount = 1800;

        int bonus = addAmount > 1000 ? addAmount / 100 : 0;


        int finalAccount = initialAmount + addAmount + bonus;
        System.out.println("Итоговый счет: " + finalAccount);
        System.out.println("Бонус: " + bonus);


    }
}