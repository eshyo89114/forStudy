package factorStudy.Strategy;

import myTools.*;

public class Main {
    public static void main(String[] args){
        int randomSeek1,randomSeek2;
        new printToWindow("Strategy模式 DEMO");

        randomSeek1=300;
        randomSeek2=202;

        Player player1,player2;
        player1 = new Player("张三",new WinningStrategy(randomSeek1));
        player2 = new Player("李四",new WinningStrategy(randomSeek2));

        for(int i = 0;i < 50 ; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if(nextHand1.isStrongerThan(nextHand2)){
                printToWindow.println("Winner:"+player1);
                player1.win();
                player2.lose();
            }else if(nextHand2.isStrongerThan(nextHand1)){
                printToWindow.println("Winner:"+player2);
                player2.win();
                player1.lose();
            }else{
                printToWindow.println("Even...");
                player1.even();
                player2.even();
            }
        }

        printToWindow.println("Total result:");
        printToWindow.println(player1.toString());
        printToWindow.println(player2.toString());

    }
}
