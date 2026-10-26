public class Futbolista {
    
    //Atributos del objeto
    String nombre;
    String apellido;
    int edad;
    String nacionalidad;
    String posicion;
    double estatur;

    
    //Método constructor
    public Futbolista(String nombre, String apellido, int edad, String nacionalidad, String posicion, double estatur) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
        this.estatur = estatur;
    }

    //Comportamientos
    public void correr(){
        System.out.println("El futbolista esta corriendo por el campo");
    }

    public void saltar(){
        System.out.println("El futbolista esta saltando por un rebote");
    }

    public void patear(){
        System.out.println("El futbolista esta pateando a puerta");
    }

    public void pasar(){
        System.out.println("El futbolista realiza un pase a un compañero");
    }

    public void cabecear(){
        System.out.println("El futbolista cabecea la pelota a puerta");
    }

    public void tapar(){
        System.out.println("El futbolista esta tapando un disparo");
    }
    
}
