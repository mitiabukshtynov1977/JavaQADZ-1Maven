public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int amount=5_000;
        boolean registered = true;
        int bonus;
        bonus = service.calcBonus (amount,registered);
        System.out.println(bonus);


    }

}

