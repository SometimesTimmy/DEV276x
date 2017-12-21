import java.util.*;
public class MazeRunner {

    public static void main(String[] args) {
        Maze myMap = new Maze();
        intro(myMap);
        int moves = 0;
        while (!myMap.didIWin()) {
            String dir = userMove();
            if (myMap.isThereAPit(dir)) {
                myMap = navigatePit(myMap,dir);
                moves += 2;
                movesMessage(moves);
            } else {
                myMap = userMover(myMap,dir);
                moves++;
                movesMessage(moves);
            }
        }
        System.out.println("Congrats! You've made it through the maze!");
        System.out.println("and you did it in "+moves+" moves.");
    }
    public static void intro(Maze myMap) {
        // welcome the user into the program
        System.out.println("Welcome to Maze Runner! \"x\" represents your current position.\n");
        // and print the new map.
        myMap.printMap();
    }
    public static String userMove() {
        //take in desired direction of move, and check if that direction is valid and possible.
        System.out.print("Where would you like to move? (R, L, U, D): ");
        Scanner input0 = new Scanner(System.in);
        String dir = input0.next().toUpperCase();
        // continuously prompt the player for a valid direction
        if (dir.equals("R") || dir.equals("L") || dir.equals("U") || dir.equals("D")) {
            return dir;
        } else {
            while (!(dir.equals("R") || dir.equals("L") || dir.equals("U") || dir.equals("D"))) {
                System.out.println("Invalid Input");
                System.out.print("Where would you like to move? (R, L, U, D): ");
                dir = input0.next().toUpperCase();
            }
        }
        return dir;
    }

    public static Maze userMover(Maze myMap,String dir) {
        if (dir.equals("R") && myMap.canIMoveRight()) {
            myMap.moveRight();
            System.out.println("You move Right.");
        } else if (dir.equals("L") && myMap.canIMoveLeft()) {
            myMap.moveLeft();
            System.out.println("You move Left.");
        } else if (dir.equals("U") && myMap.canIMoveUp()) {
            myMap.moveUp();
            System.out.println("You move Up.");
        } else if (dir.equals("D") && myMap.canIMoveDown()) {
            myMap.moveDown();
            System.out.println("You move Down.");
        } else {
            System.out.println("Sorry, you've hit a wall.");
        }
        myMap.printMap();
        return myMap;
    }
    public static void movesMessage(int moves) {
        // print message after certain number of moves
        System.out.println("moves taken so far: "+moves);
        // count moves. if moves = 100,
        // tell the player they are out of moves and close the program.
        if (moves == 100) { // note that minimum is 36
            System.out.println("Oh no! You took too long to escape, " +
                    "and now the maze exit is closed FOREVER >:[\n");
            System.out.println("Sorry, but you didn't escape in time- you lose!\n");
        } else if (moves == 90) {
            System.out.println("DANGER! You have made 90 moves, " +
                    "you only have 10 moves left to escape!!\n");
        } else if (moves == 75) {
            System.out.println("Alert! You have made 75 moves, " +
                    "you only have 25 moves left to escape.");
        } else if (moves == 50) {
            System.out.println("Warning: You have made 50 moves, " +
                    "you have 50 remaining before the maze exit closes");
        }
    }
    public static Maze navigatePit(Maze myMap, String dir) {
        System.out.println("Watch out! There's a pit ahead, jump it? (Y or N): ");
        Scanner input0 = new Scanner(System.in);
        String jump = input0.next().toUpperCase();
        if (jump.startsWith("Y")) {
            myMap.jumpOverPit(dir);
            System.out.println("You have jumped over the pit. Jump counts as 2 moves.");
            myMap.printMap();
        } else {
            System.out.println("You have fell in the pit and lost. :(");
            System.exit(0); // close the program and quit.
        }
        return myMap;
    }
}
