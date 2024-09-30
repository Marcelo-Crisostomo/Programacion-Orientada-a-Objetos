import java.util.Scanner;

public class Main {
    public static void main(String[] args) {     
        //Crear un instancia de la tienda para gestionar los productos
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        //Menú principal
        do {
            System.out.println("\n Menú de la tienda");
            System.out.println("1 - Agregar");
            System.out.println("2 - Mostrar");
            System.out.println("3 - Actualizar");
            System.out.println("4 - Eliminar");
            System.out.println("5 - salir");
            System.out.println("selecciona");
            opcion = scanner.nextInt();
            //Procesar la opción
            switch(opcion){
                case 1:
                    tienda.agregarProducto();
                    break;
                case 2:
                    tienda.mostrarProductos();
                    break;
                case 3:
                    tienda.actualizarProducto();
                    break;
                case 4:
                    tienda.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema....");
                    return;
                default:
                    System.out.println("Ingresa una opción correcta");
            }
        } while(opcion!=5);


    }
}
