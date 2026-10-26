public class App {
    public static void main(String[] args) throws Exception {
        //Instanciamos la clase futbolista creada con anterioridad.
        Futbolista player1 = new Futbolista("Mohamed","Salah",
        34,"Egipto","Delantero",1.75);

        player1.correr();
        player1.saltar();
        player1.patear();
        player1.pasar();
        player1.cabecear();
        player1.tapar();
    }
}
