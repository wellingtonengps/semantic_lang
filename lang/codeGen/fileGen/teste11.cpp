    #include <iostream>



    int main() {
        int i;
        int nlines;
        nlines = 5;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = nlines; _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            i = nlines;
            for (int _Indice_Loop_2 = 0, _Indice_Loop_2_EndLoop = i; _Indice_Loop_2 < _Indice_Loop_2_EndLoop; _Indice_Loop_2++) {
                std::cout << '*';
            }
            nlines = (nlines - 1);
            std::cout << '\n';
        }
        return 0;
    }
