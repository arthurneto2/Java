package exemplos.iniciais;

import java.util.Scanner;

public class SensoAcademia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int quantidadeAlunos = 0;
        double altura, peso;
        int maisAlto = 0, maisBaixo = 0, maisPesado = 0, maisLeve = 0;
        double alturaMaisAlto = 0, alturaMaisBaixo = 0, pesoMaisPesado = 0, pesoMaisLeve = 0;
        do {
            System.out.println("Digite o codigo do aluno [0 para sair]: ");
            codigo = scanner.nextInt();
            if (codigo == 0){
                break;
            }
            System.out.println("Digite a sua Altura: ");
            altura = scanner.nextDouble();
            System.out.println("Digite a sua Peso: ");
            peso = scanner.nextDouble();

            if (quantidadeAlunos == 0){
                alturaMaisAlto = alturaMaisBaixo = altura;
                pesoMaisPesado = pesoMaisLeve = peso;
                maisAlto = maisBaixo = maisPesado = maisLeve = codigo;
            }else {
                if (altura >= alturaMaisAlto){
                    alturaMaisAlto = altura;
                    maisAlto = codigo;
                }
                if (altura < alturaMaisBaixo){
                    alturaMaisBaixo = altura;
                    maisBaixo = codigo;
                }
                if (peso >= pesoMaisPesado){
                    pesoMaisPesado = peso;
                    maisPesado = codigo;
                }
                if (peso < pesoMaisLeve){
                    pesoMaisLeve = peso;
                    maisLeve = codigo;
                }
            }
            quantidadeAlunos++;
        }while (true);

        System.out.println("O aluno mais pesado é: " + maisPesado);
        System.out.println("O aluno mais leve é: " + maisLeve);
        System.out.println("O aluno mais alto é: " + maisAlto);
        System.out.println("O aluno mais baixo é: " + maisBaixo);



    }
}
