import java.util.*;

public class Input {
    public static void main(String args[]) {
        // Scanner firstletter = new Scanner(System.in);
        // String input = firstletter.next();
        // System.out.println(input);

        // Scanner fullletter = new Scanner(System.in);
        // String name = fullletter.nextLine();
        // System.out.println(name);

        /*
         * Scanner age = new Scanner(System.in);
         * int ageInput = age.nextInt();
         * System.out.println(ageInput);
         */

        // Scanner result = new Scanner(System.in);
        // float resultInput = result.nextFloat();
        // System.out.println(resultInput);

        // Scanner population = new Scanner(System.in);
        // double populationInput = population.nextDouble();
        // System.out.println(populationInput);


        // Scanner brave = new Scanner(System.in);
        // boolean barveInput = brave.nextBoolean();
        // System.out.println(barveInput);



        // Scanner name = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String nameInput = name.nextLine();
        // System.out.println("Hello, " + nameInput);
        // name.close();

        // Scanner age = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int ageInput = age.nextInt();
        // System.out.println("Your age is: " + ageInput);
        // age.close();

        // Scanner jor = new Scanner(System.in);
        // int a = jor.nextInt();
        // int b = jor.nextInt();
        // int sum = a + b;
        // System.out.println("The Sum Of two Number is : "+ sum);

        
        // Scanner gunna = new Scanner(System.in);
        // int a = gunna.nextInt();
        // int b = gunna.nextInt();
        // int product = a * b;
        // System.out.println("The multiplications of two Number is : " + product);


        Scanner circle = new Scanner (System.in);
        float rad = circle.nextFloat();
        float area = 3.14f * rad * rad; //3.14f -> (f)is a sign of its a float value
        System.out.println(area);
        circle.close();
    }
}
