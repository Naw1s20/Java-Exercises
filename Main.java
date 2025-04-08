import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String descripcion, nombre, apellido, fabricante, nombreP;
        int precio;
        OrdenCompra[] ordenesCompras = new OrdenCompra[3];


        for (int i = 0; i<3; i++){
            System.out.println("introduzca los datos de la "+ (i+1)+ " factura");
            System.out.println("Describa para quien es la factura");
            descripcion = sc.nextLine();
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("apellido: ");
            apellido = sc.nextLine();
            Cliente cliente = new Cliente(nombre, apellido);
            Date fecha = new Date();
            OrdenCompra ordenCompra = new OrdenCompra(descripcion, fecha, cliente);



            for (int j = 0; j<4; j++){
                System.out.print("Nombre producto: ");
                nombreP = sc.nextLine();
                System.out.print("Fabricante: ");
                fabricante = sc.nextLine();
                System.out.println("Precio:  ");
                precio =sc.nextInt();
                sc.nextLine();

                Producto producto = new Producto(fabricante, nombreP, precio);
                ordenCompra.addProducto(producto);


            }
            ordenesCompras[i] = ordenCompra;





        }
        for (int i = 0; i< ordenesCompras.length; i++){
            String resumen = "La factura n: " + ordenesCompras[i].getIdentificador();
            resumen += " es de: " + ordenesCompras[i].getCliente().toString() + " ";
            for (int j = 0; j< ordenesCompras[i].getProductos().length; j++){
                resumen += ordenesCompras[i].getProductos()[j].toString();
            }
            resumen += "lo cual suma un total de: " + ordenesCompras[i].montoFinal(ordenesCompras[i].getProductos());

            System.out.println(resumen);
        }


    }
}