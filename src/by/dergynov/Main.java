package by.dergynov;

public class Main {

    public static void main(String[] args) {
        boolean theSameDice = false;
        System.out.println("Let's play dice!");
        Dice firstDice = new Dice();
        Dice secondDice = new Dice();
        int firstDiceVolume = firstDice.throwDice();
        int secondDiceVolume = secondDice.throwDice();
        if(firstDiceVolume==secondDiceVolume){
            System.out.println("Ups...! It's amassing!");
        }
        System.out.printf("Dices is %d:%d",firstDiceVolume, secondDiceVolume);

    }
}
