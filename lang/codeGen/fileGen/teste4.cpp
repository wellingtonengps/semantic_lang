    #include <iostream>

    class Ponto
    {
        public:
            float x;
            float y;
    };


    int main() {
        Ponto* p;
        p = new ();
        p->x = 10.0f;
        p->y = 10.0f;
        std::cout << '(';
        std::cout << p->x;
        std::cout << ',';
        std::cout << ' ';
        std::cout << p->y;
        std::cout << ')';
        std::cout << '\n';
        return 0;
    }
