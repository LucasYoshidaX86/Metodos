public class Metodos {
    
    // Verifica se um número é positivo ou negativo, usando a instrução "if/else".
    public static String verificaNumero(double numero) {
        if (numero >= 0) {
            return "O número " + numero + " é positivo.";
        } else {
            return "O número " + numero + " é negativo.";
        }
    }

    // Calcula a média aritmética de três números.
    public static double mediaAritmetica(double a, double b, double c) {
        return (a + b + c) / 3.0; 
    }

    // Encontra o maior número em 3 números, usando a instrução "if/else".
    public static double maiorNumero(double a, double b, double c) {
        double maior = a; 
        if (b > maior) {
            maior = b; 
        }
        if (c > maior) {
            maior = c; 
        }
        return maior;
    }

    // Calcula a potência de determinado número utilizando loop "for", onde executa a multiplicação do número escolhido por ele mesmo.
    public static double potencia(double a, double b) {
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a; 
        }
        return resultado;
    }

    // Converte minuto em horas.
    public static String converteMinutos(int minutos) {
        int horas = minutos / 60;
        int restoMinutos = minutos % 60;
        return horas + " hora(s) e " + restoMinutos + " minuto(s)";
    }

    // Calcula fatorial lembrando da regra de não ser números negativos. Utiliza "for" para fazer o cálculo. 
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        long resultado = 1; 
        for (int i = 1; i <= n; i++) {
            resultado *= i; 
        }
        return resultado; 
    }
}