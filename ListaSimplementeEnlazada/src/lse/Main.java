package lse;

public class Main {
    public static void main(String[] args) {
        Colas colas=new Colas();

        System.out.println(colas.estaVacia());

        for (int i = 1; i <=10 ; i++) {
            colas.insertar(i);
        }
        colas.mostrar();
        colas.eliminar();
        colas.eliminar();
        colas.mostrar();
        colas.eliminar();
        colas.mostrar();
    }
}
