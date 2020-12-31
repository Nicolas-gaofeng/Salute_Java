package src.java.basic.processcontrol;

import java.util.Scanner;

/**
 * @author : zgf
 * @file : BranchingStructureIf.java
 * @brief : 分支结构
 */

public class BranchingStructureIf {
    public static void main(String[] args) {
//        格式 1
        System.out.println("开始");

        //定义两个变量
        int a = 10;
        int b = 20;

        //需求：判断a和b的值是否相等，如果相等，就在控制台输出：a等于b
        if (a == b) {
            System.out.println("a等于b");
        }

        //需求：判断a和c的值是否相等，如果相等，就在控制台输出：a等于c
        int c = 10;
        if (a == c) {
            System.out.println("a等于c");
        }

        System.out.println("结束");
//        格式 2
        System.out.println("开始");

        //定义两个变量
        int aa = 10;
        int bb = 20;
        bb = 5;

        //需求：判断a是否大于b，如果是，在控制台输出：a的值大于b，如果不是，在控制台输出：a的值不大于b
        if (aa > bb) {
            System.out.println("aa的值大于bb");
        } else {
            System.out.println("aa的值不大于bb");
        }

        System.out.println("结束");
//        格式 3
        System.out.println("开始");

        //需求：键盘录入一个星期数(1,2,...7)，输出对应的星期一，星期二，...星期日
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数(1-7)：");
        int week = sc.nextInt();

        if (week == 1) {
            System.out.println("星期一");
        } else if (week == 2) {
            System.out.println("星期二");
        } else if (week == 3) {
            System.out.println("星期三");
        } else if (week == 4) {
            System.out.println("星期四");
        } else if (week == 5) {
            System.out.println("星期五");
        } else if (week == 6) {
            System.out.println("星期六");
        } else {
            System.out.println("星期日");
        }

        System.out.println("结束");

        /*
	    奇偶数

	    需求：
		任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
        */
        //为了体现任意给出一个整数，采用键盘录入一个数据。(导包，创建对象，接收数据)
        Scanner scc = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int number = scc.nextInt();

        //判断整数是偶数还是奇数要分两种情况进行判断，使用if..else结构
        //判断是否偶数需要使用取余运算符实现该功能 number % 2 == 0
        //根据判定情况，在控制台输出对应的内容
        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "是奇数");
        }
        /*
	    考试奖励
	
	    需求：
		    小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，假如你可以控制小明的得分，
		    请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
		
	    奖励：
            95~100		山地自行车一辆
            90~94		游乐场玩一次
            80~89		变形金刚玩具一个
            80以下		胖揍一顿
        */
        //小明的考试成绩未知，可以使用键盘录入的方式获取值
        Scanner scd = new Scanner(System.in);

        System.out.println("请输入一个分数：");
        int score = scd.nextInt();

        //由于奖励种类较多，属于多种判断，采用if...else...if格式实现
        //为每种判断设置对应的条件
        //为每种判断设置对应的奖励
		/*
		if(score>=95 && score<=100) {
			System.out.println("山地自行车一辆");
		} else if(score>=90 && score<=94) {
			System.out.println("游乐场玩一次");
		} else if(score>=80 && score<=89) {
			System.out.println("变形金刚玩具一个");
		} else {
			System.out.println("胖揍一顿");
		}
		*/

        //数据测试：正确数据，边界数据，错误数据
        if (score > 100 || score < 0) {
            System.out.println("你输入的分数有误");
        } else if (score >= 95 && score <= 100) {
            System.out.println("山地自行车一辆");
        } else if (score >= 90 && score <= 94) {
            System.out.println("游乐场玩一次");
        } else if (score >= 80 && score <= 89) {
            System.out.println("变形金刚玩具一个");
        } else {
            System.out.println("胖揍一顿");
        }

    }
}
