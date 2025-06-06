import java.util.*;

public class PickPeaks {
    
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result = new HashMap<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        
        int possiblePeakPos = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                // Start of a new peak or plateau
                possiblePeakPos = i;
            } else if (arr[i] < arr[i - 1] && possiblePeakPos != -1) {
                // Confirm the peak after plateau ends with a drop
                pos.add(possiblePeakPos);
                peaks.add(arr[possiblePeakPos]);
                possiblePeakPos = -1; // Reset
            }
            // If arr[i] == arr[i-1], we're in a plateau and do nothing
        }

        result.put("pos", pos);
        result.put("peaks", peaks);
        return result;
    }
}

