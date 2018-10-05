import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so hang: ");
        int row = scanner.nextInt();
        System.out.println("Nhap vao so cot: ");
        int collumn = scanner.nextInt();

        double[][] array = new double[row][collumn];

        //in ra 1 mang voi so hang va so cot nhap vao tu ban xphim
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collumn; j++) {
                System.out.println("Nhap vao phan tu thu [" + i + "][" + j + "] cho mang ");
                array[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collumn; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }


        Location location = Location.locateLargest(array);
        System.out.println("Vi tri cua phan tu lon nhat " + location.getMaxValue() + " la (" + location.getRow() + ", " + location.getCollumn() + ")");


    }
}
