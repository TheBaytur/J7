public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}

// Внешний цикл for отвечает за номер прохода,
// а внутренний - за поиск минимального значения в текущем проходе
// во внутреннем цикле начинаем искать минимальный элемент не с самого начала,
// а пропускаем уже найденные на предыдущем шаге элементы

// First Java