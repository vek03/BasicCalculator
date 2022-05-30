package basiccalculatorapp;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */
public class ConversorNumeros 
{
    /*
    método que converte o valor inserido pelo usuário na caixa de diálogo, que é
    em String, para Int(caso seja inteiro), e retorna.
    */
    public Integer StringToInt(String num)
    {
        int conversor = Integer.parseInt(num);
        return (conversor);
    }
    
    /*
    método que converte o valor inserido pelo usuário na caixa de diálogo, que é
    em String, para Double(caso seja real), e retorna
    */
    public Double stringToDouble(String num)
    {
        double conversor = Double.parseDouble(num);
        return (conversor);
    }
}

