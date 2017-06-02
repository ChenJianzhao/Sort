/**
 * Created by pc on 2017/6/2.
 */
public class ShellSort {

    public static void shellSort(int[] array) {

        int length = array.length;
        int gap = length / 2;                       // gap的一般初始值为length / 2;

        while (gap > 0) {
            for (int i = gap; i < length; i++) {    // 从gap开始往后对每组进行排序
                for (int j = i; 0 < j; j -= gap) {
                    if (j-gap>=0 && array[j - gap] > array[j]) {    // 同组内比较后交换
                        swap(array, j - gap, j);
                    } else {
                        break;
                    }
                }
            }
            gap = gap / 2;
        }
    }

    public static void  swap(int[] array, int i,int k) {
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

    public static void main(String[] args) {

        int array[] = {80, 93, 60, 12, 42, 30, 68, 85, 10};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.print(element+" ");
        }

        shellSort(array);

        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.print(element+" ");
        }

    }
}
