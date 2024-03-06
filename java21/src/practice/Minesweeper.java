package practice;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {//내가만든건 아니고 이런식으로 만들어주던데 내가 직접 만들어보기
    private static final int SIZE = 10;
    private static final int NUMBER_OF_MINES = 10;
    private static final char EMPTY = '.';
    private static final char MINE = '*';
    private static final char UNKNOWN = '⬜';

    public static void main(String[] args) {
        char[][] field = generateField(SIZE, NUMBER_OF_MINES);
        char[][] knownField = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                knownField[i][j] = UNKNOWN;
            }
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                printField(knownField);
                System.out.println("Enter your move (row and column): ");
                int row = scanner.nextInt();
                int column = scanner.nextInt();
                if (field[row][column] == MINE) {
                    System.out.println("You hit a mine! Game over!");
                    return;
                } else {
                    knownField[row][column] = EMPTY;
                }
            }
        }
    }

    private static void printField(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] generateField(int size, int numberOfMines) {
        char[][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = EMPTY;
            }
        }

        Random random = new Random();
        for (int i = 0; i < numberOfMines; i++) {
            int row, column;
            do {
                row = random.nextInt(size);
                column = random.nextInt(size);
            } while (field[row][column] == MINE);
            field[row][column] = MINE;
        }

        return field;
    }
}