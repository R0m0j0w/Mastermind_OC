package com.company.romz;

import java.util.InputMismatchException;
import java.util.Scanner;

class Interaction {
    //Attributes
    
    private int gameChoice;

    //Methods

    int GameChoice()
    {

        if (gameChoice > 3 || gameChoice < 1)
        {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("A quel Jeu souhaitez vous jouer ?");
                System.out.println("1 - Mode Challenger (Essayez de trouver la combinaison de l'Ordinateur");
                System.out.println("2 - Mode défenseur (Jouez contre l'Ordinateur qui doit trouver votre combinaison)");
                System.out.println("3 - Mode duel (Jouez une partie en Joueur contre Joueur en jouant tour a tour");

                gameChoice = sc.nextInt();

                }catch (InputMismatchException error) {
                System.out.println("Ceci n'est pas un chiffre !");
            }
        }
            return gameChoice;
        }

    void StartGame( int choice)
    {
        switch (choice)
        {

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

    //Guetters and Setters

    public int getGameChoice(){return gameChoice; }

    public void setGameChoice(int gameChoice){this.gameChoice = gameChoice;}
}