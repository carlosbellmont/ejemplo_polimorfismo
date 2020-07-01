public class Main {

    public static void main(String[] args) {
        escribirNombre("Carlos");
        escribirNombre("Carlos", "de Tena");
        escribirNombre("Carlos", "de Tena", "Bellmont");
    }

    public static void escribirNombre(String nombre, String primerApellido, String segundoApellido){
        System.out.println(nombre + " " + primerApellido + " " + segundoApellido);
    }

    public static void escribirNombre(String nombre, String primerApellido){
        System.out.println(nombre + " " + primerApellido);
    }

    public static void escribirNombre(String nombre){
        System.out.println(nombre);
    }

}

