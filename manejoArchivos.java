
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class manejoArchivos {

    private static final String FILE = "clintes.csv";

    public static List<cliente> leerClientes()
            throws IOException {
        List<cliente> lista = new ArrayList<>();
        Scanner sc = new Scanner(new File("usuarios.txt"));

        while (sc.hasNextLine()) {
            String[] datos = sc.nextLine().split(",");
            lista.add(new Usuario(
                    Integer.parseInt(datos[0]),
                    datos[1],
                    datos[2],
                    Integer.parseInt(datos[3]),
                    Integer.parseInt(datos[4])
            ));
        }
        sc.close();
        return lista;
    }

    public static void eliminarCliente(int id)
            throws IOException {

        List<cliente> lista = leerClientes();
        BufferedWriter bw
                = new BufferedWriter(new FileWriter("clientes.csv"));

        for (cliente u : lista) {
            if (u.getId() == id) {
                u.setActive(false);
            }
            bw.write(u.toString());
            bw.newLine();
        }
        bw.close();
    }

    public static void crearPedido(pedido pedido)
            throws IOException {
        FileWriter fw = new FileWriter("pedidos.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(pedido.toString());
        bw.newLine();
        bw.close();
    }
}
