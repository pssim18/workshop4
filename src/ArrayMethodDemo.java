/**
 * Created by pohsheng on 20/12/2016.
 */
public class ArrayMethodDemo {
    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args){
        display(numbers);
        displayReverse(numbers);
        System.out.print("\nThe sum of the integers: " + totalSum(numbers));
        displayLimitingArgs(3, numbers);
        findNumber(numbers);
    }

    public static void display(int[] numbers) {
        System.out.print("All the integers: ");
        for (int number: numbers ){
            System.out.print(number + " ");
        }
    }

    public static void displayReverse(int[] numbers){
        System.out.print("\nIntegers in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; --i){
            System.out.print(numbers[i] + " ");
        }
    }

    public static int totalSum(int[] numbers){
        int total = 0;
        for (int number: numbers){
            total += number;
        }
        return total;
    }

    public static void displayLimitingArgs(int arg, int[] numbers){
        System.out.print("\nDisplaying values less than a limiting arguments: ");
        for (int number: numbers) {
            if (number < arg) {
                System.out.print(number + " ");
            }
        }
    }

    public static void findNumber(int[] numbers){
        int total = totalSum(numbers);
        int mean = total/numbers.length;

        System.out.print("\nValues that are higher than average: ");
        for (int number: numbers){
            if (number > mean){
                System.out.print(number + " ");
            }
        }
    }
}