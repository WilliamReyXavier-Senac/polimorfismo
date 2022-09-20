package polimorfismo;

public class Polimorfismo {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        //System.out.println(calc.somar(2, 2.3));
        
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Pato pato = new Pato();
        
        gato.comunicar();
        cachorro.comunicar();
        pato.comunicar();
        
    }
    
}
