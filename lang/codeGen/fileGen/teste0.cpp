    #include <iostream>



    int main() {
        int i;
        int nlines;
        nlines = 5;
        i = nlines;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = nlines; _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            for (int _Indice_Loop_2 = 0, _Indice_Loop_2_EndLoop = i; _Indice_Loop_2 < _Indice_Loop_2_EndLoop; _Indice_Loop_2++) {
                std::cout << '*';
            }
            i = (i - 1);
            std::cout << '\n';
        }
        return 0;
    }
