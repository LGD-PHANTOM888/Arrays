import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[10]; //00000000
        int size = 4;
        //Якщо потрібно збільшити розмір масиву
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int addElement = 7;
        int arraySize = arr.length + 1;
        int[] array_2 = new int[arraySize];
        for (int i = 0; i < arraySize - 1; i++) {
            array_2[i] = arr[i];
        }
        array_2[arraySize - 1] = addElement;
        System.out.println(Arrays.toString(array_2));
        // Додавання елементів
        arr[size] = 3;
        arr[2] = 5;
        arr[0] = 1;
        arr[3] = 7;
        // Вивід елементів
        System.out.println(Arrays.toString(arr));
        System.out.print("Початковий масив: " + Arrays.toString(arr));
        System.out.println();

        // Зміна елемента (індекс 1 на 10)
        arr[1] = 10;
        System.out.println("Масив після зміни елемента: " + Arrays.toString(arr));

        // Видалення елемента за індексом 2
        int indexToRemove = 2;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == indexToRemove) {
                arr[i] = 0;
            }
        }
        System.out.println("Масив після видалення елементу за індексом " + indexToRemove + ": " + Arrays.toString(arr));

        // Видалення дублікатів
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && arr[j] != 0) {
                        arr[j] = 0;
                    }
                }
            }
        }

        // Вивід прямий
        System.out.print("Масив прямий порядок: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Масив після змін і видалення дублікатів: " + Arrays.toString(arr));
        System.out.println();

        // Вивід зворотній
        System.out.print("Масив у зворотному порядку: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Перемішування
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        // Вивід після перемішування
        System.out.print("Масив після перемішування: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}