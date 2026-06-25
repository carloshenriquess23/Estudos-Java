import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

void main() {

    Random random = new Random();
    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> numerosPremiados=new ArrayList<>();
    ArrayList<Integer> numerosUser= new ArrayList<>();
    int acertos=0;

    System.out.println("Bem vindo ao Console da virada.");

    System.out.println("Digite abaixo a sua aposta de jogo, com 5 números premiados!");

    for(int i=0; i<5;i++){

        System.out.println("Digite abaixo o "+(i+1)+"º número:");

        int number;

        do{

            number=scan.nextInt();

            if(number<1 || number>10)
                System.out.println("Número inválido, digite novamente!");

            else if(numerosUser.contains(number))
                System.out.println("Você já digitou este número, digite outro:");
        }
        while(numerosUser.contains(number) || number<1 || number>10);

        numerosUser.add(number);
    }

    for(int i=0; i<5;i++){

        int number;

        do{

            number=random.nextInt(1,11);
        }
        while(numerosPremiados.contains(number));

        numerosPremiados.add(number);
    }

    numerosUser.sort(null);
    numerosPremiados.sort(null);

    System.out.print("Os números sorteados foram: ");

    for (int i=0;i<numerosPremiados.size();i++) {

        System.out.print(numerosPremiados.get(i)+" ");

        if(numerosPremiados.contains(numerosUser.get(i)))
            acertos++;
    }

    System.out.print("\nSeu jogo foi: ");
    for(int numeroUser: numerosUser){

        System.out.print(numeroUser+" ");
    }
    System.out.println(" com "+acertos+" acertos");
}