import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        List<Integer> output = new ArrayList<>();

        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    output.add(value);
                    break;
                // No-op for any other characters
            }
        }

        // Convert List<Integer> to int[]
        return output.stream().mapToInt(i -> i).toArray();
    }
}
