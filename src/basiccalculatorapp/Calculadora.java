package basiccalculatorapp;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */
public class Calculadora 
{
    //declaração de variáveis privadas, sendo eles: numerador, denominador e resultado da operação
    private double numero01;
    private double numero02;
    private double resultado;
    
    //método construtor declarando os valores das variáveis criadas acima
    public Calculadora()
    {
        this(0,0,0);
    }
    
    //método auxiliar que trás o valor das variaveis como parametro e as prepara para o uso
    public Calculadora(double numero01, double numero02, double resultado)
    {
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }

    //===========INICIO DOS MÉTODOS SET E GET DAS VARIÁVEIS========================
    /**
     * @return the numero01
     */
    public double getNumero01() {
        return numero01;
    }

    /**
     * @param numero01 the numero01 to set
     */
    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    /**
     * @return the numero02
     */
    public double getNumero02() {
        return numero02;
    }

    /**
     * @param numero02 the numero02 to set
     */
    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    //=============FIM DO METODO SET E GET=================
    
    
    //método que irá fazer a operação de soma e retornar o valor na variavel resultado
    public void somar(double numero01, double numero02)
    {
        setResultado(this.getNumero01() + this.getNumero02());
    }
    
    //método que irá fazer a operação de subtração e retornar o valor na variavel resultado
    public void subtrair(double numero01, double numero02)
    {
        setResultado(this.getNumero01() - this.getNumero02());
    }
    
    //método que irá fazer a operação de multiplicação e retornar o valor na variavel resultado
    public void multiplicar(double numero01, double numero02)
    {
        setResultado(this.getNumero01() * this.getNumero02());
    }
    
    //método que irá fazer a operação de divisão e retornar o valor na variavel resultado
    public void dividir(double numero01, double numero02)
    {
        setResultado(this.getNumero01() / this.getNumero02());
    }
    
    //método que irá finalizar a execução do programa caso o usuário escolha a opção
    public void sair()
    {
        System.exit(0);
    }
}
