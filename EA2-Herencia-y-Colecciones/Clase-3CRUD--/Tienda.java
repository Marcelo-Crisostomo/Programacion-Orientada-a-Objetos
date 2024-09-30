import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    
    //Atributos ArrayList Scanner
    private ArrayList<Producto> productos;
    //Declarar Scanner como atributo
    private Scanner scanner;

    //Constructor que inicializa la lista y scanner
    public Tienda(){
        productos = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    //método para agregar producto
    public void agregarProducto(){
        System.out.println("Ingrese el id del producto");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();
        //Crear un producto nuevo y añadirlo a la lista
        Producto producto = new Producto(id, nombre, precio);
        //Agrego a la lista
        productos.add(producto);
        System.out.println("Producto agregado correctamente");
    }


    //método para listar productos
    public void mostrarProductos(){
        //Evalúo si hay productos o no
        if(productos.isEmpty()){
            System.out.println("No hay productos agotado por cyber");
        }else{
            for(Producto producto : productos){
                System.out.println(producto);
            }
        }
    }

    //método para actualizar un producto id

    public void actualizarProducto(){
        System.out.println("Ingresa el id del producto a actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();

        //Buscar el producto por su id
        for(Producto producto : productos){
            if(producto.getIdProducto()==id){
                System.out.println("Ingrese el nuevo nombre del producto");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese el nuevo precio");
                double nuevoPrecio = scanner.nextDouble();

                //Actualizo los datos
                producto.setNombreProducto(nuevoNombre);
                producto.setPrecioProducto(nuevoPrecio);
                System.out.println("Producto actualizado");
                return;

            }
        }
        System.out.println("Producto no encontrado");
    }


    //método para Eliminar producto id
    public void eliminarProducto(){
        System.out.println("Ingresa el id del producto a eliminar");
        int id = scanner.nextInt();
        //busco en la lista
        Producto productoAEliminar = null;
        for (Producto producto : productos){
            if(producto.getIdProducto()==id){

                productoAEliminar = producto;
            }
        }
        //Eliminar el producto
        if (productoAEliminar !=null) {
            productos.remove(productoAEliminar);
            System.out.println("Producto eliminado");
        }else{
            System.out.println("Producto no encontrado");
        }    
    }




}
