/**
 * Created by cjz on 2017/6/2.
 */
public class SelectSort {

    public static void selectionSort(int[] array) {
        int length = array.length;
        int i,j;
        int minIndex, minValue, temp;

        for (i = 0; i < length - 1; i++) {
            minIndex = i;
            minValue = array[minIndex];
            for (j = i + 1; j < length; j++) {
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[minIndex];
                }
            }
            // 交换位置
            temp = array[i];
            array[i] = minValue;
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = {15,6,6,10,6,5,6,3,1,6,7,6,2,8,6};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.print(element+" ");
        }

        selectionSort(array);

        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.print(element+" ");
        }

    }
}
