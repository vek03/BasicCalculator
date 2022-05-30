package basiccalculatorapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */
public class EntradaSaidaDados 
{
    //método que mostra a caixa de dialogo para entrada de dados pelo usuario
    public String entradaDados(String mensagemEntrada)
    {
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    
    //método que mostra a caixa de dialogo para saida de dados como resultado da operação
    public void saidaDados(String mensagemSaida)
    {
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
