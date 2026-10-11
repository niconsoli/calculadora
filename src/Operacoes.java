public class Operacoes{ 
    public static int soma(int... n) {
        int soma = 0;
        for (int i = 0; i < n.length; i++) {
                soma += n[i];
            }
        System.out.println("O valor total da soma deu " + soma + "!");
        return soma;
    }

    public static int subtracao(int... n){
        int subtracao = n[0];
        for (int i = 1; i < n.length; i++) {
                subtracao -= n[i];
            }
        System.out.println("O valor total da subtração deu " + subtracao + "!");
        return subtracao;
    }

    public static int multiplicacao(int... n){
        int multiplicacao = 1;
        for (int i = 0; i < n.length; i++) {
                multiplicacao *= n[i];
            }
        System.out.println("O valor total da multiplicação deu " + multiplicacao + "!");
        return multiplicacao;
    }

    public static double divisao(int dividendo, int divisor){
        double divisao = (double) dividendo / divisor;
        System.out.println("O valor total da divisão deu " + divisao + "!");
        return divisao;
    }

    public static double mediaAritmetica(int... n){
        double soma = 0;
        for (int i = 0; i < n.length; i++) {
                soma += n[i];
            }
        double media = soma / n.length;
        System.out.println("O valor total da média aritmética deu " + media + "!");
        return media;
    }

    public static int potenciacao(int base, int expoente){
        int potenciacao = (int) Math.pow(base, expoente);
        System.out.println("O valor total da potenciação deu " + potenciacao + "!");
        return potenciacao;
    }

    public static double radiciacao(int raiz, int valor, int opcRaiz){
        double radiciacao = Math.pow(valor, 1.0/raiz);
        switch(opcRaiz){
            case 1: // Arredondado
            int radiciacaoInt = (int)Math.round(radiciacao);
            System.out.println("O valor total da radiciação deu " + radiciacaoInt + "!");
            break;

            case 2: // Raw
            System.out.println("O valor total da radiciação deu " + radiciacao + "!");
            break;
        } 
        return radiciacao;
    }

    public static int fatorial(int valor){
        int fatorial = 1;
        for (int i = 1; i <= valor; i++){
            fatorial *= i;
        }
        System.out.println("O valor total do seu fatorial deu " + fatorial + "!");
        return fatorial;
    }

    public static double logaritmo(int base, int logaritmando){
        double logaritmo = Math.log(logaritmando) / Math.log(base);
        System.out.println("O valor total do logaritmo deu " + logaritmo + "!");
        return logaritmo;
    }

    // ---------- PITAGORAS --------------- //

    public static double pitagorasHipotenusa(int c1, int c2){
        double hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        System.out.println("O valor total da hipotenusa do seu triângulo de lados " + c1 + " e " + c2 + " é " + hipotenusa + "!");
        return hipotenusa;
    }

    public static double pitagorasCateto(int c1, int hip){
        double cateto = Math.sqrt(Math.pow(hip, 2) - Math.pow(c1, 2));
        System.out.println("O valor do cateto do seu triângulo de lado " + c1 + " e hipotenusa " + hip + " é " + cateto + "!");
        return cateto;
    }

    // ------------------------------------ //

    public static int minimoComum(int... n){
        int mmc = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] > mmc) {
                mmc = n[i];
            }}
        
        boolean encontrado = false;

        while (!encontrado) {
            encontrado = true;

        for (int i = 0; i < n.length; i++) {
            if (mmc % n[i] != 0) {
                encontrado = false;
                break;
            }}

        if (!encontrado) {
            mmc++;
        }}

        System.out.println("O valor do Mínimo Múltiplo Comum é " + mmc + "!");
        return mmc;
    }

    public static int maximoComum(int... n){
        int mdc = n[0];
        for (int i = 1; i < n.length; i++) {
        int a = mdc;
        int b = n[i];
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        mdc = a;}

        System.out.println("O valor do Máximo Divisor Comum é " + mdc + "!");    
        return mdc;
    }

    public static double seno(int valor){
        double seno = Math.sin(Math.toRadians(valor));
        int senoRound = (int) Math.round(seno);

        System.out.println("Perfeito! O valor do seu seno é " + seno + ", que arredondado fica " + senoRound); 

        return seno;
    }

    public static double cosseno(int valor){
        double cosseno = Math.cos(Math.toRadians(valor));
        int cossenoRound = (int) Math.round(cosseno);

        System.out.println("Perfeito! O valor do seu cosseno é " + cosseno + ", que arredondado fica " + cossenoRound); 

        return cosseno;
    }

    public static double tangente(int valor){
        double tangente = Math.tan(Math.toRadians(valor));
        int tangenteRound = (int) Math.round(tangente);

        System.out.println("Perfeito! O valor do seu tangente é " + tangente + ", que arredondado fica " + tangenteRound); 

        return tangente;
    }

    public static double porcentagem(int valor, int porcent){
        double porcentagem = valor * (porcent/100.0);
        System.out.println("O valor total do cálculo da porcentagem de " + porcent + "% de " + valor + " resultou em: " + porcentagem + "!");
        return porcentagem;
    }
}