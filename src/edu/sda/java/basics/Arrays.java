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
    }
}
