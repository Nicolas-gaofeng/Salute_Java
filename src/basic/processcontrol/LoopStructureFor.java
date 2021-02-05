package src.basic.processcontrol;

/**
 * @author : zgf
 * @file : LoopStructureFor.java
 * @brief : 循环结构 - for
 */

public class LoopStructureFor {
    public static void main(String[] args) {
        // 需求：在控制台输出5次"HelloWorld"
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("--------");

        // 用循环改进
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }

        // 需求：输出数据1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("--------");

        // 需求：输出数据5-1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // 求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;

        // 从1开始到5结束的数据，使用循环结构完成
        for (int i = 1; i <= 5; i++) {
            // 将反复进行的事情写入循环结构内部，此处反复进行的事情是将数据 i 加到用于保存最终求和的变量 sum 中
            sum += i;
            /*
             * sum += i; sum = sum + i; 第一次：sum = sum + i = 0 + 1 = 1; 第二次：sum = sum + i = 1
             * + 2 = 3; 第三次：sum = sum + i = 3 + 3 = 6; 第四次：sum = sum + i = 6 + 4 = 10;
             * 第五次：sum = sum + i = 10 + 5 = 15;
             */
        }

        // 当循环执行完毕时，将最终数据打印出来
        System.out.println("1-5之间的数据和是：" + sum);

        // 求1-100之间的偶数和，并把求和结果在控制台输出
        int sum1 = 0;

        // 对1-100的数据求和与1-5的数据求和几乎完全一样，仅仅是结束条件不同
        for (int i = 1; i <= 100; i++) {
            // 对1-100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数
            if (i % 2 == 0) {
                sum1 += i;
            }
        }

        // 当循环执行完毕时，将最终数据打印出来
        System.out.println("1-100之间的偶数和是：" + sum1);

        // 输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
        /*
         * for(int i=100; i<=999; i++) {
         * 
         * }
         */
        for (int i = 100; i < 1000; i++) {
            // 在计算之前获取三位数中每个位上的值
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            // 判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                // 输出满足条件的数字就是水仙花数
                System.out.println(i);
            }
        }

        // 定义变量count，用于保存“水仙花数”的数量，初始值为0
        int count = 0;

        // 输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
        for (int i = 100; i < 1000; i++) {
            // 在计算之前获取三位数中每个位上的值
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            // 在判定水仙花数的过程中，满足条件不再输出，更改为修改count的值，使count+1
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count++;
            }
        }

        // 打印输出最终结果
        System.out.println("水仙花共有：" + count + "个");

    }
}
