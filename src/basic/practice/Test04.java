package src.basic.practice;

/**
 * @author : zgf
 * @file : Test04.java
 * @brief : 不死神兔
 */

/*
 * 需求： 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子， 假如兔子都不死，问第二十个月的兔子对数为多少？
 * 
 * 思路： 1:为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
 * 2:因为第1个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素值也都是1 3:用循环实现计算每个月的兔子对数
 * 4:输出数组中最后一个元素的值，就是第20个月的兔子对数
 */
public class Test04 {
    public static void main(String[] args) {
        // 为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        int[] arr = new int[20];

        // 因为第1个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素值也都是1
        arr[0] = 1;
        arr[1] = 1;

        // arr[2] = arr[0] + arr[1];
        // arr[3] = arr[1] + arr[2];
        // arr[4] = arr[2] + arr[3];

        // 用循环实现计算每个月的兔子对数
        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
            /*
             * arr[2] = arr[0] + arr[1]; arr[3] = arr[1] + arr[2]; arr[4] = arr[2] + arr[3];
             * ...
             */
        }

        // 输出数组中最后一个元素的值，就是第20个月的兔子对数
        System.out.println("第二十个月兔子的对数是：" + arr[19]);
    }
}
