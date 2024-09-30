    #include <iostream>



    int main() {
        int i;
        int k;
        int* x;
        k = 4;
        x = new int[k];
        x [ 0 ]  = 0;
        x [ 3 ]  = 15;
        std::cout << x [ 3 ] ;
        std::cout << '\n';
        i = 0;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = k; _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            if(((i % 2) == 0)) {
                x [ i ]  = (2 * i);
            } else {
                x [ i ]  = ((2 * i) + 1);
            }

            i = (i + 1);
        }
        i = 0;
        std::cout << '{';
        if((0 < k)) {
            std::cout << x [ 0 ] ;for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = (k - 1); _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
                std::cout << ',';
                std::cout << x [ i + 1 ] ;
                i = (i + 1);
            }
        }
        std::cout << '}';
        std::cout << '\n';
        return 0;
    }
