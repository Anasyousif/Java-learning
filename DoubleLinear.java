import java.util.*;

class DoubleLinear {

    public static int dblLinear(int n) {
        // We use two queues to track the next values for 2*x+1 and 3*x+1
        Queue<Integer> yQueue = new LinkedList<>();
        Queue<Integer> zQueue = new LinkedList<>();

        int x = 1;  // initial value
        int result = 1;

        yQueue.add(3); // 2*1 + 1
        zQueue.add(4); // 3*1 + 1

        for (int i = 0; i < n; i++) {
            // Get the minimum of the two front elements
            int nextY = yQueue.peek();
            int nextZ = zQueue.peek();

            // Next smallest element in sequence
            result = Math.min(nextY, nextZ);

            // Remove used value(s)
            if (result == nextY) yQueue.poll();
            if (result == nextZ) zQueue.poll();

            // Generate new values based on current result
            yQueue.add(2 * result + 1);
            zQueue.add(3 * result + 1);
        }

        return result;
    }
}
