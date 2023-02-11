public class BonusMilesService {

    public int calculate(int price) {
        int bonus;
        int mile = 20;
        bonus = price / mile;
        return bonus;
    }

}

