import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = 15;
        int height = 15;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i+j==((width+height)/2)-1) {
                    System.out.print("  O  ");
                } if (i==j) {
                    System.out.print("  O  ");
                } else {
                    System.out.print("  .  ");
                }
            }
            System.out.println();
        }
    }
}
