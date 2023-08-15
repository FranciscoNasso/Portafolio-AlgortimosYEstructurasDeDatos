public class Main {
    public static void main(String[] args) {

        System.out.println("caramelo".substring(0, 3));
        System.out.println("123.5671.23".split("."));
        System.out.println("Hola a todo el mundo reyes".subSequence(0,11));
        System.out.println("Esto es un ejemplo".trim());
        System.out.println("OTRo EJEmPLo".toLowerCase());
        System.out.println("Y otro MAs".toUpperCase());
        System.out.println("Hola mundito de jesus".indexOf("u"));
        System.out.println("jessssuuuuusss madremiassss".lastIndexOf("s"));
        System.out.println("Peñarol perdio ayer".contains("ñarol"));
        System.out.println("Un ingles viajo en barco".replace("ingles","frances"));
        System.out.println("Un americano viajo con otro americano en un jet negro".replaceFirst("americano", "uruguayo"));
        System.out.println("Un americano viajo con otro americano en un jet negro".replaceAll("americano", "uruguayo"));
    }
}