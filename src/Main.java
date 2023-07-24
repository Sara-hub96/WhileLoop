/*While Loop
        Write a while loop for our trading bot!
        The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
        It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
        It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
        On days where it sells, it can only sell 1000 pounds for euros.
        Write a while loop
        Use the calculation for exchange rate below
        1 + (Math.random() * 0.2);
        To recalculate our rate every day (once per loop)
        Print the number of days it takes for our bot to sell its pounds*/


public class Main {
    public static void main(String[] args) {

        int pounds = 10000;
        int day = 0;

        while(pounds > 0){
            double change = 1 + (Math.random() * 0.2);
            day++;
            if (change > 1.15){
                pounds-=1000;

            }
            System.out.println("The remain pounds are:" + pounds);
        }
        System.out.println("Days to sell all pounds:" + day);

    }
}