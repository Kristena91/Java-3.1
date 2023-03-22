public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int miles = service.bonusMiles(10000);
        System.out.println(miles);

    }
}