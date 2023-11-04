import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {

        System.out.println(greenTicket());
        System.out.println(makeChocolate());
    }

    public static int greenTicket() {
        Scanner ticketNumbers = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int number1 = ticketNumbers.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = ticketNumbers.nextInt();
        System.out.println("Enter number 3: ");
        int number3 = ticketNumbers.nextInt();

        int[] ticket = new int[3];

        ticket[0] = number1;
        ticket[1] = number2;
        ticket[2] = number3;
        int result;

        if (ticket[0] == ticket[1] && ticket[1] == ticket[2])
            result = 20;
        else if (ticket[0] == ticket[1] || ticket[1] == ticket[2] || ticket[0] == ticket[2])
            result = 10;
        else
            result = 0;

        return result;

    }

    public static int makeChocolate() {
        Scanner pounds = new Scanner(System.in);

        System.out.println("How many 1 pound chocolate bars do we have? ");
        int small = pounds.nextInt();
        System.out.println("How many 5 pound chocolate bars do we have? ");
        int large = pounds.nextInt();
        System.out.println("How many pounds of chocolate do we need to sell? ");
        int goal = pounds.nextInt();

        int smallBarsToUse = goal - (large * 5);

        if (goal == (smallBarsToUse + (large * 5)) && smallBarsToUse <= small)
            return smallBarsToUse;
        else
            return -1;


    }
}
