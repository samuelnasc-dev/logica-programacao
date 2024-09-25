#include <iostream>

int main(){

    int n1{ }, n2{ };
    std::cin >> n1 >> n2;
    std::cout << n1+n2 << "\n";
    std::cout << n1-n2 << "\n";
    std::cout << n1*n2 << "\n";
    printf("%.2f\n", n1/n2);
    std::cout << n1%n2 << "\n";

    return 0;
}