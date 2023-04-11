import java.util.Scanner;

public class q2 {

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n, i = 0;
        boolean esta = false;

        System.out.println("Informe um numero:");
        n = ler.nextInt();

        while (fibonacci(i) <= n) {
            System.out.println(fibonacci(i) + "\n");

            if (n == fibonacci(i)) {
                esta = true;
            }

            i++;
        }

        if (esta == true) {
            System.out.println("Pertence a sequencia!");
        } else {
            System.out.println("Nao pertence a sequencia!");
        }

    }
}
