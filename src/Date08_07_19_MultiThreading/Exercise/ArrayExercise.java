package com.rammohan.IIMT_SUMMER_TRAINING.Basic.Day1.Date08_07_19_MultiThreading.Exercise;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.  of player");
        int number_of_player = sc.nextInt();

        String []player = new String[number_of_player];

        //Getting player name
        for (int i = 0; i <number_of_player ; i++) {
            int n = i+1;
            System.out.println("Enter player "+n+" " +
                    "Name" +
                    " : ");
            player[i] = sc.next();
        }
        System.out.println("Enter number of balls to be " +
                "played");
        // Getting no. of balls..
        int ball = sc.nextInt();

        int player_score[][] =
                new int[number_of_player][ball];
        int six[][] = new int[number_of_player][ball];

        int four[][] = new int[number_of_player][ball];

        int fourcount =0,sixCount =0;

        // Getting score for each palyer

        for (int i = 0; i <number_of_player ; i++) {
            for (int j = 0; j <ball ; j++) {
                System.out.println("Enter the runs for "+player[i]);
                player_score[i][j] = sc.nextInt();
            }

        }
        // Calculating fours and sixes
        for (int i = 0; i <number_of_player ; i++) {
            for (int j = 0; j <ball ; j++) {
                if (player_score[i][j] == 4){
                    fourcount++;
                    four[i][j] = fourcount;
                }

                if (player_score[i][j] == 6){
                    sixCount++;
                    six[i][j] = sixCount;
                }
            }

        }

        // Displaying the Result
        for (int i = 0; i <number_of_player ; i++) {
            //printing name of the player
            System.out.print(player[i]);

            System.out.print("\t");
            System.out.print("No . of Fours :");

            int fours =0;
            //no of four by player
            for (int j = 0; j <ball ; j++) {

                if (four[i][j] != 0){
                    fours++;
                }
            }
            System.out.print(fours);


            int sixes =0;
            System.out.print("\nNo of Sixes :");
            // no of six by player
            for (int j = 0; j <ball ; j++) {
                if (six[i][j] != 0){
                    sixes++;
                }

            }
            System.out.print(sixes);

            System.out.println();



        }


    }
}
