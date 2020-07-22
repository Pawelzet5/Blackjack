package GreenSoft;
import GreenSoft.Karta;

import java.util.Scanner;

public class BlackJack
{
    public int valueSum = 0;
    public int botValueSum = 0;
    public String hand = "Twoje karty to:";
    public String botHand = "Moje karty to:";
    public int deckAppearance[] = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    int getFigure()
    {
       int figure = (int)(Math.random() * (14 - 2 + 1) + 2);
       if(deckAppearance[figure - 2] > 3) {
           return getFigure();
       }
       else
       {
           deckAppearance[figure - 2] += 1;
           return figure;
       }
    }
       Karta getBotKarta()
    {
        Karta kartaBotNew = new Karta(getFigure());
        botValueSum = botValueSum + kartaBotNew.value;
        botHand = botHand + " " + kartaBotNew.showName() + ",";
        return kartaBotNew;
    }
        Karta getKarta()
        {
            Karta kartaNew = new Karta(getFigure());
            valueSum = valueSum + kartaNew.value;
            hand = hand + " " + kartaNew.showName() + ",";
            System.out.println("Twoja karta to: " + kartaNew.showName());
            return kartaNew;
        }
    void startGame()
    {
       getKarta();
       getKarta();
       showHand();
       System.out.println("Czy chcesz dobrac karte? t/n");
       Scanner input  = new Scanner(System.in);
       String choice = input.nextLine();
       while (choice.compareTo("nie")>0)
       {
               getKarta();
               showHand();
               if(valueSum > 21)
               {
                   System.out.println("Ha! Przegrałeś!");
                   choice = "n";
               }
           if(valueSum < 21)
           {
               System.out.println("Czy chcesz dobrac karte? t/n");
               input = new Scanner(System.in);
               choice = input.nextLine();
           }
       }
       botHand();
       getConclusion();
    }
    BlackJack()
    {
        startGame();
    }
    void showHand()
    {
        System.out.println(hand + " Suma: " + valueSum);
    }
    void showBotHand()
    {
        System.out.println(botHand + " Suma: " + botValueSum);
    }
    void botHand()
    {
        getBotKarta();
        getBotKarta();
        while(botValueSum < 16) {getBotKarta();}
        showBotHand();
    }
    void getConclusion()
    {
        if ((botValueSum <= 21)&&(valueSum <= 21))
        {
            if (botValueSum == valueSum) System.out.println("Niewiarygodne... Remis!");
            else if (botValueSum > valueSum) System.out.println("Ha! Wygrałem!");
            else if (botValueSum < valueSum)System.out.println("Gratulacje... Wygrałeś");
        }
        else if (botValueSum > 21)
        {
            if(valueSum > 21)
                {
                    System.out.println("Ja też przegrałem");
                }
            else if ( valueSum <=21)
                {
                    System.out.println("Udało Ci się!");
                }
        }
    }
}