package interfaz;

public class Flauta extends InstrumentoViento{

    public Flauta() {
    }
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
}