import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] distinctNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
        input.close();
    }
}