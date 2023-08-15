public class Main {
    public static void main(String[] args) {
        ImprimirTablero(7, 7);
    }

    public static void ImprimirTablero(int largo, int ancho){
        int contador = 0;
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
}