package calculadoragit;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Appgit {
    
    public static void main(String[] args) {

        /**
         * declaracao de variaveis locais (main)
         */
        Scanner scan = new Scanner(System.in);

        // Instanciaca de objetos
        Calculadoragit calc = new Calculadoragit();
        Calculadoragit calc2 = new Calculadoragit();

        System.out.print("Digite o valor de x: ");
        calc.x = scan.nextInt();
        System.out.print("Digite o valor de y: ");
        calc.y = scan.nextInt();
        System.out.println("");

        calc.soma();

        int somaApp = calc.soma(40, 50);
        System.out.println("[Metodo soma main] Soma " + somaApp);
        calc.subtracao();
        calc.multiplicacao();
        calc.divisao();

        System.out.println("");
        System.out.println("========== calc2 =============");
        System.out.println("");
        
        System.out.print("Digite o valor de x para calc2: ");
        calc2.x = scan.nextInt();
        System.out.print("Digite o valor de y para calc2: ");
        calc2.y = scan.nextInt();
        System.out.println("");
        
        calc2.soma();
        calc2.subtracao();
        calc2.multiplicacao();
        calc2.divisao();

    }

}
