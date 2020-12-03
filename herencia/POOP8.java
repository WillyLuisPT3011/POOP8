package herencia;

public class POOP8 {

    public static void main(String[] args) {
        System.out.println("1*************************************************** ");
        /* Las clases Base pueden comportarse como sus subclases */
        Poligono poligono = new Poligono();
        System.out.println("Poligono " + poligono);
        
        
        Object objeto = new Object();
        System.out.println("Object " + objeto);
        
        objeto = poligono;
        System.out.println("Object como Poligono " + objeto);
        
        Object objeto2 = poligono;
        System.out.println("Object2 " + objeto2);
        
        Object objeto3 = new Poligono();
        System.out.println("Object3 " + objeto3);
        
        System.out.println("2*************************************************** ");
        
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
    }
    
    public static void selectorPoligonos(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }else if(poligono instanceof Poligono){
            System.out.println("El objeto es un Poligono");
        }else{
            System.out.println("El objeto es otra figura");
        }
    }
}
