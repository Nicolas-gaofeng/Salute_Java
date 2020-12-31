package src.java.basic.input;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : zgf
 * @file : DataRandom.java
 * @brief : Random数据输入
 */


public class DataRandom {
    public static void main(String[] args) {
        //创建对象
        Random d = new Random();
        //用循环获取10个随机数
        for (int i = 0; i < 10; i++) {
            //获取随机数
            int number = d.nextInt(10);
            System.out.println("number:" + number);
        }

        //需求：获取一个1-100之间的随机数
        int x = d.nextInt(100) + 1;
        System.out.println(x);

        //要完成猜数字的游戏，首先需要有一个要猜的数字，使用随机数生成该数字，范围1到100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            //使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘录入实现
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();

            //比较输入的数字和系统产生的数据，需要使用分支语句。这里使用if..else..if..格式，根据不同情况进行猜测结果显示
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}






