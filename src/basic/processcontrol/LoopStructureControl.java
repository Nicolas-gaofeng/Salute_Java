package src.basic.processcontrol;

/**
 * @author : zgf
 * @file : LoopStructureControl.java
 * @brief : 循环结构 - 控制跳转语句 break continue
 */

public class LoopStructureControl {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                // continue;
                break;
            }

            System.out.println(i);
        }
    }
}
