

import java.util.Arrays; // можливо вам прийдеться прописати імпорт

public class Main {
    public static void main(String[] args) {
        System.out.println("(1)Базове копіювання");
        int[] numbers = {10, 20, 30, 40, 50};

        // Створи копію масиву
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        copyNumbers[1] = 24;

        // Виведи обидва масиви
        System.out.println("Оригінал: " + Arrays.toString(numbers));
        System.out.println("Копія: " + Arrays.toString(copyNumbers));


        //2. Копіювання через цикл
        System.out.println("(2)Копіювання через цикл");
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Створи новий масив такої самої довжини
        String[] copyFruits = new String[fruits.length];

        // Скопіюй вручну через цикл
        for (int i = 0; i < fruits.length; i++) {
            copyFruits[i] = fruits[i];
        }

        // Заміни "Banana" на "Blueberry" у копії
        // твій код тут
        copyFruits[1] = "Blueberry";
        // Виведи оригінал
        System.out.println("Оригінал:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Виведи копію
        System.out.println("Копія:");
        for (String fruit : copyFruits) {
            System.out.println(fruit);
        }
        System.out.println("(3)Часткове копіювання масиву");
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Копіюємо тільки перші 5 елементів
        int[] firstFive = Arrays.copyOf(values, 5);

        // Виводимо
        System.out.println(Arrays.toString(firstFive));
        System.out.println("(4)Копіювання з модифікацією елементів");
        int[] Numbers = {2, 5, 8, 11};

        int[] modified = new int[Numbers.length];
        int[] modified1 = new int[Numbers.length];

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] % 2 == 0) {
                // Якщо парне
                modified[i] = Numbers[i];
            } else {
                // Якщо непарне
                modified1[i] = Numbers[i];
            }


        }
        System.out.println("Парне" + Arrays.toString(modified));
        System.out.println("Не парне" + Arrays.toString(modified1));
        System.out.println("(5)Копіювання з модифікацією елементів");
        char[] letters = {'A', 'B', 'C', 'D'};

        // Прохід від останнього індексу до першого
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
    }
}
