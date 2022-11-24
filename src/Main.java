import javax.swing.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tamano = 10; //numero par

        String[] emojis = {"🐙", "🐧", "🐢", "🐊"
                , "🦖", "🦕", "🦂", "🦄"
                , "🐿", "🐮", "🐭", "🐫"
                , "🐯", "🦇", "🐏", "🐒"
                , "🦛", "🐂", "🦥", "🐻"
                , "🐺", "🐼", "💑", "🧟"
                , "🎅", "🫀", "🧠", "💩"
                , "👻", "👿", "🥺", "🥵"
                , "😛", "🤑", "🤣", "😉"
                , "♿", "🚫", "🚸", "🔝"
                , "🛐", "☮", "🔰", "🔱"
                , "⚜", "🔟", "⚫", "🟤"
                , "🟥", "🚩"};

        int cuantos = tamano * tamano / 2;

        String[][] tablero = new String[tamano][tamano];

        boolean[][] acertada = new boolean[tamano][tamano];

        for (int i = 0; i < cuantos; i++) {
            for (int j = 0; j < 2; j++) {
                for (; ; ) {
                    int f1 = random.nextInt(tamano);
                    int c1 = random.nextInt(tamano);

                    if (tablero[f1][c1] == null) {
                        tablero[f1][c1] = emojis[i];
                        break;
                    }
                }
            }
        }


//        for (int i = 0; i < tamano; i++) {
//            for (int j = 0; j < tamano; j++) {
//                System.out.print(tablero[i][j]);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print("🌊");
            }
            System.out.println();
        }

        for (; ; ) {

            //if (completado){break;}
            int f1 = scanner.nextInt(), c1 = scanner.nextInt();
            int f2 = scanner.nextInt(), c2 = scanner.nextInt();

            if (tablero[f1][c1].equals(tablero[f2][c2])) {
                acertada[f1][c1] = true;
                acertada[f2][c2] = true;
            }

//            System.out.print("\033[H\033[2J");
//            System.out.flush();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    if (acertada[i][j]) {
                        System.out.print(tablero[i][j]);
                    } else if (i == f1 && j == c1) {
                        System.out.print(tablero[i][j]);
                    } else if (i == f2 && j == c2) {
                        System.out.print(tablero[i][j]);
                    } else {
                        System.out.print("\uD83C\uDF0A");
                    }
                }
                System.out.println();
            }


        }

    }
}
