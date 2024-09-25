#include <iostream>

int main(){

    float a, b;
    std::cin >> a >> b; 

    std::cout << (int)(a/b) << "\n";
    std::cout << (int)a%(int)b << "\n";
    printf("%.2f\n", a/b);

    return 0;
}