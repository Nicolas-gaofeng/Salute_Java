package src.java.basic.processcontrol;

import java.util.Scanner;

/**
 * @author : zgf
 * @file : BranchingStructureSwitch.java
 * @brief : 分支结构
 */

public class BranchingStructureSwitch {
    public static void main(String[] args) {
        System.out.println("开始");

        //需求：键盘录入一个星期数(1,2,...7)，输出对应的星期一，星期二，...星期日
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数(1-7)：");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的星期数有误");
                break;
        }

        System.out.println("结束");

        //键盘录入月份数据，使用变量接收
        Scanner sd = new Scanner(System.in);

        System.out.println("请输入一个月份：");
        int month = sd.nextInt();

        //多情况判断，这里采用switch语句实现
        //在每种情况中，完成输出对应的季节
		/*
		switch(month) {
			case 1:
				System.out.println("冬季");
				break;
			case 2:
				System.out.println("冬季");
				//break;
			case 3:
				System.out.println("春季");
				break;
			case 4:
				System.out.println("春季");
				break;
			case 5:
				System.out.println("春季");
				break;
			case 6:
				System.out.println("夏季");
				break;
			case 7:
				System.out.println("夏季");
				break;
			case 8:
				System.out.println("夏季");
				break;
			case 9:
				System.out.println("秋季");
				break;
			case 10:
				System.out.println("秋季");
				break;
			case 11:
				System.out.println("秋季");
				break;
			case 12:
				System.out.println("冬季");
				break;
			default:
				System.out.println("你输入的月份有误");
				//break;
		}
		*/

        //case穿透
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("你输入的月份有误");
        }
    }

}
