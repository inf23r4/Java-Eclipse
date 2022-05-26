package bridge02;


public class Cocinar implements IElaborar
{
    public Cocinar() {
    }
    // --------------------------
    @Override
     public void procesar()
    {
        // Operaciones necesarias
        // ...
        System.out.println("\tAlimento cocinado");
    }
}
