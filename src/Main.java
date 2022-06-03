public class Main {


    public static void main(String[] args) {
        int res = sum(1, 2, 44);
        System.out.println(res);
        Coche miCoche = new Coche();

        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);


    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

}