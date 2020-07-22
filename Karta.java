package GreenSoft;

public class Karta {
    private String name;
    //public int figure = 0; // 2,3,4,5,6,7,8,9,10,11,12,13,14
   public int value = 0; //10 - 10/jopek/dama/krol .... as = 11
    void setName(int figure)
    {
        switch (figure){
            case 2:
                this.name = "Dwa";
                break;
            case 3:
                this.name = "Trzy";
                break;
            case 4:
                this.name = "Cztery";
                break;
            case 5:
                this.name = "Piec";
                break;
            case 6:
                this.name = "Szesc";
                break;
            case 7:
                this.name = "Siedem";
                break;
            case 8:
                this.name = "Osiem";
                break;
            case 9:
                this.name = "Dziewiec";
                break;
            case 10:
                this.name = "Dziesiec";
                break;
            case 11:
                this.name = "Walet";
                break;
            case 12:
                this.name = "Dama";
                break;
            case 13:
                this.name = "Krol";
                break;
            case 14:
                this.name = "As";
                break;
        }
    }
    void setValue(int figure)
    {
        if((figure > 1) && (figure <= 14))
        {
            if (figure <= 10) {
                this.value = figure;
            }
            else if(figure == 11)
            {
                this.value = 10;
            }
            else if(figure == 12)
            {
                this.value = 10;
            }
            else if(figure == 13)
            {
                this.value = 10;
            }
            else if(figure == 14)
            {
                this.value = 11;
            }
        }
        else
        {
            System.out.println("There is no such card");
        }

    }
String showName() {return name;}


    Karta(int figure)
    {
        setValue(figure);
        setName(figure);
    }
}
