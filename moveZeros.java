import java.util.Scanner;

public class moveZeros {
    public static void moveZerosAtTheLast(int[] nums) {
        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }

        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array you want to create:");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        moveZerosAtTheLast(arr);
        System.out.println("Entered array after moving zeros at the last");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
