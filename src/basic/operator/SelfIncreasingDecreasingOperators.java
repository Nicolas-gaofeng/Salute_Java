package src.java.basic.operator;

/**
 * @author : zgf
 * @file : SelfIncreasingDecreasingOperators.java
 * @brief : 自增自减运算符
 */


public class SelfIncreasingDecreasingOperators {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        System.out.println("i:" + i);

        //单独使用
        //i++;
        //++i;
        //System.out.println("i:" + i);

        //参与操作使用
        //int j = i++;
        int j = ++i;
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
