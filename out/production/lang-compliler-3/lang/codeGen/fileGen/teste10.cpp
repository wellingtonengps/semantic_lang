    #include <iostream>



    int fibonacci_retorno_00(int n) {
        if((n < 1)) {
            return n;
        }
        if((n == 1)) {
            return n;
        }
        return (fibonacci_retorno_00((n - 1)) + fibonacci_retorno_00((n - 2)));
    }

    int main() {
        int v;
        v = fibonacci_retorno_00(5);
        std::cout << v;
        return 0;
    }
