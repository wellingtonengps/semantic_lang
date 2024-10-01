    #include <iostream>



    int f_retorno_00(int x) {
        int y;
        y = ((2 * x) + 1);
        if((y < 10)) {
            return y;
        } else {
            return y;
        }

    }

    float f_retorno_01(int x) {
        int y;
        y = ((2 * x) + 1);
        if((y < 10)) {
            return 1.5f;
        } else {
            return 1.5f;
        }

    }

    int main() {
        int h;
        float z;
        z = f_retorno_01(10);
        h = (2 * f_retorno_00(10));
        return 0;
    }
