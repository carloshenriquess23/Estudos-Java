import java.util.Random;
import java.util.Scanner;

void main() {

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    int aleatorio=random.nextInt(1,11);
    System.out.println(aleatorio);
    int nUser=0;

    System.out.println("Tente adivinhar um número de 1 até 10!");
    System.out.println("Atenção, pois você tem apenas 5 tentativas.");

    for(int i=4;i>=0;i--){

        System.out.println("Digite um número abaixo:");
        nUser=scan.nextInt();

        if(nUser==aleatorio) {
            System.out.println("Parabéns, você acertou!");
            break;
        }

        else if(i==0)
            System.out.println("Você chegou ao número máximo de tentativas, o número correto era "+aleatorio);

        else
            System.out.println("Número errado, tente novamente. Tentativas restantes: "+i);
    }
}