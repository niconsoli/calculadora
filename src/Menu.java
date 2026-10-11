import java.util.Scanner;

public class Menu {
    public static void exibirMenu(){
        System.out.println("""
                | --------------------------------------------- |
                | -  CALCULADORA FUNCIONAL OPERANDO EM JAVA!  - |
                |   Para iniciar, informe qual operação deseja. |
                | --------------------------------------------- |

                1. Soma;
                2. Subtração;
                3. Multiplicação;
                4. Divisão;
                5. Média aritmética;
                6. Potenciação;
                7. Radiciação;
                8. Fatorial;
                9. Logaritmo;
                10. Teorema de Pitágoras;
                11. MMC (Mínimo Múltiplo Comum);
                12. MDC (Máximo Divisor Comum);
                13. Seno;
                14. Cosseno;
                15. Tangente;
                16. Porcentagem;
                0. Sair.
                """);
            System.out.print("Digite sua opção a seguir: ");
    }

    public static int[] lerNumeros(Scanner sc, int n){
            int[] numeros = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
                }
            return numeros;
        }

    public static void enter(Scanner sc) {
        sc.nextLine();
        System.out.println("Pressione Enter para continuar...");
        sc.nextLine();
    }

    //                  //
    // --- CÁLCULOS --- //
    //                  //

    public static void calcularSoma(Scanner sc){
        System.out.println("""
                            Perfeito! Então, faremos a soma simples de números.
                            Primeiro, por favor, informe quantos números estaremos somando""");
        int n = sc.nextInt();
        if (n >= 1) {
            System.out.println("""
                                Perfeito, agora vamos realizar a soma!
                                Informe abaixo os números que serão somados:""");

            int[] numeros = Menu.lerNumeros(sc, n);
            Operacoes.soma(numeros);
            enter(sc);
        } else {
            System.out.println("Por favor, informe um valor maior que 1.");
            enter(sc);
        }
    }

    public static void calcularSubtracao(Scanner sc){
        System.out.println("""
                            Certo!
                            Para realizarmos a subtração, primeiro precisamos saber quantos números subtraremos
                            Quantos números subtraremos?""");
        int n = sc.nextInt();

        if (n > 1) {
            System.out.println("Certo, agora informe os números a serem subtraídos");
            int[] numeros = Menu.lerNumeros(sc, n);
            Operacoes.subtracao(numeros);
            enter(sc);
        } else {
            System.out.println("Por favor, informe um valor maior que 1.");
            enter(sc);
        }
    }

    public static void calcularMultiplicacao(Scanner sc){
        System.out.println("""
                            Ok!
                            Vamos realizar a multiplicação!
                            Quantos números multiplicaremos? """);
        int n = sc.nextInt();   
        if (n > 1) {
            System.out.print("Agora, nomeie quais números estaremos multiplicando! ");
            int[] numeros = Menu.lerNumeros(sc, n);
            Operacoes.multiplicacao(numeros);
            enter(sc);
        } else {
            System.out.println("Por favor, informe um valor maior que 1.");
            enter(sc);
        }
    }

    public static void calcularDivisao(Scanner sc){
        System.out.println("""
                            Beleza!
                            A divisão requer geralmente somente dois números
                            O dividendo, o número a ser dividido
                            E o divisor, o número que estará o dividindo
                            Me informe qual o dividendo: """);
        int dividendo = sc.nextInt();
        System.out.print("Agora o divisor! ");
        int divisor = sc.nextInt();

        if (divisor == 1) {
            System.out.println("Por favor, informe um valor maior que 1.");
            enter(sc);
        } else if (divisor == 0) {
            System.out.println("Não é possível dividir por zero, por favor, informe um valor maior que 0.");
            enter(sc);
        } else {
            Operacoes.divisao(dividendo, divisor);
            enter(sc);
        }
    }

    public static void calcularMedArit(Scanner sc){
        System.out.println("""
                            A média aritmética se trata do valor mediano entre n números
                            Primeiro, precisa ser determinado quantos números você me informará
                            E quantos são? """);
        int n = sc.nextInt();
        if (n > 1) {
            System.out.println("Beleza, agora vamos lá, me diga os números!");
            int[] numeros = Menu.lerNumeros(sc, n);
            Operacoes.mediaAritmetica(numeros);
            enter(sc);
        } else {
            System.out.println("Por favor, informe um valor maior que 1.");
            enter(sc);
        }
    }
    
    public static void calcularPotenciacao(Scanner sc){
        System.out.println("""
                            Potenciação se trata de quantas vezes um número de multiplica por ele mesmo
                            Por exemplo, a potência de dois elevado à 3 dá 8
                            Isso porque 2*2 dá quatro e 4*2 dá oito
                            Que número potencializaremos?
                            """);
        int valor = sc.nextInt();
        System.out.print("E quantas vezes vamos o potencializar? ");
        int expoente = sc.nextInt();
        
        if (expoente > 1) {
            Operacoes.potenciacao(valor, expoente);
            enter(sc);
        } else {
            System.out.println("Por favor, informe um valor maior que 1.");
            enter(sc);
        }
    }

    public static void calcularRadiciacao(Scanner sc){
        System.out.println("""
                            A radiciação é a operação matemática inversa à potenciação
                            Se trata de encontrar qual número, redondo ou a arredondado pode resultar ao valor pedido, quando multiplicado por uma raiz específica
                            Em resumo, é chamado de raiz quadrada toda radiciação de índice 2
                            A raiz quadrada de 4 é 2, porque 2*2 dá 4
                            A raiz cúbica de 8 dá 2 pelo mesmo motivo, porque 2*2*2 dá 8
                            Por isso, para realizar esse cálculo, precisamos saber de qual raiz estamos falando: """);   
        int raiz = sc.nextInt();
        if (raiz >= 2){
            System.out.print("Certo, agora qual número queremos saber? ");
            int base = sc.nextInt();
            if (base != 1) {
                System.out.println("""
                                    Por fim, você quer o valor arredondado ou exato?");
                                    1. Arredondado        
                                    2. Exato""");
                    int opcRaiz = sc.nextInt();

                    if (opcRaiz != 1 && opcRaiz != 2){
                        System.out.println("Por favor, escolha uma das duas opções.");
                        enter(sc);
                    }
                    else {
                        Operacoes.radiciacao(raiz, base, opcRaiz);
                        enter(sc);
                    }
                    } else {
                    System.out.println("Qualquer raiz de 1 é igual a 1. Por favor, insira um número diferente de 1.");
                    enter(sc);
                    }
            } else {
                System.out.println("O número da raiz precisa ser igual ou maior que 2.");
                enter(sc);
            }      
    }

    public static void calcularFatorial(Scanner sc){
        System.out.println("""
                                Fatorial é o processo da multiplicação de todos os números que antecedem um valor
                                Por exemplo! Se requisitado o valor do fatorial de 3, deverá ser calculado 3*2*1
                                Qual número você quer calcular o fatorial?""");
        int valor = sc.nextInt();                        
            if (valor > 1){
                Operacoes.fatorial(valor);
                enter(sc);
            } else {
                System.out.println("Por favor, indique um valor maior do que 1.");
                enter(sc);
            }
    }

    public static void calcularLogaritmo(Scanner sc){
        System.out.println("""
                            Logaritmo se relaciona com potenciação e radiciação, fechando o 'trio'"
                            No logaritmo, a função é descobrir qual expoente multiplica o logaritmando pela base do logaritmo")
                            Se um logaritmo ausenta base, significa que a base-padrão do mesmo é 10")
                            Um exemplo prático é o log₂8 é 3, pois 2³ é 8")
                            Sem mais enrolações, qual a base do seu logaritmo?""");
        int base = sc.nextInt();
        if (base > 1){
            System.out.print("Certo! E o valor do logaritmo, o logaritmando? ");
        int logaritmando = sc.nextInt();
            if (logaritmando > 0){
                Operacoes.logaritmo(base, logaritmando);
                enter(sc);
            } else {
                System.out.println("O seu logaritmando deve ser maior do que zero.");
                enter(sc);
            }
        } else {
            System.out.println("A base do seu logaritmo deve ser maior que 1.");
            enter(sc);
        }
    }
    
    public static void calcularPitagoras(Scanner sc){
        System.out.println("""
                            O Teorema de Pitágoras é um dos mais populares e mais conhecidos teoremas da Matemática!
                            Se resume em uma relação fundamental dentro de triângulos retângulos
                            Diz que o quadrado do comprimento da hipotenusa, o lado oposto ao ângulo reto deve, sempre, ser igual à soma dos quadrados dos comprimentos dos outros dois catetos
                            Usando-os podemos tanto calcular a hipotenusa quanto algum dos dois catetos
                            Qual você quer calcular?
                            1. Hipotenusa
                            2. Cateto""");
                    int opcPit = sc.nextInt();

                    switch (opcPit){
                        case 1:
                            System.out.println("""
                                                Certo, vamos calcular a hipotenusa!
                                                Ressaltando então, que na situação atual, nós temos os dois catetos, correto?
                                                Então vamos lá! Me informe o valor do primeiro cateto, por favor.""");
                            int c1 = sc.nextInt();
                            if (c1 > 0){
                                System.out.print("Agora, me informe o valor do outro cateto, por favor! ");
                                int c2 = sc.nextInt();
                                if (c2 > 0){
                                    Operacoes.pitagorasHipotenusa(c1, c2);
                                    enter(sc);
                                } else {
                                    System.out.println("O cateto não pode ter um valor menor que 0.");
                                    enter(sc);
                                }
                            } else {
                                System.out.println("O cateto não pode ter um valor menor que 0.");
                                enter(sc);
                            }
                        break;

                        case 2:
                            System.out.println("""
                                                Perfeito!
                                                Então, você já tem o valor da hipotenusa, certo? 
                                                Me informe qual o valor, por favor! """);
                            int hip = sc.nextInt();
                            if (hip > 0){
                                System.out.print("Perfeito! Agora, e o valor do cateto, aquele que você tem conhecimento sobre? ");
                                c1 = sc.nextInt();
                                if (c1 > 0){
                                    Operacoes.pitagorasCateto(c1, hip);
                                    enter(sc);
                                } else {
                                    System.out.println("O cateto não pode ter um valor menor que 0.");
                                    enter(sc);
                                }
                            } else {
                                    System.out.println("A hipotenusa não pode ter um valor menor que 0.");
                                    enter(sc);
                            }
                        break;

                        default:
                            System.out.println("Por favor, escolha um número entre 1 e 2.");
                            enter(sc);
                        break;
                    }
    }

    public static void calcularMMC(Scanner sc){
        System.out.println("""
                            Mínimo múltiplo comum é como é chamado o menor número inteiro positivo que é múltiplo de dois ou mais números!");
                            Você quer saber o 'MMC' de quantos números?""");
        int n = sc.nextInt();   
        
        if (n > 1){
            int numeros[] = Menu.lerNumeros(sc, n);
            Operacoes.minimoComum(numeros);
            enter(sc);
        } else {
            System.out.println("Por favor, informe um número maior que um!");
            enter(sc);
        }
    }

    public static void calcularMDC(Scanner sc){
        System.out.println("""
                            O Máximo Divisor Comum se trata do maior número inteiro que divide dois ou mais números dados simultaneamente, de forma que não haja restos
                            Quantos números usaremos no nosso 'MDC'?""");
        int n = sc.nextInt();
        if (n > 1){
            int numeros[] = Menu.lerNumeros(sc, n);
            Operacoes.maximoComum(numeros);
            enter(sc);
        } else {
                System.out.println("Por favor, informe um número maior que um!");
                enter(sc);
            }
    }

    public static void calcularSeno(Scanner sc){
        System.out.println("""
                            O seno de um ângulo é uma das funções principais da trigonometria
                            E é definido pela razão entre o comprimento do cateto oposto e o comprimento da hipotenusa, dentro de um triângulo retângulo
                            Entretanto, posso calcular pra você somente pelo valor do ângulo cujo seno você quer descobrir
                            Esse valor inclusive, que é? """);
        int valor = sc.nextInt();
        Operacoes.seno(valor);
        enter(sc);
    }

    public static void calcularCosseno(Scanner sc){
        System.out.println("""
                            O cosseno de um ângulo compõe uma das três principais funções da trigonometria
                            É definido pela razão entre o cateto adjacente a e a hipotenusa deste triângulo
                            "Entretanto, posso calcular pra você somente pelo valor do ângulo cujo cosseno você quer descobrir
                            Esse valor inclusive, que é?""");
        int valor = sc.nextInt();
        Operacoes.cosseno(valor);
        enter(sc);
    }

    public static void calcularTangente(Scanner sc){
        System.out.println("""
                            A tangente de um ângulo é uma das principais e essenciais funções da trigonometria
                            É definida pela razão de um cateto oposto pelo cateto adjacente em um triângulo retângulo
                            Entretanto, posso calcular pra você somente pelo valor do ângulo cujo tangente você quer descobrir
                            Esse valor incluse, que é? """);
        int valor = sc.nextInt();
        Operacoes.tangente(valor);
        enter(sc);
    }

    public static void calcularPorcentagem(Scanner sc){
        System.out.println("""
                                        A porcentagem é uma medida de razão com base em 100 que vemos quase todos os dias");
                                        Para calculá-la, precisamos de um número base!");                                     
                                        Por exemplo, se eu quero saber 25% de 75, digamos que o 75 é esse número base");
                                        Entendeu? Qual número-base você quer calcular a porcentagem?""");
        int valor = sc.nextInt();
        System.out.println("""
                            Perfeito! E, qual a porcentagem que você quer descobrir desse número?
                            Devo esclarecer para não ser incluso o algorismo %
                            Caso queira saber 25%, por exemplo, escreva somente 25.""");
        int porcent = sc.nextInt();
        Operacoes.porcentagem(valor, porcent);
        enter(sc);
    }
}
