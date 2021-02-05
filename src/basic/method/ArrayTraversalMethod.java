package src.basic.method;

/**
 * @author : zgf
 * @file : ArrayTraversalMethod.java
 * @brief : 数组遍历
 */

public class ArrayTraversalMethod {
    public static void main(String[] args) {
        // System.out.println("hello");
        // System.out.println("world");
        // System.out.print("hello");
        // System.out.print("world");
        // System.out.println();

        // 定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = { 11, 22, 33, 44, 55 };

        // 调用方法
        printArray(arr);
    }

    // 定义一个方法，用数组遍历通用格式对数组进行遍历
    /*
     * 两个明确： 返回值类型：void 参数：int[] arr
     */
    /*
     * public static void printArray(int[] arr) { for(int x=0; x<arr.length; x++) {
     * System.out.println(arr[x]); } }
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }
}
