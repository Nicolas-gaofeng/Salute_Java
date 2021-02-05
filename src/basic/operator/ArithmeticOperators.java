package src.java.basic.operator;

/**
 * @author : zgf
 * @file : ArithmeticOperators.java
 * @brief : 算术运算符
 */


public class ArithmeticOperators {
    public static void main(String[] args) {
        //定义两个变量
        int a = 6;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        //除法得到的是商，取余得到是余数

        //整数相除只能得到整数，要想得到小数，必须有浮点数的参与
        System.out.println(6.0 / 4);

        //定义两个变量
        int i = 10;
        char c = 'A'; //'A'的值是65
        c = 'a'; //'a'的值是97
        c = '0'; //'0'的值是48
        System.out.println(i + c);

        //char ch = i + c;
        //char类型会被自动提升为int类型
        int j = i + c;
        System.out.println(j);

        //int k = 10 + 13.14;
        double d = 10 + 13.14;

        System.out.println("it" + "heima");
        System.out.println("itheima" + 666);
        System.out.println(666 + "itheima");

        System.out.println("itheima" + 6 + 66);
        System.out.println(1 + 99 + "itheima");
    }
}
