package ar.com.lautaro.test;

import ar.com.lautaro.clases.Empleados;
import ar.com.lautaro.clases.Productos;
import java.util.*;

public class testStreams{

    public static void main(String[] args) {

        List<Productos> producto = new ArrayList<>();

        producto.add(new Productos("Shampo", 300));
        producto.add(new Productos("Quita Manchas", 250));
        producto.add(new Productos("Queso", 220));
        producto.add(new Productos("Sabora", 90));
        producto.add(new Productos("Lavandina", 280));
        producto.add(new Productos("Jabon", 150));
        producto.add(new Productos("Detergente", 90));

        List<Empleados> empleado = new ArrayList<>();

        empleado.add(new Empleados(2, "Marcos"));
        empleado.add(new Empleados(3, "Jeremias"));
        empleado.add(new Empleados(3, "Lautaro"));
        empleado.add(new Empleados(4, "Jose"));
        empleado.add(new Empleados(8, "Candela"));
        empleado.add(new Empleados(7, "Silvia"));
        empleado.add(new Empleados(4, "Veronica"));
        empleado.add(new Empleados(1, "Julieta"));

        // 1) 
        // MOSTRAR la lista de empleados ordenada por nombres 
        // cargar una lista de economicos con los productos ordendos por precio ascendente
        testUno(empleado, producto);
        // 2) 
        // Para la lista de productos mostrar todos los que tengan un nombre  que empieze con "q" sin importar si es mayuscula o minuscula
        // Para la lista de empleados cargar una coleccion sin repeticiones con los empleados cuyo nombres empiezen con J 
        // y mostrar  la lista
//        testDos(producto);
        //3)
        //Generar una lista con el nombre+ProydesaEmpleado  para todos los empleados de la lista 
        //
        //Mostrar una lista de los precios con un 10% de interes sobre los mismos
//        testTres(empleado, producto);
        // 4)
        // Ingresar por teclado el nombre de un empleado y regresar un true si se encuentra en la lista
//        testCuatro(empleado);
        // 5)
        // Mostrar los primeros 3 productos mas caros (Mostrar los más caros, estou mostrando los 3 primeros) 
//        testCinco(producto);
    }

    public static void testUno(List<Empleados> empleado, List<Productos> producto) {
        System.out.println("Lista ordenada por nombres: ");
        System.out.println("---------------------------------------------------");
        empleado.stream().sorted((Empleados o1, Empleados o2) -> o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase())).forEach(System.out::println);
        System.out.println("\nLista ordenada por precios de forma ascendente: ");
        System.out.println("---------------------------------------------------");
        producto.stream().sorted().forEach(System.out::println);
    }

    public static void testDos(List<Productos> producto) {
        producto.stream().filter(x -> x.getNombre().toLowerCase().startsWith("q".toLowerCase())).forEach(System.out::println);
//        empleado.stream().filter(x -> x.getNombre().startsWith("J")).forEach(System.out::println);
        Set<Empleados> empleadoSet = new HashSet<>();
        empleadoSet.add(new Empleados(2, "Javier"));
        empleadoSet.add(new Empleados(3, "Juan"));
        empleadoSet.add(new Empleados(2, "Javier"));
        empleadoSet.add(new Empleados(4, "Julieta"));
        empleadoSet.add(new Empleados(9, "jazmín"));
        empleadoSet.add(new Empleados(3, "Juan"));
        empleadoSet.add(new Empleados(5, "Macarena"));
        System.out.println("--------------------------------------------\n");
        empleadoSet.stream().filter(x -> x.getNombre().startsWith("J")).forEach(System.out::println);
    }

    public static void testTres(List<Empleados> empleado, List<Productos> producto) {
        empleado.stream().map(x -> x.getNombre() + " Proydesa Empleado").forEach(System.out::println);
        System.out.println("---------------------------------------------------\n");
        producto.stream().map(x -> x.getPrecio() * 1.10).forEach(System.out::println);
    }

    public static void testCuatro(List<Empleados> empleado) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado a buscar: ");
        String nombre = leer.nextLine();

        boolean encontro = empleado.stream().anyMatch(x -> x.getNombre().startsWith(nombre));
        if (encontro) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void testCinco(List<Productos> producto) {
        producto.stream().limit(3).forEach(System.out::println);

    }
}
