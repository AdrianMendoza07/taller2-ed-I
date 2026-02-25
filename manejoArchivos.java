
public class manejoArchivos {

    private static final String FILE = "clintes.csv";

    public static void listarPedidos (int idCliente) throws IQExeption{
        File file = new File("pedidos.csv");
        BufferedReader br = new BufferedReader(new FileReader (file));
        String linea;
        boolean encontrado = false;

        while ((linea = br.readeLine()) != null){
            String[] datos = linea.split (",");
            int idClienteArchivo = Interger.parseInt(datos[1]);
            int activo = Interger.parseInt(datos[5]);

            if(idClienteArchivo == idCliente && activo == 1){
                System.out.println("ID Pedido: "+ datos[0]);
                System.out.println("Producto: " + datos [1]);
                System.out.println("Precio: " + datos [2]);
                System.out.println("Cantidad: " + datos [3]);
                System.out.println("----------------------");

                encontrado = true;
            }
        }
        br.close();

        if (!encontrado){
            System.out.println("Este cliente no tiene pedidos activos");
        }
    }

}

