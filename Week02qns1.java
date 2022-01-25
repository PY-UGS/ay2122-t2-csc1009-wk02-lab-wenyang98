import java.util.Scanner;

public class Week02qns1 {
     public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        
        System.out.print("Enter a number for radius: ");
        Double radius = input.nextDouble();
         
        Double area = PI * radius * radius;        
        System.out.println("Area = "+area);
        input.close();

    }
}
