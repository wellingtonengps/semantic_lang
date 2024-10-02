    #include <iostream>


    class Ponto
    {
        public:
            int x;
            int y;
    };

    int main() {
        int i;
        int k;
        Ponto** p;
        k = 5;
        p = new Ponto();
        i = 0;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = k; _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            p [ i ]  = new Ponto();
            p [ i ] ->x = (12 + i);
            p [ i ] ->y = (12 - i);
            i = (i + 1);
        }
        std::cout << p;
        std::cout << '\n';
        return 0;
    }
