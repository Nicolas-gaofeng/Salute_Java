package src.basic.array;

/**
 * @author : zgf
 * @file : ArrayTraversal.java
 * @brief : 数组遍历
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = { 11, 22, 33, 44, 55 };

        // 使用通用的遍历格式
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}
