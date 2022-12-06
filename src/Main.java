public class Main {
    public static void main(String[] args) {

        int account = 1100;
        int payment = 1002;

        int bonus;
        if (payment >= 1002) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        // int bonus = payment <= 1000 ? 0 : payment / 100;

        int balance = account + bonus + payment;

        System.out.println("Начислено " + bonus + "бонусных рублей");
        System.out.println("Спасибо за пополнение! На вашем счету: " + balance + " рублей");

    }
}
