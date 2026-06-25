import java.util.Random;
import java.util.Scanner;

void main() {

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    int aleatory= random.nextInt(10);
    int nUser;
    int tentativas = 0;

    System.out.println("Tente adivinhar um número de 1 até 10!");

    do{

        if(tentativas!=0)
            System.out.println("Você errou, tente novamente.");

        System.out.println("Digite o número abaixo:");

        nUser=scan.nextInt();
        tentativas+=1;
    }

    while(nUser!=aleatory);{

        if(tentativas==1)
            System.out.println("Parabéns você acertou de primeira!");

        else
            System.out.println("Parabéns você acertou após "+tentativas+" tentativas!");
    }
}