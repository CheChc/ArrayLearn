import java.util.Scanner;

public class SortedSquared
{
    public int[] sortedSquares(int[] nums)
    {
        int left = 0, right = 0;
        int length = nums.length;
        int[] NUM = new int[length];
        left = 0;
        right = length - 1;
        while (left <= right)
        {
            if (((nums[left]) * (nums[left])) > ((nums[right]) * (nums[right])))
            {
                NUM[length - 1] = nums[left] * nums[left];
                length--;
                left++;
            } else
            {
                NUM[length - 1] = nums[right] * nums[right];
                length--;
                right--;
            }
        }
        return NUM;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组长度:");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        System.out.println("请输入数组");
        for (int i = 0; i < length; i++)
        {
            nums[i] = scanner.nextInt();
        }
        SortedSquared sort = new SortedSquared();
        int[] NUM = sort.sortedSquares(nums);
        System.out.println("新的平方和数组为");
        for (int j = 0; j < length; j++)
        {
            System.out.println(NUM[j]);
        }
    }
}

