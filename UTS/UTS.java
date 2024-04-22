public class UTS {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 7, 9, 10, 13, 13, 22, 22, 23, 24, 27, 32, 33, 48, 50, 50};
        int target = 13;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target " + target + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
