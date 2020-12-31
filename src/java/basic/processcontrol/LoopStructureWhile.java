package src.java.basic.processcontrol;

/**
 * @author : zgf
 * @file : LoopStructureWhile.java
 * @brief : 循环结构 - while
 */

public class LoopStructureWhile {
    public static void main(String[] args) {
        //需求：在控制台输出5次"HelloWorld"
        //for循环实现
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------");

        //while循环实现
        int j = 1;
        while (j <= 5) {
            System.out.println("HelloWorld");
            j++;
        }

        //定义一个计数器，初始值为0
        int count = 0;

        //定义纸张厚度
        double paper = 0.1;

        //定义珠穆朗玛峰的高度
        int zf = 8844430;

        //因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
        //折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
        while (paper <= zf) {
            //循环的执行过程中每次纸张折叠，纸张的厚度要加倍
            paper *= 2;

            //在循环中执行累加，对应折叠了多少次
            count++;
        }

        //打印计数器的值
        System.out.println("需要折叠：" + count + "次");

    }
}
