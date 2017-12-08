import java.util.Scanner;

public class Try {
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Entetr your 1st number: ");
            int num1 = input.nextInt();
            System.out.println("Enter your 2nd number: ");
            int num2 = input.nextInt();

            System.out.println("Number1/Number2 = "+num1/num2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
