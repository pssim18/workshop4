/**
 * Created by pohsheng on 20/12/2016.
 */
public class TwelveInts
{
    public static void main (String args[])
    {
        int[] numbers = {2, 4, 8, 12, 15, 29, 31, 45, 47, 49, 50, 52};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + "  ");
        System.out.println();
        for (i = numbers.length - 1; i >= 0; i--)
            System.out.print("" + numbers[i] + "  ");
        System.out.println();
    }
}
