/**
 * Created by pohsheng on 20/12/2016.
 */
public class CountByThree {
    public static void main(String[] args) {
        for (int i = 0; i <= 300; i+=3) {
            if ((i%30) == 0) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
