public class Main {
    public static void main(String[] args) {
        int clientMoney = 100;
        int depositMoney = 900;

        int totalBonus = depositMoney / 100;

        if (depositMoney >= 1000) {
            int totalMoney = clientMoney + depositMoney + totalBonus;

            System.out.println("Итоговый счёт " + totalMoney);
            System.out.println("Бонусных рублей " + totalBonus);

        } else if (depositMoney <= 999) {
            int totalBonusMin = 0;
            int totalMoney = clientMoney + depositMoney + totalBonusMin;

            System.out.println("Итоговый счёт " + totalMoney);
            System.out.println("Бонусных рублей " + totalBonusMin);
        }
    }
}

