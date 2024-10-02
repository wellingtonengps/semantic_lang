import java.util.Scanner;

public class teste1eMeio {
    public Scanner __Scanner = new Scanner(System.in); // Scanner para fazer a leitura de entrada pelo teclado


    int main() {
        Integer n;
        Integer q;
        Integer w;
        Integer z;
        n = 13;
        q = 5;
        w = divMod_retorno_01(n, q);
        z = ((2 * w) + 1);
        System.out.print('Z');
        System.out.print(':');
        System.out.print(z);
        System.out.print('\n');
        return 0;
    }

    Integer divMod_retorno_00(Integer n, Integer q) {
        return (n / q);
    }

    Integer divMod_retorno_01(Integer n, Integer q) {
        return (n % q);
    }

    public static void main(String args[]) {
        teste1eMeio m = new teste1eMeio();
        m.main();
    }
}