#include <iostream>

int main() {

    float n1{}, n2{}, n3{}, n4{}, media{};
    std::cin >> n1 >> n2 >> n3 >> n4;

    media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;

    printf("Media: %.1f\n", media);

    if(media >= 7.0) std::cout << "Aluno aprovado." << "\n";
    else if(media < 5) std::cout << "Aluno reprovado." << "\n";
    else {
        std::cout << "Aluno em exame." << "\n";
        std::cin >> n1;
        printf("Nota do exame: %.1f\n", n1);
        media = (media + n1) / 2;
        if(media >= 5.0) std::cout << "Aluno aprovado." << "\n";
        else if(media < 5) std::cout << "Aluno reprovado." << "\n";
        printf("Media final: %.1f\n", media);
    }

    return 0;
}