
import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter size of array : ");
        int sizeOfArray = scanner.nextInt();
        if (sizeOfArray > 0) {
            double[] arrayPoint = new double[sizeOfArray];
            int i = 0;
            String check;
            do {
                System.out.printf("arr[%d] = ", i);
                arrayPoint[i] = scanner.nextDouble();
                i++;
                System.out.printf("Do you want continue? choose:  y/n : ");
                check = scanner.nextLine();
                check = scanner.nextLine();

            } while (i < arrayPoint.length && check.equals("y"));
            int count = 0;
            for (int x = 0; x < arrayPoint.length; x++) {
                if (arrayPoint[x] >= 5) {
                    count++;
                }
            }
            System.out.printf("%d students pass", count);
        }
    }
}
