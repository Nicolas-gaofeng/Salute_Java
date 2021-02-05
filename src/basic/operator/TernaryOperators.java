package src.basic.operator;

/**
 * @author : zgf
 * @file : TernaryOperators.java
 * @brief : 三元运算符
 */

public class TernaryOperators {
    public static void main(String[] args) {
        // 定义两个变量
        int a = 10;
        int b = 20;

        // 获取两个数据中的较大值
        int max = a > b ? a : b;

        // 输出结果
        System.out.println("max:" + max);

        /*
         * 两只老虎
         * 
         * 需求： 动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg， 请用程序实现判断两只老虎的体重是否相同。
         */
        // 1：定义两个变量用于保存老虎的体重，单位为kg，这里仅仅体现数值即可。
        int weight1 = 180;
        int weight2 = 200;

        // 2：用三元运算符实现老虎体重的判断，体重相同，返回true，否则，返回false。
        boolean c = weight1 == weight2 ? true : false;

        // 3：输出结果
        System.out.println("c:" + c);

        /*
         * 三个和尚
         * 
         * 需求： 一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm， 请用程序实现获取这三个和尚的最高身高。
         */
        // 1：定义三个变量用于保存和尚的身高，单位为cm，这里仅仅体现数值即可。
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        // 2：用三元运算符获取前两个和尚的较高身高值，并用临时身高变量保存起来。
        int tempHeight = height1 > height2 ? height1 : height2;

        // 3：用三元运算符获取临时身高值和第三个和尚身高较高值，并用最大身高变量保存。
        int maxHeight = tempHeight > height3 ? tempHeight : height3;

        // 4：输出结果
        System.out.println("maxHeight:" + maxHeight);
    }
}
