public class Bob {
  /**
   * Calculates the number of people a bus cannot take.
   *
   * @param cap  The maximum capacity of the bus.
   * @param on   The number of people currently on the bus.
   * @param wait The number of people waiting to get on the bus.
   * @return The number of passengers left behind.
   */
  public static int enough(int cap, int on, int wait) {
    // Calculate the number of available seats on the bus.
    int availableSeats = cap - on;

    // Determine if there is enough space for everyone waiting.
    if (availableSeats >= wait) {
      // If there is enough space, all waiting passengers can get on.
      return 0;
    } else {
      // If not, calculate how many passengers are left behind.
      return wait - availableSeats;
    }
  }
}
