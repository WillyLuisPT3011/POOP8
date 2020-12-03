package claseAbstracta;

public class POOP82 {
    public static void main(String[] args) {
        System.out.println("3*************************************************** ");
        
        //Poligono poligono = new Poligono();
        Poligono poligono;
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
    }
}
