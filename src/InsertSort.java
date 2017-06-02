/**
 * Created by pc on 2017/6/2.
 */
public class InsertSort {

    public static void main(String[] args) {

        int array[] = {15,6,6,10,6,5,6,3,1,6,7,6,2,8,6};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.print(element+" ");
        }

//        insertSort(array);
        binarySort(array);

        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.print(element+" ");
        }

    }

    /**
     * 直接插入排序
     * @param array
     */
    public static void insertSort(int[] array) {
        int length = array.length;
        int i,j,temp;

        for (i = 1; i < length; i++) {

            temp = array[i];                  // 从第二个元素开始排序
            for (j = i; j > 0; j--) {          // 从待排序元素开始往前寻找小于等于该元素的元素
                if (array[j - 1] > temp) {
                    array[j] = array[j - 1];
                } else {
                    array[j] = temp;            // 插入到合适的位置
                    break;
                }
            }
            if(j==0)
                array[j] = temp;
        }
    }


    /**
     * 二分搜索查找插入点
     * @param array
     * @param start
     * @param end
     * @param temp
     * @return
     */
    public static int binarySearch(int[] array, int start, int end, int temp) {
        int middle;
        while (start < end) {
            middle = (int) (start + end) / 2;
            if (temp >= array[middle]) {                                // 大于等于中间值
                if (middle + 1<= end && temp < array[middle + 1]) {     // 小于中间值后面的值
                    return middle + 1;
                } else {
                    start = middle + 1;
                }
            } else {                                                    // 小于中间值
                if (middle - 1 >= start && temp >= array[middle - 1]) { // 大于等于中间值前面的值
                    return middle;
                } else {
                    end = middle - 1;
                }
            }
        }

        return start;
    }

    /**
     * 二分查找插入排序
     * @param array
     */
    public static void binarySort(int[] array) {
        int length = array.length;
        int i,j,k,temp;
        for (i = 1; i < length; i++) {
            temp = array[i];
            if (temp >= array[i - 1]) {     // 待排序元素大于等于已排序的数组
                k = i;
            } else {
                k = binarySearch(array, 0, i - 1, temp);    // 二分查找插入点
                for (j = i; j > k; j--) {
                    array[j] = array[j - 1];
                }
                array[k] = temp;
            }
        }
    }
}
