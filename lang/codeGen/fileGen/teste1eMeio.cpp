    #include <iostream>


    int divMod_retorno_00(int n, int q);
    int divMod_retorno_01(int n, int q);

    int main() {
        int n;
        int q;
        int w;
        int z;
        n = 13;
        q = 5;
        w = divMod_retorno_01(n, q);
        z = ((2 * w) + 1);
        std::cout << 'Z';
        std::cout << ':';
        std::cout << z;
        std::cout << '\n';
        return 0;
    }

    int divMod_retorno_00(int n, int q) {
        return (n / q);
    }

    int divMod_retorno_01(int n, int q) {
        return (n % q);
    }
