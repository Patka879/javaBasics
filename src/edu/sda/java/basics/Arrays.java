package edu.sda.java.basics;

public class Arrays {

    public static void main(String[] args) {
        String[] stringTable = new String[3];
        stringTable[0] = "Pies";
        stringTable[1] = "Kot";
        stringTable[2] = "Ryba";
        System.out.print(stringTable);

        String[] anotherTable = new String[]{"Jakieś", "Elementy", "Ustawione", "Do", "Tablicy"};
        System.out.println("======");
        System.out.println(anotherTable[3]);
        System.out.println("======");
        for (String s : anotherTable) {
            System.out.println(s);
        }
        System.out.println("======");
        for (int i = 0; i< anotherTable.length; i++) {
            System.out.println("index: " + i + " " + anotherTable[i]);
        }

        boolean[] boolTable = new boolean[4];
        boolTable[0] = true;
        boolTable[3] = true;

        for (int i = 0; i < boolTable.length; i++) {
            System.out.println("i = " + i + " " + boolTable[i]);
        }

        System.out.println("======");
        String[][] multidimensional = new String[2][3];
        multidimensional[0][0] = "Ala";
        multidimensional[0][1] = "Ma";
        multidimensional[0][2] = "Kota";

        multidimensional[1][0] = "Kot";
        multidimensional[1][1] = "Ma";
        multidimensional[1][2] = "Ale";

        for (int i = 0; i < multidimensional.length; i++) {
            for (int j = 0; j < multidimensional[i].length; j++) {
                System.out.print(multidimensional[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
