public class Main {
    public static void main(String[] args) {

        System.out.println("Enter two numbers:");

        int first = Integer.parseInt(args[0]);

        System.out.println("First number is: " + first);

        int second;

        second = Integer.parseInt(args[1]);

        System.out.println("Second number is: " + second);

        // add two numbers
        System.out.println("Adding two numbers");
        int sum = first + second;
        System.out.println("The sum is: " + sum);

    }
}

