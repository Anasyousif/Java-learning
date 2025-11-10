public class Move {
public static int move(int position, int roll) {
        // The hero moves the number of spaces indicated by the roll two times.
        // Total distance moved = roll + roll = 2 * roll
        int distance_moved = 2 * roll;

        // The new position is the current position plus the distance moved.
        int new_position = position + distance_moved;

        return new_position;
    }


    
}
