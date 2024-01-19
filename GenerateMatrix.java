import java.util.Scanner;

public class GenerateMatrix
{
    public int[][] generateMatrix(int n)
    {
        int[][] matrix = new int[n][n];
        int startx = 0;
        int starty = 0;
        int round = 1;
        int key = 1;
        int i = 0, j = 0;
        int offset = 1;
        if ((n / 2) * 2 != n)
        {
            matrix[n / 2][n / 2] = n * n;
        }
        while (round <= n / 2)
        {
            for (j = startx; j < n - offset; j++)
            {
                matrix[startx][j] = key;
                key++;
            }
            for (i = starty; i < n - offset; i++)
            {
                matrix[i][j] = key;
                key++;
            }
            for (j = n - offset; j > startx; j--)
            {
                matrix[i][j] = key;
                key++;
            }
            for (i = n - offset; i > starty; i--)
            {
                matrix[i][j] = key;
                key++;
            }
            startx++;
            starty++;
            round++;
            offset++;
        }
        return matrix;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        GenerateMatrix gm = new GenerateMatrix();
        int[][] num = gm.generateMatrix(size);
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }

}
