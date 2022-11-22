import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int preguntas = scanner.nextInt();

        float[] valor = new float[preguntas];

        for (int i = 0; i < preguntas; i++) {
            valor[i] = scanner.nextInt();
        }


        int alumnos = scanner.nextInt();

        float[][] notas = new float[alumnos][preguntas];
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < preguntas; j++) {
                notas[i][j] = scanner.nextInt();
            }
        }


        float[][] puntuacion = new float[alumnos][preguntas];
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < preguntas; j++) {
                puntuacion[i][j] = notas[i][j] / valor[j];
            }
        }

        float[] totales = new float[alumnos];
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < preguntas; j++) {
                totales[i] += puntuacion[i][j];
            }
        }

        float max = Integer.MIN_VALUE;
        for (int i = 0; i < alumnos; i++) {
            if (totales[i]>max){
                max = totales[i];
            }
        }
        System.out.println(max);










    }
}