
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija su opcion:");
        int opcion = sc.nextInt();

        while (opcion != 6) {

            switch (opcion) {

                case 3:
                    System.out.println("Ingrese el id del cliente a eliminar:");
                    int id = sc.nextInt();
                    try {
                        manejoArchivos.eliminarCliente(id);
                    } catch (Exception e) {
                        System.out.println("Error al eliminar cliente: " + e.getMessage());
                    }
                    break;
                    
                case 4:
                    System.out.println("Ingrese el id del producto:");
                    int idProducto = sc.nextInt();
                    System.out.println("Ingrese el id del cliente:");
                    int idCliente = sc.nextInt();
                    System.out.println("Ingrese el nombre del producto:");
                    String producto = sc.next();
                    System.out.println("Ingrese el precio del producto:");
                    float precio = sc.nextFloat();
                    System.out.println("Ingrese la cantidad del producto:");
                    int cantidad = sc.nextInt();
                    pedido pedido = new pedido();
                    pedido.pedido(idProducto, idCliente, producto, precio, cantidad, true);
                    try {
                        manejoArchivos.crearPedido(pedido);
                    } catch (Exception e) {
                        System.out.println("Error al crear pedido: " + e.getMessage());
                    }

                case 6:

                    break;
                default:
                    throw new AssertionError();
            }
        }

    }
}
