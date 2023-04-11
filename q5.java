import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira uma Sring:");
        String palavra = ler.nextLine();
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("\nPalavra inversa: \n" + palavraInvertida);
    }
}
