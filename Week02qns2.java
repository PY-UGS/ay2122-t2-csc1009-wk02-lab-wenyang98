import java.util.Scanner;

public class Week02qns2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float firstnumber = input.nextFloat();
        float secondnumber = input.nextFloat();
        float thirdnumber = input.nextFloat();
        float average = (firstnumber + secondnumber + thirdnumber)/3;
        System.out.println("The average of " + firstnumber + " " + secondnumber + " " + thirdnumber + " is " + average);
        input.close();
    }
}
