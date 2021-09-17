package by.dergynov;

public class Main {

    public static void main(String[] args) {
        boolean theSameDiceVolume = false;
        System.out.println("Let's play dice!");
        Dice firstDice = new Dice();
        Dice secondDice = new Dice();
        int firstDiceVolume = firstDice.throwDice();
        int secondDiceVolume = secondDice.throwDice();
        if(firstDiceVolume==secondDiceVolume){
            theSameDiceVolume = true;
            System.out.println("OMG...! It's boring!");
        }
        System.out.printf("Dices is %d:%d",firstDiceVolume, secondDiceVolume);

    }
}
