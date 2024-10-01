    #include <iostream>


    bool even_retorno_00();
    bool odd_retorno_00(int n);
    int main(int n);

    bool even_retorno_00(int n) {
        if((n == 0)) {
            return true;
        } else {
            return odd_retorno_00((n - 1));
        }

    }

    bool odd_retorno_00(int n) {
        if((n == 0)) {
            return false;
        } else {
            return even_retorno_00((n - 1));
        }

    }

    int main() {
        bool r;
        r = even_retorno_00(3);
        if(r) {
            std::cout << 'P';
            std::cout << 'A';
            std::cout << 'R';
        } else {
            std::cout << 'I';
            std::cout << 'M';
            std::cout << 'P';
            std::cout << 'A';
            std::cout << 'R';
        }

        return 0;
    }
