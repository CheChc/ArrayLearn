//移除数组中的元素

import java.util.Scanner;

public class RemoveElements
{
    public int removeElement(int[] nums, int val)
    {
        int i = 0, j = 0;
        for (i = 0, j = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args)
    {
        RemoveElements re = new RemoveElements();
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
        System.out.println("请输入你想删除的元素：");
        int val = scanner.nextInt();
        int length = re.removeElement(Array, val);
        System.out.println("新的数组为：");
        for (i = 0; i < length; i++)
        {
            System.out.print(Array[i]);
        }
    }
}
