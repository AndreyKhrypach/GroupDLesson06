import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson06Program {
    public static void main(String[] args) {

//        String str1 = "Hello world";
//        String str2 = "Hello world";
//        String str3 = new String("Hello world");
//        char[] chars = str1.toCharArray();
//        System.out.println(Arrays.toString(chars));
//        String str4 = new String(chars);
//        System.out.println(str4);

//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));


//        int[][][] array3D = new int[5][6][7];
//
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value fo M: ");
        int m = scanner.nextInt();
        System.out.println("Enter value fo N: ");
        int n = scanner.nextInt();
        int[][] array2D1 = new int[m][n];
        int[][] array2D2 = new int[n][m];
        for (int i = 0; i < array2D1.length; i++) {
            for (int j = 0; j < array2D1[i].length; j++) {
                array2D1[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array2D1.length; i++) {
            System.out.println(Arrays.toString(array2D1[i]));
        }


//        int[][] manualArray2D = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
//        for (int i = 0; i < manualArray2D.length; i++) {
//            System.out.println(Arrays.toString(manualArray2D[i]));
//        }
//        int[] arr = new int[]{1, 2, 3, 4};
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < manualArray2D.length; i++) {
//            for (int j = 0; j < manualArray2D[i].length; j++) {
//                System.out.print(manualArray2D[i][j] + ", ");
//            }
//            System.out.println();
//        }

//        int[][] array2D = new int[8][5];
//        int array2dLength = array2D.length;
//        System.out.println(array2dLength);
//        System.out.println(array2D[0].length);

//        int[] manualArray1 = new int[]{1, 2, 3, 4, 5, 6};
//        int[] manualArray2 = manualArray1;
//        //int[] manualArray2 = new int[manualArray1.length];
////        for (int index = 0; index < manualArray1.length; index++) {
////            manualArray2[index] = manualArray1[index];
////        }
//
//        //System.arraycopy(manualArray1, 0, manualArray2, 0, manualArray1.length);
//        //int[] manualArray2 = Arrays.copyOf(manualArray1, manualArray1.length);
//        System.out.println(Arrays.toString(manualArray1));
//        System.out.println(Arrays.toString(manualArray2));
//
//        manualArray2[0] = 100;
//
//        System.out.println("________________");
//        System.out.println(Arrays.toString(manualArray1));
//        System.out.println(Arrays.toString(manualArray2));

        //reverse array
//        int[] manualArray = new int[]{1, 3, 2, 10, 5};
//        System.out.println(Arrays.toString(manualArray));
//
//        for (int index = 0; index < manualArray.length /2; index++) {
//            int temp = manualArray[index];
//            manualArray[index] = manualArray[manualArray.length - 1 - index];
//            manualArray[manualArray.length - 1 - index] = temp;
//        }
//        System.out.println(Arrays.toString(manualArray));
//
//
//
//        Random random = new Random();
//
//        int[] array = new int[10_000];
//        for (int index = 0; index < array.length; index++) {
//            array[index] = random.nextInt(1_000);
//        }
//
//        int keyElement = 87;
//        Arrays.sort(array);
//        int keyIndex = Arrays.binarySearch(array, keyElement);
//        System.out.println(keyIndex);

        // binary search
//        Arrays.sort(array);
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//
//        // умова зупинки
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            // якщо середній елемент - цільовий елемент, вернути його індекс
//            if (array[middleIndex] == keyElement) {
//                System.out.println(middleIndex);
//                break;
//            }
//
//            // якщо середній елемент менший
//            // прирівнюємо наш індекс в middle+1, прибираючи першу частину для перебирання
//            else if (array[middleIndex] < keyElement) {
//                firstIndex = middleIndex + 1;
//            }
//            // якщо середній елемент більший
//            // прирівнюємо наш індекс в middle-1, прибираючи другу частину для перебирання
//            else if (array[middleIndex] > keyElement) {
//                lastIndex = middleIndex - 1;
//            }
//        }


        //linear search
//        for (int index = 0; index < array.length; index++) {
//            if(array[index] == keyElement){
//                System.out.println(keyElement + " index = " + index);
//                break;
//            }
//        }

//        Random random = new Random();
//
//        int[] array = new int[100_000];
//        for (int index = 0; index < array.length; index++) {
//            array[index] = random.nextInt(10);
//        }
//
//        System.out.println(Arrays.toString(array));
//
//        long beforeTime = System.currentTimeMillis();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j > i ; j--) {
//                if(array[i] > array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        //Arrays.sort(array);
//        long afterTime = System.currentTimeMillis();
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(afterTime - beforeTime);
    }
}
