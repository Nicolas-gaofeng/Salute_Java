package src.basic.array;

/**
 * @author : zgf
 * @file : ArrayTest3.java
 * @brief : 数组
 */

public class ArrayTest3 {
    public static void main(String[] args) {
        // 定义两个数组
        int[] arr = new int[2];
        int[] arr2 = new int[3];

        // 分别输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);

        // 然后分别给数组中的元素赋值
        arr[1] = 100;
        arr2[0] = 200;
        arr2[2] = 300;

        // 分别再次输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[2]);
    }
}
