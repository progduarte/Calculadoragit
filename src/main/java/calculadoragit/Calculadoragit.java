package calculadoragit;

/**
 *
 * @author dev
 */

        

public class Calculadoragit {
    
    /**
         * declaracao de variaveis de classe
         */
        int x, y;
        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;
        
    
    public void soma(){
        
        
             
        /**
         * Processamento
         */
        
        soma = x + y;
        
        /**
         * Saida de dados
         */
        
        System.out.println("[Metodo Soma] Soma = " + soma);
        
        System.out.println("");
        
    }
    
    public int soma(int x, int y){
        
        /**
         * Declaracao de variaveis
         */
        int soma = x + y;
        
        /**
         * outtput
         */
        
        return soma;
        
    }
           
    public void subtracao(){
        
         
       
        
        /**
         * Processamento
         */
        
        subtracao = x - y;
        
        /**
         * Saida de dados
         */
        
        System.out.println("[Metodo subtracao] Subtracao = " + subtracao);
        
        System.out.println("");
        
        
    }
    
    public void multiplicacao(){
        
       
        /**
         * Processamento
         */
        
        multiplicacao = x * y;
        
        /**
         * Saida de dados
         */
        
        System.out.println("[Metodo multiplicacao] Multiplicacao = " + multiplicacao);
        
        System.out.println("");
        
        
    }
    
    public void divisao(){
         
       
        /**
         * Processamento
         */
        
        divisao = x / y;
        
        /**
         * Saida de dados
         */
        
        System.out.println("[Metodo divisao] Divisao = " + divisao);
        
        System.out.println("");
        
    }
    
}
