public class SeasonDemo {

    public enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Flowers are blooming!");
                break;
            case SUMMER:
                System.out.println("Time for the beach!");
                break;
            case FALL:
                System.out.println("Leaves are falling!");
                break;
            case WINTER:
                System.out.println("It’s snowing outside!");
                break;
            default:
                System.out.println("Unknown season.");
        }
    }

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.print(s + ": ");
            printSeasonMessage(s);
        }
    }
}
