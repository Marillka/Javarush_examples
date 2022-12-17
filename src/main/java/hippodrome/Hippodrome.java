package hippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    static Hippodrome game;

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        horses.forEach(Horse::move);
    }

    public void print() {
        horses.forEach(Horse::print);
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double distance = 0.0;
        Horse winnerHorse = null;
        for (Horse horse : horses) {
            if (horse.getDistance() > distance) {
                distance = horse.getDistance();
                winnerHorse = horse;
            }
        }
        return winnerHorse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException {
        List<Horse> horsesList = new ArrayList<>();
        horsesList.add(new Horse("Chernish", 3, 0));
        horsesList.add(new Horse("Belish", 3, 0));
        horsesList.add(new Horse("Riszhish", 3, 0));

        game = new Hippodrome(horsesList);

        game.run();
        game.printWinner();
    }
}


