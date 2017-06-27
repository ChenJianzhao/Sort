/**
 * Created by cjz on 2017/6/3.
 */
public class HeapSort {

    /**
     * 从 index 开始检查并保持最大堆性质
     * @param array
     * @param index
     * @param heapSize
     */
    public static void maxHeapify(int[] array, int index, int heapSize) {
        int iMax = index,
            iLeft = 2 * index + 1,
            iRight = 2 * (index + 1);

        // 找出父节点和左右子节点中的最大值的下标
        if (iLeft < heapSize && array[index] < array[iLeft]) {
            iMax = iLeft;
        }
        if (iRight < heapSize && array[iMax] < array[iRight]) {
            iMax = iRight;
        }
        // 当父节点不是最大值时交换父节点和该子节点
        if (iMax != index) {
            swap(array, iMax, index);
            maxHeapify(array, iMax, heapSize); // 递归调整（交换父子节点后，可能会导致以子节点为根的子堆不是最大堆）
        }
    }


    /**
     * 从原始的数组中创建最大堆
     * @param array
     * @param heapSize
     */
    public static void buildMaxHeap(int[] array, int heapSize) {

        int iParent = (heapSize - 1) / 2; // 第一个需要进行最大堆调整的节点

        for (int i = iParent; i >= 0; i--) {
            maxHeapify(array, i, heapSize);
        }
    }

    /**
     * 堆排序（Heap-Sort）是堆排序的接口算法，
     * Heap-Sort先调用Build-Max-Heap将数组改造为最大堆
     * 然后将堆顶和堆底元素交换，之后将底部上升，最后重新调用Max-Heapify保持最大堆性质。
     * @param array
     * @param heapSize
     */
    public static void heapSort(int[] array, int heapSize) {
        buildMaxHeap(array, heapSize);
        for (int i = heapSize - 1; i > 0; i--) {
            swap(array, 0, i);
            maxHeapify(array, 0, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int array[] = {15,6,6,10,6,5,6,3,1,6,7,6,2,8,6};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.print(element+" ");
        }

        heapSort(array,array.length);

        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.print(element+" ");
        }

    }
}
