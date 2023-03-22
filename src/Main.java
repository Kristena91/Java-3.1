public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        System.out.println();
        System.out.println("ticketPrice = 0");
        System.out.println(service.bonusMiles(0));
        System.out.println();
        System.out.println("ticketPrice = 863");
        System.out.println(service.bonusMiles(863));
        System.out.println();
        System.out.println("ticketPrice = - 10");
        System.out.println(service.bonusMiles(-10));

    }
}