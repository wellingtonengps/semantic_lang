    #include <iostream>



    int main() {
        int i;
        int k;
        int** x;
        int z;
        k = 5;
        x = new int*[k];
        i = 0;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = k; _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            x [ i ]  = new int[k];
            i = (i + 1);
        }
        i = 0;
        for (int _Indice_Loop_1 = 0, _Indice_Loop_1_EndLoop = k; _Indice_Loop_1 < _Indice_Loop_1_EndLoop; _Indice_Loop_1++) {
            x [ i ]  [ i ]  = ((2 * i) + 1);
            i = (i + 1);
        }
        z = x [ 3 ]  [ 3 ] ;
        return 0;
    }
