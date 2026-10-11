import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            Menu.exibirMenu();
            int opt = sc.nextInt();

            if (opt == 0){
                System.out.println("Certo! Encerrando o programa...");
                break;
            }

            switch (opt) {
                case 1:
                    Menu.calcularSoma(sc);
                break;

                case 2:
                    Menu.calcularSubtracao(sc);
                break;

                case 3:
                    Menu.calcularMultiplicacao(sc);
                break;

                case 4:
                    Menu.calcularDivisao(sc);
                break;

                case 5:
                    Menu.calcularMedArit(sc);
                break;

                case 6:
                    Menu.calcularPotenciacao(sc);
                break;

                case 7:
                    Menu.calcularRadiciacao(sc);
                break;

                case 8:
                    Menu.calcularFatorial(sc);
                break;

                case 9:
                    Menu.calcularLogaritmo(sc);
                break;
                
                case 10:
                    Menu.calcularPitagoras(sc);
                break;

                case 11:
                    Menu.calcularMMC(sc);
                break;
                
                case 12:
                    Menu.calcularMDC(sc);
                break;

                case 13:
                    Menu.calcularSeno(sc);
                break;

                case 14:
                    Menu.calcularCosseno(sc);
                break;

                case 15:
                    Menu.calcularTangente(sc);
                break;
    
                case 16:
                    Menu.calcularPorcentagem(sc);
                break;

                default:
                    System.out.println("Eu não entendi! Acho que você digitou incorretamente...");
                break;
}}}}