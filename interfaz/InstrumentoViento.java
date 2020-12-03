package interfaz;

public class InstrumentoViento extends Object implements InstrumentoMusical {

    public InstrumentoViento() {
    }
    
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    
    @Override
    public String tipoInstrumento(){
        return "Instrumento de Viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
       
}
