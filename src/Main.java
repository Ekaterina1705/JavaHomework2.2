public class Main {

    public static void main(String[] args) {

        int account = 700;
        int payment = 1200;

        int bonus;
        if (payment >= 1200) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int balance = account + bonus + payment;

        System.out.println("Начислено " + bonus + "бонусных рублей");
        System.out.println("Спасибо за пополнение! На вашем счету: " + balance + " рублей");

    }
}
