package ru.kpfu.itis.charntsev;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int[][] a = new int[4][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count;
                count++;
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}