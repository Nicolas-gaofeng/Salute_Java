package src.basic.method;

/**
 * @author : zgf
 * @file : MethodArgs1.java
 * @brief : 形参实参
 */

public class MethodArgs1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);
    }

    public static void change(int number) {
        number = 200;
    }
}
