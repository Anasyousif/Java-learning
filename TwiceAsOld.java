public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        int ageDifference = dadYears - sonYears;
        int yearsUntilDouble = Math.abs(2 * sonYears - dadYears);
        return yearsUntilDouble;
    }

}