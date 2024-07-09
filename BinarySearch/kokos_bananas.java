package BinarySearch;

public class kokos_bananas {
    public static int minimumRateToEatBananas(int[] arr, int hours) {
        for (int rate = 1; rate <= getMax(arr); rate++) {
            long numbers_sum = 0;
            for (int j = 0; j < arr.length; j++) {
                long number = (arr[j] + rate - 1) / rate; // Equivalent to Math.ceil((double)arr[j] / rate)
                numbers_sum += number;
            }
            if (numbers_sum <= hours) {
                return rate;
            }
        }
        return -1;
    }

    private static int getMax(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
