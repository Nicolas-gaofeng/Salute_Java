package src.java.basic.processcontrol;

/**
 * @author : zgf
 * @file : LoopStructureDoWhile.java
 * @brief : 循环结构 - do - while
 */

public class LoopStructureDoWhile {
    public static void main(String[] args) {
        //需求：在控制台输出5次"HelloWorld"
        //for循环实现
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("--------");

        //do...while循环实现
        int j = 1;
        do {
            System.out.println("HelloWorld");
            j++;
        } while (j <= 5);

    }
}
