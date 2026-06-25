import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

void main() {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    ArrayList<ArrayList<Integer>> jogosPremiados = new ArrayList<>();
    ArrayList<ArrayList<Integer>> jogosUser= new ArrayList<>();
    int jogos=0;

    System.out.println("Bem vindo ao Console da virada 2.0!\n ------------------------------------------------------------");
    System.out.println("Nesta nova versão, tente acertar a quantidade de jogos que você quiser!");

    System.out.println("Digite abaixo a quantidade de jogos que deseja fazer:");
    jogos = sc.nextInt();
    System.out.println();

    //Usuário digitará os números para cada jogo
    for(int i=0;i<jogos;i++) {

        System.out.println("Digite os números do "+(i+1)+"º jogo.");

        ArrayList<Integer> numerosUser = new ArrayList<>();

        //Solicitando os números do jogo na posição correspondente
        for(int j=0;j<=4;j++) {

            System.out.print("Digite o "+(j+1)+"º número:");
            int number;

            do{

                number=sc.nextInt();

                if(number<1 || number>10)
                    System.out.println("Número inválido, digite novamente!");

                else if(numerosUser.contains(number))
                    System.out.println("Você já digitou este número, digite outro:");
            }
            while(numerosUser.contains(number) || (number<1 || number>10));

            numerosUser.add(number);
        }

        numerosUser.sort(null);
        jogosUser.add(numerosUser);
    }

    //Sorteio de cada jogo
    for(int i=0;i<jogos;i++){

        ArrayList<Integer> numerosPremiados= new ArrayList<>();

        //Sorteio de um jogo na posição correspondente
        for(int j=0;j<=4;j++){

            int number;

            do{

                number=rand.nextInt(1,11);
            }
            while(numerosPremiados.contains(number));

            numerosPremiados.add(number);
        }

        numerosPremiados.sort(null);
        jogosPremiados.add(numerosPremiados);
    }

    //Imprimindo os jogos e os acertos
    for(int i=0;i<jogos;i++){

        int acertos=0;
        ArrayList<Integer> jogoPremiado=jogosPremiados.get(i);
        ArrayList<Integer> jogoUser=jogosUser.get(i);

        System.out.println("O resultado do "+(i+1)+"º jogo foi: ");
        for(int j=0;j<=4;j++){

            System.out.print(jogoPremiado.get(j)+" ");

            if(jogoUser.contains(jogoPremiado.get(j)))
                acertos++;
        }

        System.out.println("O seu "+(i+1)+"º jogo foi: ");
        for(int j=0;j<=4;j++){

            System.out.print(jogoUser.get(j)+" ");
        }

        System.out.println("Você teve "+acertos+" acertos");
        System.out.println("------------------------------------------------------------");
    }
}