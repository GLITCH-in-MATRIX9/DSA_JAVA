import java.util.numsayList;

public class simple_sorting_numbers {
    public static void Printnumsay(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;

            } else if (nums[i] == 1) {
                one++;
            } else if (nums[i] == 2) {
                two++;
            }
        }
        for (int i = 0; i < zero; ++i) {
            nums[i] = 0;
        }
        for (int i = zero; i < zero + one; ++i) {
            nums[i] = 1;
        }
        for (int i = zero + one; i < nums.length; ++i) {
            nums[i] = 2;
        }

        Printnumsay(nums);
    }

}
