
public class Main {

	public static void main(String[] args) {
		// Verifica se um número é positivo ou negativo
        System.out.println(Metodos.verificaNumero(15.0));
        System.out.println(Metodos.verificaNumero(-7.0));

        // Calcula a média aritmética
        double media = Metodos.mediaAritmetica(9.0, 10.0, 8.0);
        System.out.println("A média aritmética é: " + media);

        // Encontra o maior número
        double maior = Metodos.maiorNumero(10.0, -4.0, 1500.0);
        System.out.println("O maior número é: " + maior);

        // Calcula a potência de a^b
        double potencia = Metodos.potencia(5.0, 3.0); // 2^3
        System.out.println("5 elevado a 3 é: " + potencia);

        // Converte minutos em horas e minutos
        String tempoConvertido = Metodos.converteMinutos(90);
        System.out.println("90 minutos é igual a: " + tempoConvertido);

        // Calcula o fatorial
        double fatorial = Metodos.fatorial(3);
        System.out.println("O fatorial de 3 é: " + fatorial);

	}

}
