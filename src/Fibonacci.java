public class Fibonacci {

    // Método para gerar a sequência de Fibonacci
    public static void gerarFibonacci(int pen, int ult, int n) {
        // Caso base - Quando n é igual a 0
        if (n == 0) {
            return;
        }

        int fibo;

        if (pen == 0 && ult == 0) {
            fibo = 0;
            pen = 0;
            ult = 1;
        } else {

            fibo = pen + ult;
            pen = ult;
            ult = fibo;
        }

        System.out.print(fibo + " ");

        gerarFibonacci(pen, ult, n - 1);
    }

    public static void main(String[] args) {
        int quantidade = 10; // Defino a quantidade de números

        System.out.println("Sequência de Fibonacci:");
        gerarFibonacci(0, 0, quantidade);
    }
}
