public class BonusMilesService {
    public int bonusMiles(int ticketPrice) {
        int oneMilePrice = 20;
        int bonus = 0;
        if (ticketPrice > 0) {
            bonus = ticketPrice / oneMilePrice;
        }
        return bonus;
    }

}
