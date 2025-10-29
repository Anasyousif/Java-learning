public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce(0, (accumulator, bit) -> (accumulator << 1) | bit);
   
    }
}
