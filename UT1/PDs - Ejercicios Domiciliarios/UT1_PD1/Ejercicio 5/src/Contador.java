public class Contador {

    private int MAX_CONT = 50;

    private int incremento = 1;
    private int contador = 1;


    public void displayCountWhile(){
        while (contador <= MAX_CONT){
            contador +=incremento;
            System.out.println(contador);
        }
    }

    public void displayCountDoWhile(){
        do {
            contador +=incremento;
            System.out.println(contador);
        }
        while (contador <= MAX_CONT);
    }

    public void displayCountFor(){
        for (int i=contador; i <= MAX_CONT; ++i){
            System.out.println(i);
        }
    }
}

