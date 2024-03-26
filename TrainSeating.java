import java.util.Scanner;

public class TrainSeating {

    public static void main(String[] args) {
        int rows = 5;
        char[] seats = {'A', 'B', 'C', 'D'};
        String[][] seatingGrid = initializeSeatingGrid(rows, seats);

        printSeatingGrid(seatingGrid);

        String selectedSeat = selectSeat();
        updateSeatingGrid(seatingGrid, selectedSeat);

        printSeatingGrid(seatingGrid);
    }

    private static String[][] initializeSeatingGrid(int rows, char[] seats) {
        String[][] grid = new String[rows][seats.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats.length; j++) {
                grid[i][j] = (i + 1) + "" + seats[j];
            }
        }
        return grid;
    }

    private static void printSeatingGrid(String[][] grid) {
        for (String[] row : grid) {
            for (String seat : row) {
                System.out.print(seat + "\t");
            }
            System.out.println();
        }
    }

    private static String selectSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seat you want to select (e.g., 2B): ");
        return scanner.nextLine();
    }

    private static void updateSeatingGrid(String[][] grid, String selectedSeat) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].equalsIgnoreCase(selectedSeat)) {
                    grid[i][j] = "X";
                }
            }
        }
    }
}


