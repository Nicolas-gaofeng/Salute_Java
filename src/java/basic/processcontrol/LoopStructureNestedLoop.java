package src.java.basic.processcontrol;

/**
 * @author : zgf
 * @file : LoopStructureNestedLoop.java
 * @brief : 嵌套循环
 */

public class LoopStructureNestedLoop {
    public static void main(String[] args) {
        /*
		System.out.println("0时0分");
		System.out.println("0时1分");
		System.out.println("0时2分");
		System.out.println("0时3分");
		System.out.println("--------");
		System.out.println("1时0分");
		System.out.println("1时1分");
		System.out.println("1时2分");
		System.out.println("1时3分");
		System.out.println("--------");
		System.out.println("2时0分");
		System.out.println("2时1分");
		System.out.println("2时2分");
		System.out.println("2时3分");
		*/

        //循环改进
		/*
		for(int minute=0; minute<4; minute++) {
			System.out.println("0时" + minute + "分");
		}
		System.out.println("--------");

		for(int minute=0; minute<4; minute++) {
			System.out.println("1时" + minute + "分");
		}
		System.out.println("--------");

		for(int minute=0; minute<4; minute++) {
			System.out.println("2时" + minute + "分");
		}
		System.out.println("--------");
		*/

        //外循环控制小时的范围，内循环控制分钟的范围
		/*
		for(int hour=0; hour<3; hour++) {
			for(int minute=0; minute<4; minute++) {
				System.out.println(hour + "时" + minute + "分");
			}
			System.out.println("--------");
		}
		*/

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + "时" + minute + "分");
            }
            System.out.println("--------");
        }
    }
}
