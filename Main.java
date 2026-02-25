import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija su opcion:");
        int opcion = sc.nextInt();

        while (opcion != 6) {

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su ID: ");
                    id = sc.nextLine();
                    System.out.println("Ingrese su Nombre: ");
                    name = sc.nextLine();
                    System.out.println("Ingrese su Apellido: ");
                    lastname = sc.nextLine();
                    System.out.println("Ingrese su Numero de celular: ");
                    phone = sc.nextLine();
                    cliente cliente = new cliente();
                    cliente.Usuario(id, name, lastname, phone, true);

                    registrarCliente(cliente);
                    break;
                case 2:
                    leerClientes();
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}