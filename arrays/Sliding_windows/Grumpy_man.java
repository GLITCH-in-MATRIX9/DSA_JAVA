package Sliding_windows;
// leetcode question 1052
//sliding windows technique 

public class Grumpy_man {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int inital_sum = 0;
        int length = grumpy.length;
        for (int i = 0; i < length; i++) { // iterating over the grumpy man's loop
            if (grumpy[i] == 0) {
                inital_sum += customers[i]; //if the number in grumpy is 0 that means he is not grumpy and hence happy customers
            }

        }
        int maxAdditionalSatisfied = 0;
        int currentAdditionalSatisfied = 0;

        // initial sum for first window
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                currentAdditionalSatisfied += customers[i]; //if the man is grumpy then the owner will apply trick and make customers happy

            }

        }
        maxAdditionalSatisfied += currentAdditionalSatisfied;  //just update the max to be this right now

        // sliding window across the array
        for (int i = minutes; i < length; i++) {
            if (grumpy[i] == 1) {
                currentAdditionalSatisfied += customers[i];

            }
            if (grumpy[i - minutes] == 1) {
                currentAdditionalSatisfied -= customers[i - minutes];  //checking grumpy one by one 

            }
            maxAdditionalSatisfied = Math.max(maxAdditionalSatisfied, currentAdditionalSatisfied);

        }

        return inital_sum + maxAdditionalSatisfied;
        
    }

    public static void main(String[] args) {
        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes = 3;

        int result = maxSatisfied(customers, grumpy, minutes);
        System.out.println(result);
    }

}
