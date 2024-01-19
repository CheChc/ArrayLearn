//二分搜索
//格式化代码的方法：command+option+L
import java.util.Scanner;

public class BinarySearch
{
    public int search(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right)
        {
            int middle = (left + right) / 2;

            if (nums[middle] == target)
            {
                return middle;
            } else if (nums[middle] < target)
            {
                left = middle + 1;
            } else
            {
                right = middle - 1;
            }
        }

        return -1; // 如果未找到目标元素，返回 -1
    }

    public static void main(String[] args)
    {
        System.out.println("请输入一个数组大小：");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] Array = new int[size];
        System.out.println("请输入数组内容（按升序排列）：");
        for (int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }
        System.out.println("请输入你想查找的值：");
        int target = scanner.nextInt();
        BinarySearch bianrysearch = new BinarySearch();
        int result = bianrysearch.search(Array, target);
        if (result != -1)
        {
            result++;
            System.out.println("你想找的数在第 " + result + "位");
        } else
            System.out.println("Wrong!Exit");

    }
}