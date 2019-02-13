package com.company.romz;

import java.util.Scanner;

class Interaction {
    int gameChoice;
    private Scanner sc = new Scanner(System.in);

    int GameChoice() {
        System.out.println("A quel Jeu souhaitez vous jouer ?");
        System.out.println("1 - Mode Challenger (Essayez de trouver la combinaison de l'Ordinateur");
        System.out.println("2 - Mode défenseur (Jouez contre l'Ordinateur qui doit trouver votre combinaison)");
        System.out.println("3 - Mode duel (Jouez une partie en Joueur contre Joueur en jouant tour a tour");

        this.gameChoice = sc.nextInt();
        return gameChoice;
    }

    void StartGame(int choice) {
        switch (choice) {

            case 1:
                System.out.println("MODE CHALLENGER");
                System.out.println("---------------");
                break;

            case 2:
                System.out.println("MODE DEFENSEUR");
                System.out.println("--------------");
                break;

            case 3:
                System.out.println("MODE DUEL");
                System.out.println("---------");
                break;

            default:
                GameChoice();
        }

    }
}