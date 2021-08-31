
package dominio;

public class AnimalCarnivoro extends Animal {
    
    @Override
    public void alimentarse() {
        System.out.println("Los animales carnívoros comen carne");
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
