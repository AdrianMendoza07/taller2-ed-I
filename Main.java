import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija su opcion:");
        int opcion = sc.nextInt();

        while(opcion != 6){

            switch (opcion) {
                case 6:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}