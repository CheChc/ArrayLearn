import java.util.Scanner;

public class MinSubArrayLen
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int i = 0;
        int j = 0;
        int sum = 0;
        int fina = 0;
        int result = nums.length + 1;
        for (j = 0; j < nums.length; j++)
        {
            sum += nums[j];
            while (sum >= target)
            {
                fina = j - i + 1;
                result = Math.min(fina, result);
                sum -= nums[i];
                i++;
            }
        }
        if (fina == 0)
            return 0;
        else
            return result;
    }

    public static void main(String[] args)
    {
        MinSubArrayLen mi = new MinSubArrayLen();
        System.out.println("请输入数组长度：");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("请输入数组：");
        int[] Array = new int[size];
        int i = 0;
        for (i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }
        System.out.println("请输入最小和：");
        int val = scanner.nextInt();
        int length = mi.minSubArrayLen(val, Array);
        System.out.println("最小长度为：" + length);
    }
}
