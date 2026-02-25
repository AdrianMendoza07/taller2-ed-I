
public class manejoArchivos {

    private static final String FILE = "clintes.csv";

    public static void registrarCliente(cliente cliente)
            throws IOException {
        FileWriter fw = new FileWriter("clientes.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(cliente.toString());
        bw.newLine();
        bw.close();

    }

    public static List<cliente> leerClientes()
            throws IOException {
        List<cliente> lista = new ArrayList<>();
        Scanner sc = new Scanner(new File("clientes.csv"));

        while (sc.hasNextLine()) {
            String[] datosc = sc.nextLine().split(",");
            lista.add(new cliente(
                    Integer.parseInt(datosc[0]),
                    datosc[1],
                    datosc[2],
                    datosc[3],
                    datosc[4]));
        }
        sc.close();
        return lista;
    }

}
