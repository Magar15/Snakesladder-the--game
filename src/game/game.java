
package game;

import java.util.Scanner;

public class game {
    public static void skipLine(int a) {     
        for (int i = 0; i < a; ++i) {
            System.out.println();
        }
    }

    public static void delayFunction(int lag) {
        try {
            Thread.sleep(lag);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        String player, player2, selectMode;
        System.out.println("Boas vindas ao Jogo da cobrinha");
        System.out.println("Arquivo com regras baixado na pasta do jogo...Leia");
        fileRuleTXT.ruleTXT("RegrasDoJogo.txt", "");

        System.out.print("Digite seu nickname do player 1: ");
        player = tecla.next();
        System.out.print("Digite seu nickname do player 2: ");
        player2 = tecla.next();

        System.out.println("Player 1 com o nickname de " + player + " salvo com sucesso");
        System.out.println("Player 2 com o nickname de " + player2 + " salvo com sucesso");
        System.out.println();
        System.out.println("Carregando...");

        System.out.println();

        //comando para criar uma delay de alguns segundos 
        delayFunction(1500);

        //metodo brasileiro de arrumar as coisas(limpar o console)
        skipLine(100);

        System.out.println("==== MENU ====");
        System.out.println("    easy");
        System.out.println("    medium");
        System.out.println("    hard");
        System.out.print("Digite o level que gostaria de jogar: ");
        selectMode = tecla.next();

        switch(selectMode){
            case "easy":
                break;
            case "medium":
                break;
            case "hard":
                break;
        }

    }


}
