    #include <iostream>



    int fat_retorno_00(int n) {
        if((n == 0)) {
            return 1;
        }
        return (n * fat_retorno_00((n - 1)));
    }

    int spook_retorno_00(int n) {
        if((n == 1)) {
            return (2 * n);
        }
        if((n == 2)) {
            return ((2 * n) + 1);
        }
        return (n - 1);
    }

    int main() {
        int k;
        k = fat_retorno_00(6);
        k = spook_retorno_00(2);
        std::cout << k;
        std::cout << '\n';
        return 0;
    }
