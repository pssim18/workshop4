/**
 * Created by pohsheng on 20/12/2016.
 */
import java.util.Scanner;
public class CountByAnything {
    public static void main(String[]  args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to count by: ");
        int num = in.nextInt();
        int count = num + 9;

        for (int i = num; i < 300; i ++ ) {
            if (i == count) {
                System.out.print(i + "\n");
                count += 10;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
