// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10};
    static int[] array1 = {1, 2, 3, 3, 2, 6};
    static int[] array2 = {1, 2, 3, 3, 2, 1};
    static String[] str = {"I", "Love", "Java"};

    public static void main(String[] args) {
        bilet(array1);
        bilet(array2);
        inversareString(str);
        System.out.println("Media Aritmetica= " + mediaAritmetica());
        printNumImpare(array);
        printNumPare(array);
    }

    static void bilet(int[] array) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                s1 = s1 + array[i];
            } else {
                s2 = s2 + array[i];
            }
        }
        System.out.println();

        if (s1 == s2) {
            System.out.println("Bilet fericit");
        } else {
            System.out.println("Bilet nefericit");
        }
    }

    static void inversareString(String[] str) {

        System.out.println("Afisare in ordine inversa");
        for (int i = str.length - 1; i >= 0; i--) System.out.print(str[i] + " ");
        System.out.println();
    }

    static double mediaAritmetica() {
        int sum = 0;

        for (int j : array) {
            sum = sum + j;
        }


        return (double) sum / array.length;
    }

    static void printNumPare(int[] array) {

        for (int j : array) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }

    static void printNumImpare(int[] array) {

        for (int j : array) {
            if (j % 2 != 0) System.out.print(j + " ");
            System.out.println();
        }
    }
}


