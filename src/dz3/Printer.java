package dz3;
/*Сортировка слиянием

Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел,
реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

Пример
a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
*/

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] sortArr) {
        // Напишите свое решение ниже
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}


//Решение от ГБ
//import java.util.Arrays;
//
//class MergeSort {
//    public static int[] mergeSort(int[] a) {
//        int n = a.length;
//        if (n < 2) {
//            return a;
//        }
//        int mid = n / 2;
//        int[] l = new int[mid];
//        int[] r = new int[n - mid];
//
//        for (int i = 0; i < mid; i++) {
//            l[i] = a[i];
//        }
//        for (int i = mid; i < n; i++) {
//            r[i - mid] = a[i];
//        }
//        l = mergeSort(l);
//        r = mergeSort(r);
//
//        return merge(l, r);
//    }
//
//    public static int[] merge(int[] l, int[] r) {
//
//        int left = l.length;
//        int right = r.length;
//        int[] a = new int[left + right];
//        int i = 0, j = 0, k = 0;
//
//        while (i < left && j < right) {
//            if (l[i] <= r[j]) {
//                a[k++] = l[i++];
//            }
//            else {
//                a[k++] = r[j++];
//            }
//        }
//        while (i < left) {
//            a[k++] = l[i++];
//        }
//        while (j < right) {
//            a[k++] = r[j++];
//        }
//
//        return a;
//    }
//}
//
//public class Printer{
//    public static void main(String[] args) {
//        int[] a;
//
//        if (args.length == 0) {
//            a = new int[]{5, 1, 6, 2, 3, 4};
//        } else {
//            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        MergeSort answer = new MergeSort();
//        String itresume_res = Arrays.toString(answer.mergeSort(a));
//        System.out.println(itresume_res);
//    }
//}
