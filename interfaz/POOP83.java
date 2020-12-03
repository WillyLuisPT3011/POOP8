package interfaz;

public class POOP83 {
    public static void main(String[] args) {
        System.out.println("4*************************************************** ");
        //InstrumentoMusical instrumento = new instrumentoMusical();
        InstrumentoMusical instrumento;
        
        instrumento = new Flauta();
        instrumento.tocar();
        instrumento.afinar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
    }
    
}
