import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string:");
        String inputString = scanner.nextLine();

        int[] frequenChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            frequenChar[ascii] += 1;
        }
        int max =0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequenChar[i] > max){
                max = frequenChar[i];
                character = (char) i;
            }
        }
    }
}
