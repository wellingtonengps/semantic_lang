    #include <iostream>

    class Ponto
    {
        public:
            int x;
            int y;
    };


    void printP(Ponto* p) {
        std::cout << '(';
        std::cout << p->x;
        std::cout << ',';
        std::cout << p->y;
        std::cout << ')';
    }

    void printV(Ponto** v, int n) {
        int i;
        std::cout << '{';
        if((0 < n)) {
            printP(v [ 0 ] );i = 1;for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = (n - 1); _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
                std::cout << ',';
                printP(v [ i ] );
                i = (i + 1);
            }
        }
        std::cout << '}';
    }

    void sort(Ponto** v, int n) {
        Ponto* aux;
        int i;
        int j;
        i = 0;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = (n - 1); _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            j = (i + 1);
            for (int _Indice_Loop_2 = 0, _Indice_Loop_2_EndLoop = (n - (i + 1)); _Indice_Loop_2 < _Indice_Loop_2_EndLoop; _Indice_Loop_2++) {
                if((v [ i ] ->x < v [ j ] ->x)) {
                    aux = v [ i ] ;v [ i ]  = v [ j ] ;v [ j ]  = aux;
                }
                j = (j + 1);
            }
            i = (i + 1);
        }
    }

    int main() {
        int i;
        int k;
        Ponto** p;
        k = 5;
        p = new ();
        i = 0;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = k; _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            p [ i ]  = new ();
            p [ i ] ->x = (12 + i);
            p [ i ] ->y = (12 - i);
            i = (i + 1);
        }
        printV(p, k);
        sort(p, k);
        std::cout << '\n';
        printV(p, k);
        std::cout << '\n';
        return 0;
    }
