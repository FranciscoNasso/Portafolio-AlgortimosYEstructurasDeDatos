/*  public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect;
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}
*/


// a)
// El error se encuntra en la siguiente linea de codigo:
//             Rectangle myRect;

// b)
//  La solucion seria la siguiente:
//  Rectangle myRect = new Rectangle();

public class Main {
    public static void main(String[] args){
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}