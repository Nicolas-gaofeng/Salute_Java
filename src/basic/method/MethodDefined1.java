package src.basic.method;

/**
 * @author : zgf
 * @file : MethodDefined1.java
 * @brief : 方法定义与调用
 */

public class MethodDefined1 {

    public static void main(String[] args) {
        // 调用方法
        isEvenNumber();
    }

    // 需求：定义一个方法，在方法中定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber() {
        // 定义变量
        int number = 10;
        number = 9;

        // 判断该数据是否是偶数
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
