package inicio.productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppProductos {

    public static void main(String[] args) {

        Map<Producto, ArrayList<String>> listaProducto = new HashMap<Producto, ArrayList<String>>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese código de producto - 0 para salir");
        String codigo = scan.next();

        while(!codigo.equals("0")) {
            Producto producto = new Producto(codigo);
            listaProducto.put(producto, new ArrayList<String>());
            System.out.println("Ingrese productos relacionados - 0 para salir");
            String productoRel = scan.next();

            while (!productoRel.equals("0")) {
                listaProducto.get(producto).add(productoRel);
                productoRel = scan.nextLine();
            }
            System.out.println("Ingrese código de producto - 0 para salir");
            codigo = scan.next();
        }
        System.out.println(listaProducto);


    }
}

