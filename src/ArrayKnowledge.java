import java.util.Arrays;
import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray()));
        System.out.println(Arrays.toString(generateArrayWithBounds()));
    }

    public static String[] stringToArray() {
        Scanner string = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = string.nextLine();

        String[] arrayString = new String[input.length()];

        for (int i = 0; i < input.length(); i++)
            arrayString[i] = input.substring(i, (i + 1));


        return arrayString;
    }

    public static int[] generateArrayWithBounds() {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Enter a starting number: ");
        int start = numbers.nextInt();
        System.out.println("Enter an ending number: ");
        int end = numbers.nextInt();
        System.out.println("Enter a number to count by: ");
        int step = numbers.nextInt();

        int arrayLength = ((end - start) / (step));
        int[] array = new int[arrayLength];

        for (int i = 0; i < (arrayLength); i++) {
            array[i] = start;
            start = start + step;
        }
        return array;

    }
}