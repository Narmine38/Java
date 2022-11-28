package Game;

import Personnages.Personnage;

import java.util.Arrays;

public class Board {
    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int[] getTest() {
        return test;
    }

    private int playerPosition;
    int[] test = new int[64];
    public void plateau() {
      for (int i =0; i < test.length; i++){

          if (playerPosition == i){
              System.out.print("***");
          }else {
              System.out.print("...");
          }
          System.out.print("|");

      }
        System.out.println(" ");

    }


}


