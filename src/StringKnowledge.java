import java.util.Scanner;
public class StringKnowledge {
    public static void main(String[] args) {
    System.out.print(endOther());
    }

    public static boolean endOther(){
        Scanner stringInput = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String string1 = stringInput.nextLine();
        System.out.println("Enter string 2: ");
        String string2 = stringInput.nextLine();

        boolean answer;

        if (string1.contains(string2))
            answer = true;
        else if (string1.contains(string2.toLowerCase()))
            answer = true;
        else if (string2.contains(string1))
            answer = true;
        else if (string2.contains(string1.toLowerCase()))
            answer = true;
        else
            answer = false;

        return answer;
    }
    public static void findRepeats(){
        Scanner stringInput = new Scanner(System.in);

        System.out.println("Enter a string to test: ");
        String toTest = stringInput.nextLine();
    }

    }
