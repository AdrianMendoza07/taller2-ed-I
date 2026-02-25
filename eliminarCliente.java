
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class eliminarCliente{

        private static final String FILE = "usuarios.txt";


    public static List<cliente> leerUsuarios() 
throws IOException {
    List<cliente> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("usuarios.txt"));

    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new cliente(
            Integer.parseInt(datos[0]),
            datos[1],
            datos[2]));
    }
    sc.close();
    return lista;
}

    public static void eliminarClienteUsuario(int id) 
throws IOException {

    List<Cliente> lista = leerCliente();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("usuarios.txt"));

    for (Cliente u : lista) {
        if (u.getId() == id) {
            u.setNombre(nuevoNombre);
            u.setEmail(nuevoEmail);
        }
        bw.write(u.toString());
        bw.newLine();
    }
    bw.close();
}
}