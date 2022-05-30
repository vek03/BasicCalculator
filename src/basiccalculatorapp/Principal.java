package basiccalculatorapp;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        //instância e chamada da classe menu, que irá chamar as outras classes subordinadas.
        MenuCalculadora menu = new MenuCalculadora();
        menu.executarCalculadora();
    }
    
}
