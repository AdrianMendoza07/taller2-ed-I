import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija su opcion:");
        int opcion = sc.nextInt();

        while(opcion != 6){

            switch (opcion) {
                case 5:
                    System.out.println("Ingrese el ID del cliente deseado: ");
                    int idCliente = sc.nextInt();
                    listarPedidos(idCliente);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    throw new AssertionError();
            }
            
        }

    }
}