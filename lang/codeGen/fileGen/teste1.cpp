    #include <iostream>


    int divMod_retorno_00(int n, int q);
    int divMod_retorno_01(int n, int q);

    int main() {
        int n;
        int q;
        int quo;
        int res;
        n = 13;
        q = 5;
        quo = divMod_retorno_00(n, q);
        res = divMod_retorno_01(n, q);
        std::cout << 'Q';
        std::cout << ':';
        std::cout << quo;
        std::cout << '\n';
        std::cout << 'R';
        std::cout << ':';
        std::cout << res;
        std::cout << '\n';
        return 0;
    }

    int divMod_retorno_00(int n, int q) {
        return (n / q);
    }

    int divMod_retorno_01(int n, int q) {
        return (n % q);
    }
