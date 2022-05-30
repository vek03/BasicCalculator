package basiccalculatorapp;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */
public class MenuCalculadora 
{
    //instância do nome dos objetos(classes) e da variável que conterá a opção escolhida pelo user
    //nomeando classe Calculadora
    private Calculadora calculadora;
    //declarando variável de opção
    private int opcao;
    //nomeando classe ConversorNumeros
    private ConversorNumeros conversor;
    //nomeando classe EntradaSaidaDados
    private EntradaSaidaDados io;
    
    //método construtor declarando o valor da variável e a instância completa dos objetos
    public MenuCalculadora()
    {
        //instância da classe Calculadora
        this.calculadora = new Calculadora();
        
        //declaração do valor da variável de opção
        this.opcao = -1;
        
        //instância da classe ConversorNumeros
        this.conversor = new ConversorNumeros();
        
        //instância da classe EntradaSaidaDados
        this.io = new EntradaSaidaDados();
    }
    
    /*
    método que irá executar os métodos de menu e tratamento até que o usuário
    escolha finalizar a execução do programa
    */
    public void executarCalculadora()
    {
        do
        {
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }
        while(this.opcao != 0);
    }
    
    //método que irá exibir o menu da calculadora e executar a classe de entrada
    //de dados.
    private void executarMenuPrincipal()
    {
        //parte que exibi o menu com as opções disponiveis
        String mensagemMenu = "Selecione uma opção: "
                +"\n 1 - Somar"
                +"\n 2 - Subtrair"
                +"\n 3 - Multiplicar"
                +"\n 4 - Dividir"
                +"\n 5 - Sair";
        
        //parte que inicia a saida de dados
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToInt(entradaDados);
    }
    
    //método de entrada de dados com tratamento e função de tratamento para
    //saber qual operação realizar
    public void avaliarOpcaoEscolhida()
    {
        //declaração de variaveis locais para mandar para as outras classes
        String saida;
        double num1 = 0, num2 = 0;
        
        //função de entrada de dados com tratamento para evitar outras opções inválidas
        //logica: caso o numero de opção seja válido(diferente de nada e dentro das opções),
        //executa o programa normalmente
        if(this.opcao != 0 && this.opcao <= 4)
        {
            String mensagemEntrada = "Digite o 1° numero: ";
            num1 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            calculadora.setNumero01(num1);
            mensagemEntrada = "Digite o 2° numero: ";
            num2 = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            calculadora.setNumero02(num2);
        }
        
        //função de tratamento de caso para executar o requerimento do usuario 
        switch(this.opcao)
        {
            //caso 1: soma
            case 1:
                calculadora.somar(num1, num2);
                saida = "Resultado da soma: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            //caso 2: subtração    
            case 2:
                calculadora.subtrair(num1, num2);
                saida = "Resultado da subtração: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            //caso 3: multiplicação    
            case 3:
                calculadora.multiplicar(num1, num2);
                saida = "Resultado da multiplicação: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            //caso 4: divisão    
            case 4:
                calculadora.dividir(num1, num2);
                saida = "Resultado da divisão: " + calculadora.getResultado();
                io.saidaDados(saida);
                break;
                
            //caso 5: finalizar programa    
            case 5:
                calculadora.sair();
                
            //caso digite uma opção inválida    
            default:
                io.saidaDados("Opção Inválida");
                break;
        }
    }
}
